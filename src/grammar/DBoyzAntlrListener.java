package grammar;

/**
 * Created by Yi on 4/11/2016.
 *
 */

public class DBoyzAntlrListener extends DBoyzSQLBaseListener {
//    Planer planer;
//
//    public DBoyzAntlrListener(Planer planer){
//        this.planer = planer;
//    }
//
//    @Override public void enterProjection_clause(DBoyzSQLParser.Projection_clauseContext ctx){
//        List<DBoyzSQLParser.Result_columnContext> projectionList = ctx.result_column();
//        for (DBoyzSQLParser.Result_columnContext i: projectionList){
//            planer.projectors.add(i.expr().getText());
//        }
//    }
//
//    @Override public void enterBinaryOP(DBoyzSQLParser.BinaryOPContext ctx){
//        List<DBoyzSQLParser.ExprContext> list = ctx.expr();
//        this.planer.filtering.add(new Filter(ctx.getChild(0).getText(), ctx.binary_operator().getText(), ctx.getChild(2).getText()));
//    }
}
