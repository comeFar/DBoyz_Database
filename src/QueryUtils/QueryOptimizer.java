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
}
