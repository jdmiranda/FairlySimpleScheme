/**************
 * SchemeEvalVisitor.java
 **************/
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.*;
import static java.lang.String.*;



public class SchemeEvalVisitor extends SchemeExprBaseVisitor<Double> {

    static Apply plus = new ApplyPlus();
    static Apply minus = new ApplyMinus();
    static Apply times = new ApplyMul();
    static Apply div = new ApplyDiv();
    static Apply greater = new ApplyGreater();
    static Val less = new ApplyLess();
    static Apply equal = new ApplyEqual();

    HashMap<String,Object> symbols;

    public SchemeEvalVisitor() {
        symbols = new HashMap<String,Object>();
    }

    public Object visitAppl(SchemeExprParser.ApplContext ctx) {
        // evaluate operands and collect their values
        List<Object> args = new ArrayList<Object>();
        for (SchemeExprParser.ExprContext expr : ctx.expr())
            args.add(visit(expr));
        // apply operator to args
        Object res = 0.0;
        switch (ctx.op.getText().charAt(0)) {
            case '+': res = plus.apply(args); break;
            case '-': res = minus.apply(args); break;
            case '*': res = times.apply(args); break;
            case '/': res = div.apply(args); break;
        }
        return res;
    }

    @Override
    public Double visitBoolean(SchemeExprParser.BooleanContext ctx){
        boolean val =  Boolean.valueOf(ctx.getText());
       Double valD = val ? 1.0 : 0.0;
        return valD;
    }

    public Double visitIfl(SchemeExprParser.IflContext ctx){
        List<Double> args = new ArrayList<Double>();
        for (SchemeExprParser.ExprContext expr : ctx.expr())
            args.add(visit(expr));
        // apply operator to args
        Object res ;
        switch (ctx.op.getText().charAt(0)) {
            case '<': res = greater.apply(args); break;
            case '>': res = less.apply(args); break;
            case '=': res = equal.apply(args); break;
        }

        Object val = visitBoolean(ctx.expr) ? visit(ctx.expr(1)) : visit(ctx.expr(2));
        return res;
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
