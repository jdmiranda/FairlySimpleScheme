/**************
 * SchemeEvalVisitor.java
 **************/
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import java.lang.String;
import java.util.*;
import static java.lang.String.*;



public class SchemeEvalVisitor extends SchemeExprBaseVisitor<Double> {

    static Apply plus = new ApplyPlus();
    static Apply minus = new ApplyMinus();
    static Apply times = new ApplyTimes();
    static Apply div = new ApplyDiv();

    HashMap<String,Double> symbols;

    public SchemeEvalVisitor() {
        symbols = new HashMap<String,Double>();
    }

    public Double visitAppl(SchemeExprParser.ApplContext ctx) {
        // evaluate operands and collect their values
        List<Double> args = new ArrayList<Double>();
        for (SchemeExprParser.ExprContext expr : ctx.expr())
            args.add(visit(expr));
        // apply operator to args
        Double res = 0.0;
        switch (ctx.op.getText().charAt(0)) {
            case '+': res = plus.apply(args); break;
            case '-': res = minus.apply(args); break;
            case '*': res = times.apply(args); break;
            case '/': res = div.apply(args); break;
        }
        return res;
    }
    public boolean visitBooll(SchemeExprParser.BoollContext ctx){
        boolean val = valueOf(ctx.boolean().getText());
        boolean testVal;
        if (val == "true") testVal = true;
        if (val == "false") testVal = false;
        return testVal;
    }

    public Double visitIfl(SchemeExprParser.IflContext ctx){
        Bool testVal = visit(ctx.expr(0));
        Double val;
        if (testVal == true){
            val = visit(ctx.expr(1));
        }
        else {
            val = visit(ctx.expr(2));
        }

    }

    public Double visitDefl(SchemeExprParser.DeflContext ctx) {
        String id = ctx.ID().getText();
        Double val = visit(ctx.expr());
        symbols.put(id, val);
        return val;
    }

    public Double visitIdl(SchemeExprParser.IdlContext ctx) {
        Double val = symbols.get(ctx.ID().getText());
        if (val == null)
            val = 0.0;
        return val;
    }

    public Double visitProgl(SchemeExprParser.ProglContext ctx) {
        int n = ctx.getChildCount();
        Double res = 0.0;
        for (int i = 0; i < n; i++) {
            res = visit(ctx.expr(i));
        }
        System.out.println(res);
        return 0.0;
    }

    public Double visitDoublel(SchemeExprParser.DoublelContext ctx) {
        return Double.valueOf(ctx.DOUBLE().getText());
    }
}
