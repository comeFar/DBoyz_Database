package grammar;
import QueryUtils.*;

import java.util.List;

/**
 * Created by Yi on 4/12/2016.
 *
 */
public class DBoyzAntlrVisitor extends DBoyzSQLBaseVisitor<String> {
    public QueryOptimizer optimizer;

    private SelectStmt currentSelectScope;

    public DBoyzAntlrVisitor(){
        this.optimizer = new QueryOptimizer();
        this.currentSelectScope = new SelectStmt(SelectStmt.GLOBAL_SCOPE);
        this.optimizer.selectStages.push(this.currentSelectScope.children);
    }

    @Override public String visitSimple_select_stmt(DBoyzSQLParser.Simple_select_stmtContext ctx){
        SelectStmt stmt = new SelectStmt("");
        pushScope(stmt);

        visitChildren(ctx);

        popScope();
        return null;
    }

    @Override public String visitProjection_clause(DBoyzSQLParser.Projection_clauseContext ctx){
        List<DBoyzSQLParser.Result_columnContext> projectionList = ctx.result_column();
        for (DBoyzSQLParser.Result_columnContext i: projectionList){
            currentSelectScope.projections.add(new Projection(visit(i), ""));
        }
        return null;
    }

    @Override public String visitTable_or_subquery(DBoyzSQLParser.Table_or_subqueryContext ctx){
        currentSelectScope.tables.put(ctx.getText(), new Table(ctx.getText()));
        return null;
    }

    @Override public String visitBinaryOP(DBoyzSQLParser.BinaryOPContext ctx){
        Filter op = new Filter(visit(ctx.expr(0)), visit(ctx.expr(1)), ctx.binary_operator().getText());
        if (ctx.expr(1).getChild(0) instanceof DBoyzSQLParser.Literal_valueContext){
            op.type = Filter.NORMAL;
        }else{
            op.type = Filter.JOIN;
        }
        currentSelectScope.filters.add(op);
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

    private void pushScope(SelectStmt stmt){
        SelectStmt parent = currentSelectScope;
        currentSelectScope = stmt;
        currentSelectScope.parent = parent;
        parent.children.add(currentSelectScope);
        optimizer.selectStages.push(currentSelectScope.children);
    }

    private void popScope(){
        currentSelectScope = currentSelectScope.parent;
    }
}
