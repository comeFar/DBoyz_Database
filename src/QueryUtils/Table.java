package QueryUtils;

import dbgen.DbInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
            int count = 0;
            for (File listOfFile : listOfFiles) {
                String fileName = listOfFile.getName();

                FileReader fileReader;
                fileReader = new FileReader(dbInfo.ROW_DB_DIR + "\\" + name + "\\" + fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                StringBuilder buff = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    String[] attrs = line.split("\\|");
                    if (attrs.length != dbInfo.TABLES.get(name).attrs.size()){
//                        System.out.println("Bad Line in " + name + ": " + line);
                        continue;
                    }
                    if (filter(attrs)){
                        buff.append(project(attrs)).append('\n');
                    }
                }
                System.out.println(buff.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean filter(String[] attrs){
        for (Filter f: filters){
            String targetAttr = f.first;
            String value = f.second;
            String op = f.op;
            DbInfo.Attribute attrProperty = getAttrProperty(name, targetAttr);
            String dbValue = attrs[attrProperty.offset];

            if (attrProperty.type.equalsIgnoreCase("int")){
                int leftValue = Integer.parseInt(dbValue);
                int rightValue = Integer.parseInt(value);
                if ((op.equals("=") && (leftValue != rightValue))
                        || (op.equals(">") && (leftValue <= rightValue))
                        || (op.equals("<") && (leftValue >= rightValue))
                        || (op.equals(">=") && (leftValue < rightValue))
                        || (op.equals("<=") && (leftValue > rightValue))
                        || (op.equals("!=") && (leftValue == rightValue))){
                    return false;
                }
            }else if(attrProperty.type.equalsIgnoreCase("char")){
                String leftValue = dbValue;
                String rightValue = value.replaceAll("'", "");
                if ((op.equals("=") && (!leftValue.equals(rightValue)))
                        || (op.equals("!=") && leftValue.equals(rightValue))){
                    return false;
                }
            }
        }
        return true;
    }

    private String project(String[] attrs){
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

    private DbInfo.Attribute getAttrProperty(String tableName, String attr){
        return dbInfo.TABLES.get(tableName).attrs.get(attr);
    }
}
