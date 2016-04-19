package Symbols;

import grammar.DBoyzSQLParser;
import java.util.ArrayList;

/**
 * Created by Yi on 4/14/2016.
 *
 */
public class Projector extends SQLSegment{
    public ArrayList<String> columnNames;
    public DBoyzSQLParser.ProjectorContext ctx;

    public Projector(DBoyzSQLParser.ProjectorContext ctx){
        super(SQLSegment.SELECT_PROJECTOR_SEG);
        this.columnNames = new ArrayList<>();
        this.ctx = ctx;
    }
}
