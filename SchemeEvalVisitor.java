/********************* 
 * SchemeEvalVisitor.java 
 ********************/

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;


public class SchemeEvalVisitor extends SchemeExprBaseVisitor<Val>
{

    static Apply plus = new ApplyPlus();
    static Apply minus = new ApplyMinus();
    static Apply times = new ApplyTimes();
    static Apply div = new ApplyDiv();
    static Apply eq = new ApplyEq();
    static Apply gt = new ApplyGt();
    static Apply lt = new ApplyLt();
    static Apply and = new ApplyAnd();
    static Apply or = new ApplyOr();
    static Apply not = new ApplyNot();

    HashMap<String,Val> symbols;

    public SchemeEvalVisitor() {
        symbols = new HashMap<String,Val>();
    }

    public Val visitAppl(SchemeExprParser.ApplContext ctx) {
        // evaluate operands and collect their values
        List<Val> args = new ArrayList<Val>();
        for (SchemeExprParser.ExprContext expr : ctx.expr())
            args.add(visit(expr));
        // apply operator to args
        Val res = new Val();
        switch (ctx.op.getText().charAt(0)) {
            case '+': res = plus.apply(args); break;
            case '-': res = minus.apply(args); break;
            case '*': res = times.apply(args); break;
            case '/': res = div.apply(args); break;
            case '=': res = eq.apply(args); break;
            case '>': res = gt.apply(args); break;
            case '<': res = lt.apply(args); break;
            case '&': res = and.apply(args); break;
            case '|': res = or.apply(args); break;
            case '!': res = not.apply(args); break;
        }
        return res;
    }
    public Val visitDefl(SchemeExprParser.DeflContext ctx) {
        String id = ctx.ID().getText();
        Val val = visit(ctx.expr());
        symbols.put(id, val);
        return val;
    }

    public Val visitIdl(SchemeExprParser.IdlContext ctx) {
        Val val = symbols.get(ctx.ID().getText());
        if (val == null)
            val = new Val();
        return val;
    }

    public Val visitProgl(SchemeExprParser.ProglContext ctx) {
        int n = ctx.getChildCount();
        Val res = null;
        for (int i = 0; i < n; i++) {
            res = visit(ctx.expr(i));
        }
        System.out.println(res);
        return res;
    }

    public Val visitDoublel(SchemeExprParser.DoublelContext ctx) {
        return new Val(Double.valueOf(ctx.DOUBLE().getText()));
    }

    public Val visitBooleanl(SchemeExprParser.BooleanlContext ctx) {
        return new Val(Boolean.valueOf(ctx.BOOLEAN().getText()));
    }

    public Val visitIfl(SchemeExprParser.IflContext ctx) {
        Boolean test = visit(ctx.expr(0)).getBoolean();
        if (test)
            return visit(ctx.expr(1));
        else
            return visit(ctx.expr(2));
    }
}

