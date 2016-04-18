package accessmode;

import java.util.HashMap;

/**
 * Created by Yi on 4/18/2016.
 *
 */
public class BlockBuff {
    public StringBuilder buff;
    public HashMap<String, Integer> headers;

    private int index;

    public BlockBuff(){
        buff = new StringBuilder();
        headers = new HashMap<>();
        index = 0;
    }

    public void addHeader(String value){
        headers.put(value, index++);
    }

    public void merge(BlockBuff other){
        if ((null == other) || (other.headers.size() == 0)){
            return;
        }
        if ((headers.size() != 0) && (headers.size() != other.headers.size())){
            System.out.println("Can not merge to block with different columns\n");
            return;
        }
        this.headers = other.headers;
        this.buff.append(other.buff);
    }

    public BlockBuff blockNestedLoopJoin(BlockBuff other){
        BlockBuff blockBuff = new BlockBuff();
        return blockBuff;
    }
}
