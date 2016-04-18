package Symbols;

/**
 * Created by Yi on 4/17/2016.
 *
 */
public class Join extends SQLSegment {
    public String table1, table2;

    public Join(String table1, String table2){
        super(SQLSegment.SELECT_JOIN_SEG);
        this.table1 = table1;
        this.table2 = table2;
    }
}
