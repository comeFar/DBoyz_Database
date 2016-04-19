package output_generator;

import Symbols.Projector;
import Symbols.SQLSegment;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Yi on 4/18/2016.
 */
public class OutputGen {
    private LinkedHashMap<String, BuffIterator> iterators;
    private ArrayList<SQLSegment> projectors;

    public OutputGen(LinkedHashMap<String, ArrayList<ArrayList<String>>> buff, ArrayList<SQLSegment> projectors){
        iterators = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<ArrayList<String>>> entry: buff.entrySet()){
            iterators.put(entry.getKey().split("\\.")[1], new BuffIterator(entry.getValue()));
        }
        this.projectors = projectors;
    }

    public void gen() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("rowBase.txt", "UTF-8");
        while (true){
            StringBuilder builder = new StringBuilder();
            for (SQLSegment sql: projectors){
                Projector p = (Projector) sql;
                if (p.hasNext(iterators)){
                    builder.append(p.next(iterators)).append("\t\t");
                }else{
                    writer.close();
                    return;
                }
            }
            builder.append('\n');
            writer.println(builder.toString());
        }
    }
}
