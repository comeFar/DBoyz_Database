package QueryUtils;

import dbgen.DbInfo;

import java.io.*;
import java.util.*;

/**
 * Created by Yi on 4/15/2016.
 *
 */
public class Table {
    public String name;
    public List<Filter> filters;
    public List<Projection> projections;
    public List<Table> joinTables;

    private DbInfo dbInfo;

    public Table(String name){
        this.name = name;
        this.filters = new ArrayList<>();
        this.projections = new ArrayList<>();
        this.joinTables = new ArrayList<>();
        this.dbInfo = new DbInfo();
    }

    public void RB_run(){
        try {
            File folder = new File(dbInfo.ROW_DB_DIR + "\\" + name);
            File[] listOfFiles = folder.listFiles();

            assert listOfFiles != null;
            for (File listOfFile : listOfFiles) {
                String fileName = listOfFile.getName();

                FileReader fileReader;
                fileReader = new FileReader(dbInfo.ROW_DB_DIR + "\\" + name + "\\" + fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                StringBuilder buff = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.trim().isEmpty()){
                        continue;
                    }
                    String[] attrs = line.split("\\|");
                    if (attrs.length != dbInfo.TABLES.get(name).attrs.size()){
                        System.out.println("Bad Line in " + name + ": " + line);
                        continue;
                    }
                    if (RB_filter(attrs)){
                        buff.append(RB_project(attrs)).append('\n');
                    }
                }
                if (buff.length() != 0){
                    writeOutput(buff.toString(), "rowBase.out");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean RB_filter(String[] attrs){
        for (Filter f: filters){
            String targetAttr = f.first;
            String value = f.second;
            String op = f.op;
            DbInfo.Attribute attrProperty = getAttrProperty(name, targetAttr);
            String dbValue = attrs[attrProperty.offset];

            boolean res = cmp(dbValue, value, op, attrProperty.type);
            if (!res){
                return false;
            }
        }
        return true;
    }

    private String RB_project(String[] attrs){
        if (projections.size() == 0){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for(Projection p: projections){
            DbInfo.Attribute attrProperty = getAttrProperty(name, p.name);
            String dbValue = attrs[attrProperty.offset];
            builder.append(dbValue).append('|');
        }
        return builder.toString();
    }

    public void CB_run(){
        try {
            File folder = new File(dbInfo.COL_DB_DIR + "\\" + name);
            File[] listOfFiles = folder.listFiles();

            assert listOfFiles != null;
            for (File listOfFile : listOfFiles) {
                String fileName = listOfFile.getName();

                FileReader fileReader;
                fileReader = new FileReader(dbInfo.COL_DB_DIR + "\\" + name + "\\" + fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                Map<Integer, Projection> projectionMap = new HashMap<>();
                Map<Integer, Filter> filterMap = new HashMap<>();
                for (Projection p: projections){
                    DbInfo.Attribute attrProperty = getAttrProperty(name, p.name);
                    projectionMap.put(attrProperty.offset, p);
                }
                for (Filter f: filters){
                    DbInfo.Attribute attrProperty = getAttrProperty(name, f.first);
                    filterMap.put(attrProperty.offset, f);
                }

                int lineCount = 0;
                List<String> projectionBuff = new ArrayList<>();
                List<Integer> result = new ArrayList<>();
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.trim().isEmpty()){
                        continue;
                    }
                    if (filterMap.containsKey(lineCount)){
                        String[] values = line.split("\\|");
                        CB_filter(values, result);
                    }
                    if (projectionMap.containsKey(lineCount)){
                        projectionBuff.add(line);
                    }
                    lineCount++;
                }
                writeOutput(CB_project(result, projectionBuff), "colBase.out");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void CB_filter(String[] values, List<Integer> list){
        int index;
        for (index = 0; index < values.length; index++){
            boolean res = true;
            for (Filter f: filters){
                String targetAttr = f.first;
                String value = f.second;
                String op = f.op;
                DbInfo.Attribute attrProperty = getAttrProperty(name, targetAttr);
                String dbValue = values[index];

                res = cmp(dbValue, value, op, attrProperty.type);
                if (!res){
                    break;
                }
            }
            if (res){
                list.add(index);
            }
        }
    }

    private String CB_project(List<Integer> masks, List<String> buff){
        StringBuilder builder = new StringBuilder();
        for (String s: buff){
            String[] splits = s.split("\\|");
            if (filters.size() == 0){
                for (String s2: splits){
                    builder.append(s2).append('\n');
                }
            }else{
                for (int i: masks){
                    builder.append(splits[i]).append('\n');
                }
            }
        }
        return builder.toString();
    }

    private boolean cmp(String left, String right, String op, String type){
        if (type.equalsIgnoreCase("int")){
            int leftValue = Integer.parseInt(left);
            int rightValue = Integer.parseInt(right);
            if (((op.equals("=") || op.equals("==")) && (leftValue != rightValue))
                    || (op.equals(">") && (leftValue <= rightValue))
                    || (op.equals("<") && (leftValue >= rightValue))
                    || (op.equals(">=") && (leftValue < rightValue))
                    || (op.equals("<=") && (leftValue > rightValue))
                    || (op.equals("!=") && (leftValue == rightValue))){
                return false;
            }
        }else if(type.equalsIgnoreCase("char")){
            String leftValue = left;
            String rightValue = right.substring(1, right.length()-1);       //remove ' in the value
            if (((op.equals("=") || (op.equals("=="))) && (!leftValue.equals(rightValue)))
                    || (op.equals("!=") && leftValue.equals(rightValue))){
                return false;
            }
        }
        return true;
    }

    private DbInfo.Attribute getAttrProperty(String tableName, String attr){
        return dbInfo.TABLES.get(tableName).attrs.get(attr);
    }

    private void writeOutput(String s, String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        writer.println(s);
        writer.close();
    }
}
