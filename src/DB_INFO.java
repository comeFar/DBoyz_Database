import java.util.Arrays;
import java.util.List;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class DB_INFO {
    static int FILE_SIZE = 10 * 1024 * 1024;
    static String TPC_DIR = "tpc";
    static String DB_DIR = "DB";
    static String COL_DB_DIR = DB_DIR + "\\" + "column_based";
    static String ROW_DB_DIR = DB_DIR + "\\" + "row_based";

    static List<Attribute> PART_TABLE_ATTRS = Arrays.asList(new Attribute("P_PARTKEY", 0),
            new Attribute("P_NAME", 1),
            new Attribute("P_MFGR",2),
            new Attribute("P_BRAND",3),
            new Attribute("P_TYPE", 4),
            new Attribute("P_SIZE", 5),
            new Attribute("P_CONTAINER", 6),
            new Attribute("P_RETAILPRICE", 7),
            new Attribute("P_COMMENT", 8));

    static List<Attribute> SUPPLIER_TABLE_ATTRS = Arrays.asList(new Attribute("S_SUPPKEY", 0),
            new Attribute("S_NAME", 1),
            new Attribute("S_ADDRESS", 2),
            new Attribute("S_NATIONKEY", 3),
            new Attribute("S_PHONE", 4),
            new Attribute("S_ACCTBAL", 5),
            new Attribute("S_COMMENT", 6));

    static List<Attribute> PARTSUPP_TABLE_ATTRS = Arrays.asList(new Attribute("PS_PARTKEY", 0),
            new Attribute("PS_SUPPKEY", 1),
            new Attribute("PS_AVAILQTY", 2),
            new Attribute("PS_SUPPLYCOST", 3),
            new Attribute("PS_COMMENT", 4));

    static List<Attribute> CUSTOMER_TABLE_ATTRS = Arrays.asList(new Attribute("C_CUSTKEY", 0),
            new Attribute("C_NAME", 1),
            new Attribute("C_ADDRESS", 2),
            new Attribute("C_NATIONKEY", 3),
            new Attribute("C_PHONE", 4),
            new Attribute("C_ACCTBAL", 5),
            new Attribute("C_MKTSEGMENT", 6),
            new Attribute("C_COMMENT", 7));

    static List<Attribute> ORDERS_TABLE_ATTRS = Arrays.asList(new Attribute("O_ORDERKEY", 0),
            new Attribute("O_CUSTKEY", 1),
            new Attribute("O_ORDERSTATUS", 2),
            new Attribute("O_TOTALPRICE", 3),
            new Attribute("O_ORDERDATE", 4),
            new Attribute("O_ORDERPRIORITY", 5),
            new Attribute("O_CLERK", 6),
            new Attribute("O_SHIPPRIORITY", 7),
            new Attribute("O_COMMENT", 8));

    static List<Attribute> LINEITEM_TABLE_ATTRS = Arrays.asList(new Attribute("L_ORDERKEY", 0),
            new Attribute("L_PARTKEY", 1),
            new Attribute("L_SUPPKEY", 2),
            new Attribute("L_LINENUMBER", 3),
            new Attribute("L_QUANTITY", 4),
            new Attribute("L_EXTENDEDPRICE", 5),
            new Attribute("L_DISCOUNT", 6),
            new Attribute("L_TAX", 7),
            new Attribute("L_RETURNFLAG", 8),
            new Attribute("L_LINESTATUS", 9),
            new Attribute("L_SHIPDATE", 10),
            new Attribute("L_COMMITDATE", 11),
            new Attribute("L_RECEIPTDATE", 12),
            new Attribute("L_SHIPINSTRUCT", 13),
            new Attribute("L_SHIPMODE", 14),
            new Attribute("L_COMMENT", 15));

    static List<Attribute> NATIOIN_TABLE_ATTRS = Arrays.asList(new Attribute("N_NATIONKEY", 0),
            new Attribute("N_NAME", 1),
            new Attribute("N_REGIONKEY", 2),
            new Attribute("N_COMMENT", 3));

    static List<Attribute> REGION_TABLE_ATTRS = Arrays.asList(new Attribute("R_REGIONKEY", 0),
            new Attribute("R_NAME", 1),
            new Attribute("R_COMMENT", 2));


    static List<Table> TABLES = Arrays.asList(new Table("part.tbl", PART_TABLE_ATTRS),
            new Table("supplier.tbl", SUPPLIER_TABLE_ATTRS),
            new Table("partsupp.tbl", PARTSUPP_TABLE_ATTRS),
            new Table("customer.tbl", CUSTOMER_TABLE_ATTRS),
            new Table("orders.tbl", ORDERS_TABLE_ATTRS),
            new Table("lineitem.tbl", LINEITEM_TABLE_ATTRS),
            new Table("nation.tbl", NATIOIN_TABLE_ATTRS),
            new Table("region.tbl", REGION_TABLE_ATTRS));

    public static class Table{
        String name;
        List<Attribute> attrs;
        int rowBasedSplitCount;
        int colBasedSplitCount;
        public Table(String name, List<Attribute> attrs){
            this.name = name;
            this.attrs = attrs;
            this.rowBasedSplitCount = 0;
        }
    }
    public static class Attribute{
        String name;
        int offset;
        public Attribute(String name, int offset){
            this.name = name;
            this.offset = offset;
        }
    }
}
