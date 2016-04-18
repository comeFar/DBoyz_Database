package Symbols;

/**
 * Created by Yi on 4/17/2016.
 *
 */
public class Join extends SQLSegment {
    public String left, right;

    public Join(String left, String right){
        super(SQLSegment.SELECT_JOIN_SEG);
        this.left = left;
        this.right = right;
    }
}
