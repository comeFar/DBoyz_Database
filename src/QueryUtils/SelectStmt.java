package QueryUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Yi on 4/14/2016.
 *
 */
public class SelectStmt {
    public SelectStmt parent;
    public ArrayList<SelectStmt> children;
    public List<String> tables;
    public List<BinaryOP> filters;
    public List<Projection> projections;

    static public String GLOBAL_SCOPE = "global";

    private String name;


    public boolean isGlobalScope(){
        return (Objects.equals(this.name, GLOBAL_SCOPE));
    }

    public SelectStmt(String name){
        this.children = new ArrayList<>();
        this.name = name;
        this.tables = new ArrayList<>();
        this.filters = new ArrayList<>();
        this.projections = new ArrayList<>();
    }
}
