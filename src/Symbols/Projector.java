package Symbols;

import grammar.DBoyzSQLParser;
import output_generator.BuffIterator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

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

    public String next(LinkedHashMap<String, BuffIterator> itrs){
        if (columnNames.size() == 1){
            String s = itrs.get(columnNames.get(0)).next();
            return s;
        }
        return null;
    }

    public boolean hasNext(LinkedHashMap<String, BuffIterator> itrs){
        return itrs.get(columnNames.get(0)).hasNext();
    }
}
