import grammar.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import output_generator.OutputGen;
import preprocessor.Planer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]){
        try{
            String line;
            StringBuilder buff = new StringBuilder();
            FileReader fileReader = new FileReader("sample.sql");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                buff.append(line).append('\n');
            }
            bufferedReader.close();
            DBoyzSQLLexer lexer = new DBoyzSQLLexer(new ANTLRInputStream(buff.toString()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DBoyzSQLParser parser = new DBoyzSQLParser(tokens);
            ParseTree tree = parser.parse();
//            ParseTreeWalker walker = new ParseTreeWalker();
//            walker.walk(new DBoyzAntlrListener(new Planer()), tree);
            DBoyzAntlrVisitor visitor = new DBoyzAntlrVisitor();
            visitor.visit(tree);
            Planer planer = visitor.planer;
            OutputGen outputGen = planer.run();
            outputGen.gen();
        }
        catch (RuntimeException e){
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
