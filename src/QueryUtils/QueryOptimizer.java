package QueryUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class QueryOptimizer {
    public List<String> projections;
    public List<BinaryOP> filtering;
    public List<String> tables;

    public QueryOptimizer(){
        this.projections = new ArrayList<>();
        this.filtering = new ArrayList<>();
        this.tables = new ArrayList<>();
    }
}
