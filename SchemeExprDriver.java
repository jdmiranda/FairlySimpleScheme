import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;


public class SchemeExprDriver {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        InputStream is = System.in;
        if (inputFile!=null)
            is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        SchemeExprLexer lexer = new SchemeExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SchemeExprParser parser = new SchemeExprParser(tokens);
        ParseTree tree = parser.prog();
        SchemeEvalVisitor eval = new SchemeEvalVisitor();
        eval.visit(tree);
    }
}


}