package Symbols;

/**
 * Created by Yi on 4/16/2016.
 */
public class Identifier extends SQLSegment {
    public String value;

    public Identifier(String value){
        super(SQLSegment.IDENTIFIER);
        this.value = value;
    }


}
