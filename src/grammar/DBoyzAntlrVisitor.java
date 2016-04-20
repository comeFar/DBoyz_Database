package grammar;
import Symbols.*;
import preprocessor.Planer;

/**
 * Created by Yi on 4/12/2016.
 *
 */
public class DBoyzAntlrVisitor extends DBoyzSQLBaseVisitor<SQLSegment> {
    private Planer planer;

    private SelectStmt currentSelectScope;
    private SQLSegment currentScope;

    public DBoyzAntlrVisitor(){
        this.currentScope = new SQLSegment(SQLSegment.GLOBAL_SCOPE);
        this.planer = new Planer(currentScope);
        this.currentSelectScope = null;
    }

    public Planer getPlaner(){
        return this.planer;
    }

    @Override public SQLSegment visitSelect_stmt(DBoyzSQLParser.Select_stmtContext ctx){
        SelectStmt stmt = new SelectStmt();
        pushScope(stmt);
        pushSelectScope(stmt);

        visitChildren(ctx);

        popSelectScope();
        popScope();
        return null;
    }

    @Override public SQLSegment visitProjector(DBoyzSQLParser.ProjectorContext ctx){
        Projector p = new Projector(ctx);
        pushScope(p);

        visitChildren(ctx);

        popScope();
        return null;
    }

    @Override public SQLSegment visitTable_or_subquery(DBoyzSQLParser.Table_or_subqueryContext ctx){
        String tableName;

        if (ctx.table_name() != null){
            tableName = ctx.table_name().getText();
        }else{
            tableName = null;
        }

        SelectFrom t = new SelectFrom(tableName);
        pushScope(t);

        visitChildren(ctx);

        popScope();
        return null;
    }

    @Override public SQLSegment visitBinaryOP(DBoyzSQLParser.BinaryOPContext ctx){
        SQLSegment sqlSegment;
        if (ctx.expr(1).getChild(0) instanceof DBoyzSQLParser.Column_nameContext){
            sqlSegment = new Join(ctx.expr(0).getText(), ctx.expr(1).getText());
        }else{
            sqlSegment = new Filter(ctx.expr(0).getText(), ctx.binary_operator().getText(), ctx.expr(1));
        }
        pushScope(sqlSegment);

        visitChildren(ctx);
        if (sqlSegment instanceof Filter){
            Filter f = (Filter)sqlSegment;
            f.right.remove(0);
        }

        popScope();
        return null;
    }

    @Override public SQLSegment visitColumn_name(DBoyzSQLParser.Column_nameContext ctx){
        if (currentScope instanceof Projector){
            Projector p = (Projector) currentScope;
            p.columnNames.add(ctx.getText());
        }else if (currentScope instanceof Filter){
            Filter f = (Filter) currentScope;
            f.right.add(ctx.getText());
        }
        visitChildren(ctx);
        return null;
    }

    @Override public SQLSegment visitAny_name(DBoyzSQLParser.Any_nameContext ctx){
        if (ctx.any_name() == null){
            Identifier id = new Identifier(ctx.getText());
            pushScope(id);
            visitChildren(ctx);
            popScope();
        }else{
            visitChildren(ctx);
        }
        return null;
    }

    @Override public SQLSegment visitLiteral_value(DBoyzSQLParser.Literal_valueContext ctx){
        if (currentScope instanceof Filter){
            Filter f = (Filter) currentScope;
            f.right.add(ctx.getText());
        }

        currentScope.addChild(SQLSegment.IDENTIFIER, new Identifier(ctx.getText()));
        return null;
    }

    @Override public SQLSegment visitBinary_operator(DBoyzSQLParser.Binary_operatorContext ctx){
        currentScope.addChild(SQLSegment.IDENTIFIER, new Identifier(ctx.getText()));
        return null;
    }

    private void pushScope(SQLSegment stmt){
        SQLSegment parent = currentScope;
        currentScope = stmt;
        currentScope.parent = parent;
        parent.addChild(stmt.type, stmt);
    }

    private void popScope(){
        currentScope = currentScope.parent;
    }

    private void pushSelectScope(SelectStmt stmt){
        SelectStmt parent = currentSelectScope;
        currentSelectScope = stmt;
        currentSelectScope.parentSelectStmt = parent;
        if (parent != null){
            parent.addChild(stmt.type, stmt);
        }
    }

    private void popSelectScope(){
        currentSelectScope = currentSelectScope.parentSelectStmt;
    }
}
