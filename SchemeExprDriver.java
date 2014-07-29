import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

/*
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
*/


public class SchemeExprDriver {


    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                msg);
    }

    public void process(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        SchemeExprLexer lexer = new SchemeExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SchemeExprParser parser = new SchemeExprParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();


        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);

        RefPhase ref = new RefPhase(def.globals, def.scopes);
        walker.walk(ref, tree);

        SchemeEvalVisitor eval = new SchemeEvalVisitor();
        eval.visit(tree);
    }

    public static void main(String[] args) throws Exception {
        new SchemeExprDriver().process(args);
    }
}