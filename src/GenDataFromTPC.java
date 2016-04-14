import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yi on 4/12/2016.
 *
 */
public class GenDataFromTPC {
    public static void main(String args[]){
        String line;

        for (DB_INFO.Table table: DB_INFO.TABLES){
            String file = table.name;

            try {
                FileReader fileReader = new FileReader(DB_INFO.TPC_DIR + "\\" + file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((line = bufferedReader.readLine()) != null) {
                    generateDB(line, table);
                }
                flushBuffs(table);
                bufferedReader.close();
            }
            catch(FileNotFoundException ex) {
                System.out.println("Unable to open file '" + file + "'");
            }
            catch(IOException ex) {
                System.out.println("Error reading file '" + file + "'");
            }
        }
    }

    static int readSize;
    static StringBuilder rowBasedBuff = new StringBuilder();
    static List<StringBuilder> colBasedBuff = new LinkedList<>();
    public static void generateDB(String line, DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        int listLackCount = table.attrs.size() - colBasedBuff.size();
        if (listLackCount > 0){
            for (int i = 0; i < listLackCount; i++){
                colBasedBuff.add(new StringBuilder());
            }
        }

        readSize += line.length();
        if (readSize >= DB_INFO.FILE_SIZE) {
            writeRowBasedSplit(rowBasedBuff, table);
            writeColBasedSplit(colBasedBuff, table);
            readSize = line.length();
            rowBasedBuff = new StringBuilder();
            rowBasedBuff.append(line).append('\n');
            colBasedBuffAccumulate(line, true);
        } else {
            rowBasedBuff.append(line).append('\n');
            colBasedBuffAccumulate(line, false);
        }
    }

    public static void writeRowBasedSplit(StringBuilder data, DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        long start_time, end_time;
        start_time = System.nanoTime();
        String dirName = DB_INFO.ROW_DB_DIR + "\\" + table.name;
        new File(dirName).mkdirs();
        //todo write binary files
        PrintWriter writer = new PrintWriter(dirName + "\\" + table.rowBasedSplitCount, "UTF-8");
        writer.println(data.toString());
        writer.close();
        end_time = System.nanoTime();
        System.out.println("create " + dirName + "-->" + table.rowBasedSplitCount + " time:" + (end_time-start_time)/1e6);
        table.rowBasedSplitCount++;
    }

    public static void writeColBasedSplit(List<StringBuilder> data, DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        long start_time, end_time;
        start_time = System.nanoTime();
        String dirName = DB_INFO.COL_DB_DIR + "\\" + table.name;
        new File(dirName).mkdirs();
        //todo write binary files
        PrintWriter writer = new PrintWriter(dirName + "\\" + table.colBasedSplitCount, "UTF-8");
        for (StringBuilder b: data){
            writer.println(b.toString());
        }
        writer.close();
        end_time = System.nanoTime();
        System.out.println("create " + dirName + "-->" + table.colBasedSplitCount + " time:" + (end_time-start_time)/1e6);
        table.colBasedSplitCount++;
    }

    public static void colBasedBuffAccumulate(String line, boolean reset){
        if (reset){
            for (int i = 0; i < colBasedBuff.size(); i++){
                colBasedBuff.set(i, new StringBuilder());
            }
        }

        int index = 0;
        String splitFlag = "\\|";
        String[] splits = line.split(splitFlag);
        for (String str: splits){
            StringBuilder builder = colBasedBuff.get(index);
            builder.append(str).append('|');
            colBasedBuff.set(index, builder);
            index++;
        }
    }

    public static void flushBuffs(DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        writeRowBasedSplit(rowBasedBuff, table);
        writeColBasedSplit(colBasedBuff, table);
    }
}
