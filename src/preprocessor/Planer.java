package preprocessor;

import Symbols.*;
import accessmode.BlockBuff;
import accessmode.SelectHandler;
import dbgen.DbInfo;

import java.io.IOException;
import java.util.*;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class Planer {
    public SQLSegment sqlTree;
    public DbInfo dbInfo;
    public HashMap<String, SelectHandler> pool;

    public Planer(SQLSegment sqlTree){
        this.sqlTree = sqlTree;
        this.dbInfo = new DbInfo();
        this.pool = new HashMap<>();
    }

    public void run(){
        assert (Objects.equals(sqlTree.type, SQLSegment.GLOBAL_SCOPE));
        executeSubSql(sqlTree);
    }

    public void executeSubSql(SQLSegment tree){
        for (SQLSegment sql: tree.getChild(SQLSegment.SUB_SQL)){
            assert (sql.subSqlType != null);
            if (sql.subSqlType.equals(SQLSegment.SELECT_SEG)) {
                assert (sql instanceof SelectStmt);
                runSelect((SelectStmt) sql);
            } else if (sql.subSqlType.equals(SQLSegment.INSERT_SEG)) {
//                    runInsert();
            }
        }
    }

    private void runSelect(SelectStmt stmt){
        executeSubSql(stmt);

        System.out.println("=================Select Start=================");
        stmt.printInfo();

        for (SQLSegment sqlSegment: stmt.getChild(SQLSegment.SELECT_TABLE_SEG)){
            Table t = (Table) sqlSegment;
            pool.put(t.name, new SelectHandler(t.name, dbInfo));
        }
        for (SQLSegment sqlSegment: stmt.getChild(SQLSegment.SELECT_PROJECTOR_SEG)){
            Projector p = (Projector) sqlSegment;
            for (String s: p.columnNames){
                String tableName = dbInfo.getTableName(s);
                if (!pool.containsKey(tableName)){
                    System.out.println("Fatal Error: tables you select from does not contain attr " + s);
                    System.exit(-1);
                }
                pool.get(tableName).projectors.add(s);
            }
        }
        for (SQLSegment sqlSegment: stmt.getChild(SQLSegment.SELECT_FILTERING_SEG)){
            Filter f = (Filter) sqlSegment;
            String tableName = dbInfo.getTableName(f.left);
            if (!pool.containsKey(tableName)){
                System.out.println("Fatal Error: tables you select from does not contain attr " + f.left);
                System.exit(-1);
            }
            pool.get(tableName).filters.add(f);
        }
        for (SQLSegment sqlSegment: stmt.getChild(SQLSegment.SELECT_JOIN_SEG)){
            Join j = (Join) sqlSegment;
            String tableName = dbInfo.getTableName(j.table1);

            pool.get(tableName).joins.add(tableName);

            tableName = dbInfo.getTableName(j.table2);
            pool.get(tableName).joins.add(tableName);
        }

        SelectHandler next = getNextSelectHandler();
        while (next != null){
            try {
                nestedBlockJoin(next);
            } catch (IOException e) {
                e.printStackTrace();
            }
            next = getNextSelectHandler();
        }
        System.out.println("Done\n");
    }

    public void nestedBlockJoin(SelectHandler handler) throws IOException {
        BlockBuff buff1 = handler.getNextBlock();
        for (String s: handler.joins){
            SelectHandler joinTable = pool.get(s);
            if (joinTable.isProcessed()){
                BlockBuff newBlockBuff = buff1.blockNestedLoopJoin(joinTable.intermediateResult);
                handler.setProcessed(newBlockBuff);
                joinTable.setProcessed(newBlockBuff);
                continue;
            }

            BlockBuff buff2 = joinTable.getNextNBlock(dbInfo.JOIN_BUFF_SIZE);
            BlockBuff aggregateBuff = new BlockBuff();
            while (buff2.buff.length() != 0){
                aggregateBuff.merge(buff1.blockNestedLoopJoin(buff2));
                buff2 = joinTable.getNextNBlock(dbInfo.JOIN_BUFF_SIZE);
            }
            joinTable.setProcessed(aggregateBuff);
            handler.setProcessed(aggregateBuff);
        }
    }

    private SelectHandler getNextSelectHandler(){
        SelectHandler next = null;
        for (SelectHandler s: pool.values()){
            if (s.isProcessed()){
                continue;
            }

            if (next == null){
                next = s;
            }else{
                if (s.filters.size() > next.filters.size()){
                    next = s;
                }
            }
        }
        return next;
    }
}
