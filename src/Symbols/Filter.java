package Symbols;

import grammar.DBoyzSQLParser;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class Filter extends SQLSegment{
    public String left, op;
    public List<String> right;
    public DBoyzSQLParser.ExprContext rightCtx;

    public Filter(String left, String op, DBoyzSQLParser.ExprContext ctx){
        super(SQLSegment.SELECT_FILTERING_SEG);
        this.left = left;
        this.op = op;
        this.right = new LinkedList<>();
        this.rightCtx = ctx;
    }
}
