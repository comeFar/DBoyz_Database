package dbgen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class DbInfo {
    public int FILE_SIZE = 10 * 1024 * 1024;
    public int JOIN_BUFF_SIZE = 20;      // actual size = JOIN_BUFF_SIZE * FILE_SIZE
    public String TPC_DIR = "tpc";
    public String DB_DIR = "DB";
    public String COL_DB_DIR = DB_DIR + "/" + "column_based";
    public String ROW_DB_DIR = DB_DIR + "/" + "row_based";

    public List<String> PART_TABLE_ATTRS = Arrays.asList(
            "P_PARTKEY int", "P_NAME char", "P_MFGR char", "P_BRAND char", "P_TYPE char", "P_SIZE int",
            "P_CONTAINER char", "P_RETAILPRICE int", "P_COMMENT char"
    );
    public List<String> SUPPLIER_TABLE_ATTRS = Arrays.asList(
            "S_SUPPKEY int", "S_NAME char", "S_ADDRESS char", "S_NATIONKEY int", "S_PHONE char", "S_ACCTBAL int", "S_COMMENT char"
    );
    public List<String> PARTSUPP_TABLE_ATTRS = Arrays.asList(
            "PS_PARTKEY int", "PS_SUPPKEY int", "PS_AVAILQTY int", "PS_SUPPLYCOST int", "PS_COMMENT char"
    );
    public List<String> CUSTOMER_TABLE_ATTRS = Arrays.asList(
            "C_CUSTKEY int", "C_NAME char", "C_ADDRESS char", "C_NATIONKEY int", "C_PHONE char", "C_ACCTBAL int",
            "C_MKTSEGMENT char", "C_COMMENT char"
    );
    public List<String> ORDERS_TABLE_ATTRS = Arrays.asList(
            "O_ORDERKEY int", "O_CUSTKEY int", "O_ORDERSTATUS char", "O_TOTALPRICE int", "O_ORDERDATE date",
            "O_ORDERPRIORITY char", "O_CLERK char", "O_SHIPPRIORITY int", "O_COMMENT char"
    );
    public List<String> LINEITEM_TABLE_ATTRS = Arrays.asList(
            "L_ORDERKEY int", "L_PARTKEY int", "L_SUPPKEY int", "L_LINENUMBER int", "L_QUANTITY int",
            "L_EXTENDEDPRICE int", "L_DISCOUNT int", "L_TAX int", "L_RETURNFLAG char",
            "L_LINESTATUS char", "L_SHIPDATE date", "L_COMMITDATE date", "L_RECEIPTDATE date",
            "L_SHIPINSTRUCT char", "L_SHIPMODE char", "L_COMMENT char"
    );
    public List<String> NATION_TABLE_ATTRS = Arrays.asList(
            "N_NATIONKEY int", "N_NAME char", "N_REGIONKEY int", "N_COMMENT char"
    );
    public List<String> REGION_TABLE_ATTRS = Arrays.asList(
            "R_REGIONKEY int", "R_NAME char", "R_COMMENT char"
    );
    public Map<String, List<String>> TABLE_NAMES = new HashMap<String, List<String>>(){{
        put("part", PART_TABLE_ATTRS);
        put("supplier", SUPPLIER_TABLE_ATTRS);
        put("partsupp", PARTSUPP_TABLE_ATTRS);
        put("customer", CUSTOMER_TABLE_ATTRS);
        put("orders", ORDERS_TABLE_ATTRS);
        put("lineitem", LINEITEM_TABLE_ATTRS);
        put("nation", NATION_TABLE_ATTRS);
        put("region", REGION_TABLE_ATTRS);
    }};

    public Map<String, Table> TABLES;

    public DbInfo() {
        TABLES = new HashMap<>();
        for (Map.Entry<String, List<String>> entry: TABLE_NAMES.entrySet()){
            int index = 0;
            String tableName = entry.getKey();
            Table newTable = new Table(tableName);
            TABLES.put(tableName, newTable);

            List<String> attrs = entry.getValue();
            for (String s: attrs){
                String name = s.split(" ")[0].toLowerCase();
                String type = s.split(" ")[1];
                Attribute newAttr = new Attribute(name, type, index);
                newTable.attrs.put(name, newAttr);
                index++;
            }
        }
    }

    public class Table{
        String name;
        public Map<String, Attribute> attrs;
        int rowBasedSplitCount;
        int colBasedSplitCount;
        public Table(String name){
            this.name = name;
            this.attrs = new HashMap<>();
            this.rowBasedSplitCount = 0;
            this.colBasedSplitCount = 0;
        }
    }

    public class Attribute{
        public String name, type;
        public int offset;
        public Attribute(String name, String type, int offset){
            this.name = name;
            this.type = type;
            this.offset = offset;
        }
    }

    public String getTableName(String s){
        String header = s.split("_")[0];
        String result;

        switch (header.charAt(0)){
            case 'c':
                result = "customer";
                break;
            case 'l':
                result = "lineitem";
                break;
            case 'n':
                result = "nation";
                break;
            case 'o':
                result = "orders";
                break;
            case 'p':
                if (header.charAt(1) == 's'){
                    result = "partsupp";
                }else{
                    result = "part";
                }
                break;
            case 'r':
                result = "region";
                break;
            case 's':
                result = "supplier";
                break;
            default:
                System.out.println("Unknow table name\n");
                System.exit(-1);
                return null;
        }
        return result;
    }
}
