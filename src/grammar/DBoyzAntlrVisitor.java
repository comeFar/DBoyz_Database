package grammar;
import QueryUtils.BinaryOP;
import QueryUtils.QueryOptimizer;
import java.util.List;

/**
 * Created by Yi on 4/12/2016.
 *
 */
public class DBoyzAntlrVisitor extends DBoyzSQLBaseVisitor<String> {
    public QueryOptimizer optimizer;

    public DBoyzAntlrVisitor(){
        this.optimizer = new QueryOptimizer();
    }

    @Override public String visitProjection_clause(DBoyzSQLParser.Projection_clauseContext ctx){
        List<DBoyzSQLParser.Result_columnContext> projectionList = ctx.result_column();
        for (DBoyzSQLParser.Result_columnContext i: projectionList){
            optimizer.projections.add(visit(i));
        }
        return null;
    }

    @Override public String visitBinaryOP(DBoyzSQLParser.BinaryOPContext ctx){
        optimizer.filtering.add(new BinaryOP(visit(ctx.expr(0)), visit(ctx.expr(1)), ctx.binary_operator().getText()));
        return null;
    }

    @Override public String visitAny_name(DBoyzSQLParser.Any_nameContext ctx){
        if (ctx.IDENTIFIER() != null){
            return ctx.IDENTIFIER().getText();
        }else if (ctx.STRING_LITERAL() != null){
            return ctx.STRING_LITERAL().getText();
        }else if (ctx.keyword() != null){
            return ctx.keyword().getText();
        }else{
            return visit(ctx.any_name());
        }
    }

    @Override public String visitLiteral_value(DBoyzSQLParser.Literal_valueContext ctx){
        return ctx.getText();
    }
}
