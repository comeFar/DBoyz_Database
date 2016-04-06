import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ColumnBasedQuery extends RowbasedQuery {
    List<String> records = new ArrayList<String>();

    public ColumnBasedQuery(String[] targets, String[] tables, Map<String, String> conditions) {
        super(targets, tables, conditions);
    }

    private void projection(List<String> filtered) {
        StringBuilder sb = new StringBuilder();
        // print header first
        for (int i = 1; i < records.size(); i++) {
            String[] pair = records.get(i).split(" ");
            sb.append(pair[0] + " ");
        }
        sb.append("\n");

        for (int i = 1; i < records.size(); i++) {
            for (int j = 0; j < filtered.size(); j++) {
                String[] pair = records.get(i).split(" ");
                for (int k = 1; k < pair.length; k++) {
                    String val[] = pair[k].split(":");
                    if (val[1].equalsIgnoreCase(filtered.get(j))) {
                        sb.append(val[0] + " ");
                    }
                }

            }
        }
        if ( targets.length > 0 && !targets[0].equals("*")) {
            String[] s = sb.toString().split("\n");
            sb = new StringBuilder();
            ArrayList<Integer> resIndex = new ArrayList<Integer>();
            for (String target : targets) {
                String[] header = s[0].split(" ");
                for (int i = 0; i < header.length; i++) {
                    if (target.equalsIgnoreCase(header[i])) {
                        resIndex.add(i);
                        sb.append(header[i]+" ");
                    }
                }
            }
            sb.append("\n");
            for (int i = 1; i < s.length; i++) {
                String[] record = s[i].split(" ");
                for (int j = 0; j < resIndex.size(); j++) {
                    sb.append(record[resIndex.get(j)] + " ");
                }
            }
        }
        else if(targets.length == 0||!targets[0].equals("*")){
            System.out.println("");
            return;
        }

        System.out.println(sb.toString());

    }

    public void run() {
        //filtering
        List<String> filtered = new ArrayList<String>();
        for (String table : tables) {
            filtered = filtering(table);
        }
        //projection
        projection(filtered);
    }

    private List<String> filtering(String tableName) {
        try {
            List<String> result = new ArrayList<String>();
            BufferedReader reader = new BufferedReader(new FileReader(tableName));
            String line;
            String header = reader.readLine();
            header = header.toLowerCase();
            records.add(header);
            while ((line = reader.readLine()) != null) {
                records.add(line);
                String[] rec = line.split(" ");
                for (String key : conditions.keySet()) {
                    if (rec[0].equalsIgnoreCase(key)) {
                        for (int i = 1; i < rec.length; i++) {
                            String val[] = rec[i].split(":");
                            if (val[0].equalsIgnoreCase(conditions.get(key))) {
                                result.add(val[1]);
                            }
                        }
                    }
                }

            }

            reader.close();
            return result;
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", tableName);
            e.printStackTrace();
            return null;
        }
    }

    private boolean checkCondition(Map<Integer, String> colMap, String line) {
        Boolean flag = false;
        String[] attrs = line.split(" ");
        for (Integer key : colMap.keySet()) {
            if (attrs[key].equalsIgnoreCase(colMap.get(key))) {
                flag = true;
            }
        }
        return flag;
    }

}
