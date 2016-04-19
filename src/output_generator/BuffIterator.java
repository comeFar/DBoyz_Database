package output_generator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Yi on 4/19/2016.
 */
public class BuffIterator implements Iterator<String> {
    private ArrayList<ArrayList<String>> buff;
    private int listIndex;
    private Iterator<String> curItr;

    public BuffIterator(ArrayList<ArrayList<String>> buff){
        this.buff = buff;
        this.listIndex = 0;
        curItr = buff.get(listIndex).iterator();
    }

    public String next(){
        return curItr.next();
    }

    public boolean hasNext(){
        if (curItr.hasNext()){
            return true;
        }else{
            listIndex++;
            if (listIndex < buff.size()){
                ArrayList<String> subList = buff.get(listIndex);
                curItr = subList.iterator();
                return curItr.hasNext();
            }else{
                return false;
            }
        }
    }
}
