package Symbols;

/**
 * Created by Yi on 4/14/2016.
 *
 */
public class SelectStmt extends SQLSegment{
    public SelectStmt parentSelectStmt;

    public SelectStmt(){
        super(SQLSegment.SUB_SQL);
        this.subSqlType = SQLSegment.SELECT_SEG;
        this.parentSelectStmt = null;
    }

    public void printInfo(){
        printSpecificInfo(SELECT_PROJECTOR_SEG);
        printSpecificInfo(SELECT_TABLE_SEG);
        printSpecificInfo(SELECT_FILTERING_SEG);
    }

    private void printSpecificInfo(String type){
        StringBuilder builder = new StringBuilder();
        for (SQLSegment sql: this.getChild(type)){
            for (SQLSegment sql2: sql.getChild(SQLSegment.IDENTIFIER)){
                Identifier id = (Identifier)sql2;
                builder.append(id.value).append(" ");
            }
        }
        System.out.println(type + ": " + builder.toString());
    }
}
