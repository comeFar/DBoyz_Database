package Symbols;

/**
 * Created by Yi on 4/16/2016.
 *
 */
public class Table extends SQLSegment {
    public String name;

    public Table(String name){
        super(SQLSegment.SELECT_TABLE_SEG);
        this.name = name;
    }
}
