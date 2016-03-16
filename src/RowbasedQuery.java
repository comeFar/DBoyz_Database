import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowbasedQuery {
    public String[] targets;
    public String[] tables;
    public Map<String, String> conditions;

    public RowbasedQuery(String[] targets, String[] tables, Map<String, String> conditions) {
        this.targets = targets;
        this.tables = tables;
        this.conditions = conditions;
    }
    public void run(){
        //filtering
        List<String> filtered = new ArrayList<String>();
        for(String table : tables){
            filtered = filtering(table);
        }
        //projection
        projection(filtered);
    }
    //projection
    private void projection(List<String> filtered) {
        if(targets.length == 1 && targets[0].equals("*")){
            for(String line : filtered){
                System.out.println(line);
            }
        }else{
            List<Integer> recordPos = new ArrayList<Integer>();
            StringBuilder output = new StringBuilder();
            String header = filtered.get(0);
            String[] attributes = header.split(" ");
            String outputHead = "";
            //found target location column
            for(String target : targets){
                outputHead = outputHead + target + " ";
                for(int i=0; i<attributes.length; i++ ) {
                    if (target.equalsIgnoreCase(attributes[i])){
                        recordPos.add(i);
                    }
                }
            }
            output.append(outputHead+"\n");

            for(int i=1; i<filtered.size(); i++){
                String line = filtered.get(i);
                String[] words = line.split(" ");
                String outputRow = "";
                for(Integer j : recordPos){
                    outputRow = outputRow + words[j] + " ";
                }
                output.append(outputRow+"\n");
            }
            System.out.println(output.toString());
        }
    }

    //filtering
    private List<String> filtering(String tableName)
    {
        List<String> records = new ArrayList<String>();
        Map<Integer, String> colMap = new HashMap<Integer, String>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(tableName));
            String line;
            String header = reader.readLine();
            header = header.toLowerCase();
            records.add(header);
            String[] attributes = header.split(" ");
            if(conditions.size() == 0){
                while ((line = reader.readLine()) != null)
                {
                    records.add(line);
                }
            }else {
                for (String key : conditions.keySet()) {
                    for (int i = 0; i < attributes.length; i++) {
                        if (key.equalsIgnoreCase(attributes[i])) {
                            colMap.put(i, conditions.get(key));
                        }
                    }
                }
                while ((line = reader.readLine()) != null)
                {
                    if(checkCondition(colMap, line)) {
                        records.add(line);
                    }
                }
            }

            reader.close();
            return records;
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.", tableName);
            e.printStackTrace();
            return null;
        }
    }

    private boolean checkCondition(Map<Integer, String> colMap, String line) {
        Boolean flag = false;
        String[] attrs = line.split(" ");
        for (Integer key : colMap.keySet()){
            if (attrs[key].equalsIgnoreCase(colMap.get(key))){
                flag = true;
            }
        }
        return flag;
    }
}
