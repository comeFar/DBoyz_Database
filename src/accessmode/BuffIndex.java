package accessmode;

import java.util.LinkedList;

/**
 * Created by Yi on 4/19/2016.
 */
public class BuffIndex {
    public int shift;
    public LinkedList<int[]> index;

    public BuffIndex(int shift){
        this.shift = shift;
        this.index = new LinkedList<>();
    }

    public void add(int[] addr){
        this.index.add(addr);
    }
}
