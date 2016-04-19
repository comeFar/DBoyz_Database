package preprocessor;

import Symbols.*;
import accessmode.PhysicalBlockBuff;
import accessmode.SelectHandler;
import db_struct.DbInfo;
import output_generator.OutputGen;

import java.io.IOException;
import java.util.*;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class Planer {
    public SQLSegment sqlTree;
    public DbInfo dbInfo;
    public LinkedHashMap<String, SelectHandler> pool;

    public Planer(SQLSegment sqlTree){
        this.sqlTree = sqlTree;
        this.dbInfo = new DbInfo();
        this.pool = new LinkedHashMap<>();
    }

    public OutputGen run(){
        assert (Objects.equals(sqlTree.type, SQLSegment.GLOBAL_SCOPE));
        return executeSubSql(sqlTree);
    }

    public OutputGen executeSubSql(SQLSegment tree){
        OutputGen outputGen = null;
        for (SQLSegment sql: tree.getChild(SQLSegment.SUB_SQL)){
            assert (sql.subSqlType != null);
            if (sql.subSqlType.equals(SQLSegment.SELECT_SEG)) {
                assert (sql instanceof SelectStmt);
                outputGen = runSelect((SelectStmt) sql);
            } else if (sql.subSqlType.equals(SQLSegment.INSERT_SEG)) {
//                    runInsert();
            }
        }
        return outputGen;
    }

    private OutputGen runSelect(SelectStmt stmt){
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
                List<String> projectors = pool.get(tableName).projectors;
                if (!projectors.contains(s)){
                    projectors.add(s);
                }
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
            String leftTableName = dbInfo.getTableName(j.left);
            String rightTableName = dbInfo.getTableName(j.right);

            pool.get(leftTableName).joins.put(rightTableName+"."+j.right, leftTableName+"."+j.left);
            pool.get(rightTableName).joins.put(leftTableName+"."+j.left, rightTableName+"."+j.right);

            List<String> projectors = pool.get(leftTableName).projectors;
            if (!projectors.contains(j.left)){
                projectors.add(j.left);
            }
            projectors = pool.get(rightTableName).projectors;
            if (!projectors.contains(j.right)){
                projectors.add(j.right);
            }
        }

        SelectHandler next = getNextSelectHandler();
        while (next != null){
            try {
                if (next.joins.size() == 0){
                    PhysicalBlockBuff buff = next.getNextBlock();
                    PhysicalBlockBuff aggregateBuff = new PhysicalBlockBuff();
                    while (null != buff){
                        aggregateBuff.merge(buff);
                        buff = next.getNextBlock();
                    }
                    next.setProcessed(aggregateBuff, pool);
                }else{
                    for (String joinTable: next.joins.keySet()){
                        nestedBlockJoin(next, joinTable);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            next = getNextSelectHandler();
        }

        System.out.println("===================Done===================");

        HashMap<PhysicalBlockBuff, String> result = new HashMap<>();
        for (SelectHandler s: pool.values()){
            result.put(s.getIntermediateBuff(), "");
        }
        return new OutputGen(result, stmt.getChild(SQLSegment.SELECT_PROJECTOR_SEG));
    }

    public void nestedBlockJoin(SelectHandler handler, String join) throws IOException {
        String joinTableName = join.split("\\.")[0];
        PhysicalBlockBuff buff1 = handler.getNextBlock();
        PhysicalBlockBuff aggregateBuff = new PhysicalBlockBuff();
        SelectHandler joinTable = pool.get(joinTableName);
        System.out.println("Join "+handler.getName() + " "+joinTableName);
        while (null != buff1) {
            PhysicalBlockBuff buff2;

            buff2 = joinTable.getNextNBlock(dbInfo.JOIN_BUFF_SIZE);
            while (buff2 != null) {
                aggregateBuff.merge(buff1.blockNestedLoopJoin(handler.joins.get(join), join, buff2));
                buff2 = joinTable.getNextNBlock(dbInfo.JOIN_BUFF_SIZE);
            }
            buff1 = handler.getNextBlock();
        }

        handler.setProcessed(aggregateBuff, pool);
        joinTable.setProcessed(aggregateBuff, pool);
        handler.joinedTables.add(joinTableName);
        joinTable.joinedTables.add(handler.getName());
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
