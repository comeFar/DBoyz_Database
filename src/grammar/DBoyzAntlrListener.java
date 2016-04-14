package grammar;

import QueryUtils.*;

import java.util.List;

/**
 * Created by Yi on 4/11/2016.
 *
 */

public class DBoyzAntlrListener extends DBoyzSQLBaseListener {
    QueryOptimizer optimizer;

    public DBoyzAntlrListener(QueryOptimizer optimizer){
        this.optimizer = optimizer;
    }

    @Override public void enterProjection_clause(DBoyzSQLParser.Projection_clauseContext ctx){
        List<DBoyzSQLParser.Result_columnContext> projectionList = ctx.result_column();
        for (DBoyzSQLParser.Result_columnContext i: projectionList){
            optimizer.projections.add(i.expr().getText());
        }
    }

    @Override public void enterBinaryOP(DBoyzSQLParser.BinaryOPContext ctx){
        List<DBoyzSQLParser.ExprContext> list = ctx.expr();
        this.optimizer.filtering.add(new BinaryOP(ctx.getChild(0).getText(), ctx.binary_operator().getText(), ctx.getChild(2).getText()));
    }
}
