package output_generator;

import Symbols.Projector;
import Symbols.SQLSegment;
import accessmode.PhysicalBlockBuff;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Yi on 4/18/2016.
 *
 */
public class OutputGen {
    private HashMap<PhysicalBlockBuff, String> buff;
    private ArrayList<SQLSegment> projectors;

    public OutputGen(HashMap<PhysicalBlockBuff, String> buff, ArrayList<SQLSegment> projectors){
        this.buff = buff;
        this.projectors = projectors;
    }

    public void gen(){
        StringBuilder builder = new StringBuilder();
        for (SQLSegment sql: projectors){
            Projector p = (Projector) sql;
            builder.append(getOutput(p)).append("\t\t").append('|');
        }

    }

    private String getOutput(Projector p){
        return null;
    }
}
