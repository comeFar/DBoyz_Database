package Symbols;

/**
 * Created by Yi on 4/16/2016.
 *
 */
public class SelectFrom extends SQLSegment {
    public String name;

    public SelectFrom(String name){
        super(SQLSegment.SELECT_TABLE_SEG);
        this.name = name;
    }
}
