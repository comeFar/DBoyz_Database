package QueryUtils;

/**
 * Created by Yi on 4/13/2016.
 *
 */
public class Filter {
    public static int JOIN = 1;
    public static int NORMAL = 2;

    String first, second, op;
    public int type;

    public Filter(String first, String second, String op){
        this.first = first;
        this.second = second;
        this.op = op;
        type = 0;
    }
}
