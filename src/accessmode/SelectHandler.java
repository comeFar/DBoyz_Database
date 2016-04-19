package accessmode;

import Symbols.*;
import db_struct.DbInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Yi on 4/17/2016.
 *
 */
public class SelectHandler {
    public List<Filter> filters;
    public List<String> projectors;
    public HashMap<String, String> joins;

    private PhysicalBlockBuff intermediateResult;
    private DbInfo dbInfo;
    private boolean processed;
    private String name;
    private String folderName;
    private int numOfBlocks;
    private int blockIndex;


    public SelectHandler(String tableName, DbInfo dbInfo){
        this.name = tableName;
        this.folderName = dbInfo.ROW_DB_DIR + "/" + tableName + "/";
        filters = new ArrayList<>();
        projectors = new ArrayList<>();
        joins = new HashMap<>();
        this.dbInfo = dbInfo;
        processed = false;
        blockIndex = 0;
        intermediateResult = null;

        File folder = new File(folderName);
        File[] files = folder.listFiles();
        if (null != files){
            numOfBlocks = files.length;
        }else {
            numOfBlocks = 0;
        }
    }

    public String getName(){
        return this.name;
    }

    public PhysicalBlockBuff getIntermediateBuff(){
        return this.intermediateResult;
    }

    public void setProcessed(PhysicalBlockBuff physicalBlockBuff){
        this.intermediateResult = physicalBlockBuff;
        processed = true;
    }

    public boolean isProcessed(){
        return processed;
    }

    public PhysicalBlockBuff getNextNBlock(int number) throws IOException {
        if (isProcessed()){
            PhysicalBlockBuff buff = intermediateResult;
            intermediateResult = null;
            return buff;
        }

        int num = 0;
        PhysicalBlockBuff aggregateBuff = new PhysicalBlockBuff();
        PhysicalBlockBuff tmp;
        do {
            tmp = getNextBlock();
            aggregateBuff.merge(tmp);
            num++;
        }while((null != tmp) && (num < number));

        if (aggregateBuff.isEmpty()){
            return null;
        }else{
            return aggregateBuff;
        }
    }

    public PhysicalBlockBuff getNextBlock() throws IOException {
        if (isProcessed()){
            PhysicalBlockBuff buff = intermediateResult;
            intermediateResult = null;
            return buff;
        }

        if (blockIndex >= numOfBlocks){
            return null;
        }
        if (projectors.size() == 0){
            System.out.println("Table "+name+" has no projection and join, this means this table can be delete from your SQL sentence");
            return null;
        }
        System.out.println("Get next block for " + name);

        FileReader fileReader;
        fileReader = new FileReader(folderName + Integer.toString(blockIndex++));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        PhysicalBlockBuff physicalBlockBuff = new PhysicalBlockBuff();
        String line;
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
                RB_project(attrs, physicalBlockBuff);
            }
        }

        bufferedReader.close();
        return physicalBlockBuff;
    }

    private boolean RB_filter(String[] attrs){
        for (Filter f: filters){
            String targetAttr = f.left;
            String value = f.right.get(0);
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

    private void RB_project(String[] attrs, PhysicalBlockBuff physicalBlockBuff){
        for(String p: projectors){
            DbInfo.Attribute attrProperty = getAttrProperty(name, p);
            String dbValue = attrs[attrProperty.offset];
            physicalBlockBuff.addValue(name+"."+attrProperty.name, dbValue);
        }
    }

//    public void CB_run(){
//        try {
//            File folder = new File(dbInfo.COL_DB_DIR + "/" + name);
//            File[] listOfFiles = folder.listFiles();
//
//            assert listOfFiles != null;
//            for (File listOfFile : listOfFiles) {
//                String fileName = listOfFile.getName();
//
//                FileReader fileReader;
//                fileReader = new FileReader(dbInfo.COL_DB_DIR + "/" + name + "/" + fileName);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//                String line;
//                Map<Integer, Projector> projectionMap = new HashMap<>();
//                Map<Integer, Filter> filterMap = new HashMap<>();
//                for (Projector p: projectors){
//                    DbInfo.Attribute attrProperty = getAttrProperty(name, p.name);
//                    projectionMap.put(attrProperty.offset, p);
//                }
//                for (Filter f: filters){
//                    DbInfo.Attribute attrProperty = getAttrProperty(name, f.first);
//                    filterMap.put(attrProperty.offset, f);
//                }
//
//                int lineCount = 0;
//                List<String> projectionBuff = new ArrayList<>();
//                List<Integer> result = new ArrayList<>();
//                while ((line = bufferedReader.readLine()) != null) {
//                    if (line.trim().isEmpty()){
//                        continue;
//                    }
//                    if (filterMap.containsKey(lineCount)){
//                        String[] values = line.split("\\|");
//                        CB_filter(values, result);
//                    }
//                    if (projectionMap.containsKey(lineCount)){
//                        projectionBuff.add(line);
//                    }
//                    lineCount++;
//                }
//                writeOutput(CB_project(result, projectionBuff), "colBase.out");
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void CB_filter(String[] values, List<Integer> list){
//        int index;
//        for (index = 0; index < values.length; index++){
//            boolean res = true;
//            for (Filter f: filters){
//                String targetAttr = f.first;
//                String value = f.second;
//                String op = f.op;
//                DbInfo.Attribute attrProperty = getAttrProperty(name, targetAttr);
//                String dbValue = values[index];
//
//                res = cmp(dbValue, value, op, attrProperty.type);
//                if (!res){
//                    break;
//                }
//            }
//            if (res){
//                list.add(index);
//            }
//        }
//    }
//
//    private String CB_project(List<Integer> masks, List<String> buff){
//        StringBuilder builder = new StringBuilder();
//        for (String s: buff){
//            String[] splits = s.split("\\|");
//            if (filters.size() == 0){
//                for (String s2: splits){
//                    builder.append(s2).append('\n');
//                }
//            }else{
//                for (int i: masks){
//                    builder.append(splits[i]).append('\n');
//                }
//            }
//        }
//        return builder.toString();
//    }
//
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
