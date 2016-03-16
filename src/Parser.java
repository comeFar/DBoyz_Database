import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static void main(String[] args) {
        try{
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            String query;
            while((query=br.readLine())!=null) {
                query = query.toLowerCase();
                //get Positions
                int selectPos = query.indexOf("select");
                int fromPos = query.indexOf("from");
                int wherePos = query.indexOf("where");
                //substring
                String targetStr = query.substring(selectPos + 6, fromPos);
                targetStr = targetStr.trim();
                String tableStr = "";
                String conditionStr = "";
                if (wherePos != -1) {
                    tableStr = query.substring(fromPos + 4, wherePos);
                    tableStr = tableStr.trim();
                    conditionStr = query.substring(wherePos + 5);
                    conditionStr = conditionStr.trim();
                } else {
                    tableStr = query.substring(fromPos + 4);
                    tableStr = tableStr.trim();
                }
                //System.out.println("Target: " + targetStr + ",Table: " + tableStr + ",Condition: " + conditionStr); //debug
                //Split the elements
                String[] targets = targetStr.split(",");
                targets = doTrim(targets);
                String[] tables = tableStr.split(",");
                tables = doTrim(tables);
                Map<String, String> conditions = new HashMap<String, String>();
                //This case ignore the "and", "or"; only can handle one condition right now
                if(wherePos != -1){
                    String[] cond = conditionStr.split("=");
                    cond = doTrim(cond);
                    conditions.put(cond[0],cond[1]);
                }
                RowbasedQuery row = new RowbasedQuery(targets,tables,conditions);
                row.run();
            }
        }catch(IOException io){
            io.printStackTrace();
        }
    }
    public static String[] doTrim(String[] array){
        for(int i=0; i<array.length; i++){
            array[i] = array[i].trim();
        }
        return  array;
    }
}
