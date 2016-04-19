package output_generator;

import Symbols.Projector;
import Symbols.SQLSegment;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by Yi on 4/18/2016.
 */
public class OutputGen {
    private LinkedHashMap<String, ArrayList<ArrayList<String>>> buff;
    private ArrayList<SQLSegment> projectors;

    public OutputGen(LinkedHashMap<String, ArrayList<ArrayList<String>>> buff, ArrayList<SQLSegment> projectors){
        this.buff = buff;
        this.projectors = projectors;
    }

    public void gen(){
        for (SQLSegment sql: projectors){
            Projector p = (Projector) sql;
        }
    }

    private String getOutput(Projector p){
        return null;
    }
}
