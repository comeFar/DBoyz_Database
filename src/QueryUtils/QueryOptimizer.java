package QueryUtils;

import java.util.*;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class QueryOptimizer {
    public Stack<ArrayList<SelectStmt>> selectStages;

    public QueryOptimizer(){
        this.selectStages = new Stack<>();
    }

    public void execute(){
        while (!selectStages.empty()){
            ArrayList<SelectStmt> stage = selectStages.pop();
            if (stage.size() != 0){
                runStage(stage);
            }
        }
    }

    private void runStage(ArrayList<SelectStmt> stage){
        for (SelectStmt stmt: stage){
            runSelect(stmt);
        }
    }

    private void runSelect(SelectStmt stmt){
        System.out.println("=================Start===============");
        StringBuilder builder = new StringBuilder();
        for (Projection p: stmt.projections){
            builder.append(p.name).append(" ");
        }
        System.out.println("projections: " + builder.toString());

        builder = new StringBuilder();
        for (Map.Entry<String, Table> entry: stmt.tables.entrySet()){
            builder.append(entry.getKey()).append(" ");
        }
        System.out.println("tables: " + builder.toString());

        builder = new StringBuilder();
        for (Filter op: stmt.filters){
            builder.append(op.first).append(" ").append(op.op).append(" ").append(op.second).append(" ");
        }
        System.out.println("filters: " + builder.toString());

        attachFilters(stmt);
        attachProjections(stmt);
        attachJoinTables(stmt);

//        rowBasedSelect(stmt);
        colBasedSelect(stmt);
    }

    private void rowBasedSelect(SelectStmt stmt){
        for (Map.Entry<String, Table> entry: stmt.tables.entrySet()){
            entry.getValue().RB_run();
        }
    }

    private void colBasedSelect(SelectStmt stmt){
        for (Map.Entry<String, Table> entry: stmt.tables.entrySet()){
            entry.getValue().CB_run();
        }
    }

    private void attachFilters(SelectStmt stmt){
        for (Filter op: stmt.filters){
            if (op.type == Filter.NORMAL){
                String tableName = getTableName(op.first);
                if (stmt.tables.containsKey(tableName)){
                    stmt.tables.get(tableName).filters.add(op);
                }
            }
        }
    }

    private void attachProjections(SelectStmt stmt){
        for (Projection p: stmt.projections){
            String tableName = getTableName(p.name);
            if (stmt.tables.containsKey(tableName)){
                stmt.tables.get(tableName).projections.add(p);
            }else{
                System.out.println("Fatal error: " + p.name + " is not contained by any tables you specified");
                System.exit(-1);
            }
        }
    }

    private void attachJoinTables(SelectStmt stmt){
        for (Filter op: stmt.filters){
            if (op.type == Filter.JOIN){
                String tableName = getTableName(op.first);
                String joinName = getTableName(op.second);
                Table joinTable;
                if (stmt.tables.containsKey(joinName)){
                    joinTable = stmt.tables.get(joinName);
                }else{
                    joinTable = new Table(joinName);
                }

                if (stmt.tables.containsKey(tableName)){
                    stmt.tables.get(tableName).joinTables.add(joinTable);
                }else{
                    System.out.println("Fatal error: " + tableName + " is not contained by any tables you specified");
                    System.exit(-1);
                }
            }
        }
    }

    private String getTableName(String s){
        String header = s.split("_")[0];

        if (header.equalsIgnoreCase("c")){
            return "customer";
        }else if (header.equalsIgnoreCase("l")){
            return "lineitem";
        }else if (header.equalsIgnoreCase("n")){
            return "nation";
        }else if (header.equalsIgnoreCase("o")){
            return "orders";
        }else if (header.equalsIgnoreCase("p")){
            return "part";
        }else if (header.equalsIgnoreCase("ps")){
            return "partsupp";
        }else if (header.equalsIgnoreCase("r")){
            return "region";
        }else if (header.equalsIgnoreCase("s")){
            return "supplier";
        }else {
            System.out.println("Unknow table name\n");
            System.exit(-1);
            return null;
        }
    }
}
