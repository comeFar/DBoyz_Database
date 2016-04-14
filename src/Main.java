import QueryUtils.QueryOptimizer;
import grammar.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]){
        try{
            String line;
            String buff = "";
            FileReader fileReader = new FileReader("sample.sql");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                buff += line + '\n';
            }
            bufferedReader.close();
            DBoyzSQLLexer lexer = new DBoyzSQLLexer(new ANTLRInputStream(buff));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DBoyzSQLParser parser = new DBoyzSQLParser(tokens);
            ParseTree tree = parser.parse();
//            ParseTreeWalker walker = new ParseTreeWalker();
//            walker.walk(new DBoyzAntlrListener(new QueryOptimizer()), tree);
            DBoyzAntlrVisitor visitor = new DBoyzAntlrVisitor();
            visitor.visit(tree);
            QueryOptimizer optimizer = visitor.optimizer;
            System.out.println("Finish\n");
        }
        catch (RuntimeException e){
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
