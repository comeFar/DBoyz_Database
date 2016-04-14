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
    static String rowBasedBuff = "";
    static List<String> colBasedBuff = new LinkedList<>();
    public static void generateDB(String line, DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        int listLackCount = table.attrs.size() - colBasedBuff.size();
        if (listLackCount > 0){
            for (int i = 0; i < listLackCount; i++){
                colBasedBuff.add("");
            }
        }

        readSize += line.length();
        if (readSize >= DB_INFO.FILE_SIZE) {
            writeRowBasedSplit(rowBasedBuff, table);
            writeColBasedSplit(colBasedBuff, table);
            readSize = line.length();
            rowBasedBuff = line + '\n';
            colBasedBuffAccumulate(line, true);
        } else {
            rowBasedBuff += line + '\n';
            colBasedBuffAccumulate(line, false);
        }
    }

    public static void writeRowBasedSplit(String data, DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        String dirName = DB_INFO.ROW_DB_DIR + "\\" + table.name;
        new File(dirName).mkdirs();
        //todo write binary files
        PrintWriter writer = new PrintWriter(dirName + "\\" + table.rowBasedSplitCount, "UTF-8");
        writer.println(data);
        writer.close();
        System.out.println("create " + dirName + "-->" + table.rowBasedSplitCount);
        table.rowBasedSplitCount++;
    }

    public static void writeColBasedSplit(List<String> data, DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        String dirName = DB_INFO.COL_DB_DIR + "\\" + table.name;
        new File(dirName).mkdirs();
        //todo write binary files
        PrintWriter writer = new PrintWriter(dirName + "\\" + table.colBasedSplitCount, "UTF-8");
        data.forEach(writer::println);
        writer.close();
        System.out.println("create " + dirName + "-->" + table.colBasedSplitCount);
        table.colBasedSplitCount++;
    }

    public static void colBasedBuffAccumulate(String line, boolean reset){
        if (reset){
            for (int i = 0; i < colBasedBuff.size(); i++){
                colBasedBuff.set(i, "");
            }
        }

        int index = 0;
        String splitFlag = "\\|";
        String[] splits = line.split(splitFlag);
        for (String str: splits){
            colBasedBuff.set(index, colBasedBuff.get(index)+str + "|");
            index++;
        }
    }

    public static void flushBuffs(DB_INFO.Table table) throws FileNotFoundException, UnsupportedEncodingException {
        writeRowBasedSplit(rowBasedBuff, table);
        writeColBasedSplit(colBasedBuff, table);
    }
}
