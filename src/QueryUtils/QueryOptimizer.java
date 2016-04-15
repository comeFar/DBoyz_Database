package QueryUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        for (Projection p: stmt.projections){
            System.out.println("projections: " + p.name);
        }
        System.out.println("tables: " + stmt.tables);

        for (BinaryOP op: stmt.filters){
            System.out.println("filters: " + op.first + " " + op.op + " " + op.second);
        }

        rowBasedSelect(stmt);
        colBasedSelect(stmt);
    }

    private void rowBasedSelect(SelectStmt stmt){

    }

    private void colBasedSelect(SelectStmt stmt){

    }
}
