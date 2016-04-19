package Symbols;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Yi on 4/16/2016.
 *
 */
public class SQLSegment{
    static public String GLOBAL_SCOPE = "global";
    static public String IDENTIFIER = "Identifier";
    static public String SUB_SQL = "Sub Sql";

    static public String SELECT_SEG = "Select";
    static public String SELECT_PROJECTOR_SEG = "Select Projector";
    static public String SELECT_FILTERING_SEG = "Select Filter";
    static public String SELECT_TABLE_SEG = "Select Table";
    static public String SELECT_JOIN_SEG = "Select Join";

    static public String INSERT_SEG = "Insert";

    public HashMap<String, ArrayList<SQLSegment>> children;
    public String type, subSqlType;
    public SQLSegment parent;
    public StringBuilder buff;

    public SQLSegment(String type){
        this.type = type;
        this.children = new HashMap<>();
        this.parent = null;
        this.subSqlType = null;
        buff = new StringBuilder();
    }

    public void addChild(String type, SQLSegment child){
        if (children.containsKey(type)){
            children.get(type).add(child);
        }else{
            ArrayList<SQLSegment> list = new ArrayList<>();
            list.add(child);
            children.put(type, list);
        }
    }

    public ArrayList<SQLSegment> getChild(String type){
        if (children.containsKey(type)){
            return children.get(type);
        }else{
            return new ArrayList<>();
        }
    }
}
