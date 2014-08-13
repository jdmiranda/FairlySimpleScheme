/**********************
 * SchemeEvalVisitor.java
 * Adding let expressions
 **********************/

import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

public class SchemeEvalVisitor extends SchemeExprBaseVisitor<Val> {
    private static final Apply plus = new ApplyPlus();
    private static final Apply minus = new ApplyMinus();
    private static final Apply times = new ApplyTimes();
    private static final Apply div = new ApplyDiv();
    private static final Apply eq = new ApplyEq();
    private static final Apply gt = new ApplyGt();
    private static final Apply lt = new ApplyLt();
    private static final Apply and = new ApplyAnd();
    private static final Apply or = new ApplyOr();
    private static final Apply not = new ApplyNot();
    private static Fun fun = new Fun();

    ParseTreeProperty<Environment> envs =
            new ParseTreeProperty<Environment>();
    void setEnv(ParseTree node, Environment env) {
        envs.put(node, env);
    }

    Environment getEnv(ParseTree node) {
        return envs.get(node);
    }
    // for propagating the parent's environment to its children

    void propEnv(ParseTree parent, ParseTree child) {
        setEnv(child, getEnv(parent));
    }
    // top-level environment

    private Environment topEnv;

    public Val visitAppl(SchemeExprParser.ApplContext ctx) {
// evaluate operands and collect their values
        List<Val> args = new ArrayList<Val>();
        for (SchemeExprParser.ExprContext expr : ctx.expr()) {
            propEnv(ctx, expr);
            args.add(visit(expr));
        }
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
        propEnv(ctx, ctx.expr());
        Val val = visit(ctx.expr());
// create binding in top environment
        topEnv.addEntry(id, val);
        return val;
    }
    public Val visitIdl(SchemeExprParser.IdlContext ctx) {
        Val val = getEnv(ctx).get(ctx.ID().getText());
        return val;
    }
    public Val visitProgl(SchemeExprParser.ProglContext ctx) {
        topEnv = new TopEnvironment();
        setEnv(ctx, topEnv);
        int n = ctx.getChildCount();
        for (int i = 0; i < n; i++) {
            propEnv(ctx, ctx.expr(i));
            Val res = visit(ctx.expr(i));
            System.out.println(res);
        }
        return new Val();
    }
    public Val visitDoublel(SchemeExprParser.DoublelContext ctx) {
        return new Val(Double.valueOf(ctx.DOUBLE().getText()));
    }
    public Val visitBooleanl(SchemeExprParser.BooleanlContext ctx) {
        return new Val(Boolean.valueOf(ctx.BOOLEAN().getText()));
    }
    public Val visitLetl(SchemeExprParser.LetlContext ctx) {
        propEnv(ctx, ctx.letvardec());
        visit(ctx.letvardec());
        Environment newenv = getEnv(ctx.letvardec());
        setEnv(ctx.expr(), newenv);
        return visit(ctx.expr());
    }
    public Val visitLetvardecl(SchemeExprParser.LetvardeclContext
                                       ctx) {
        ParseTree idnode = ctx.ID();
        ParseTree randnode = ctx.expr();
        propEnv(ctx, randnode);
        Val val = visit(randnode);
        Environment newenv = new ExtendedEnvironment(getEnv(ctx));
        newenv.addEntry(idnode.getText(), val);
        setEnv(ctx, newenv);
        return new Val();
    }
    public Val visitIfl(SchemeExprParser.IflContext ctx) {
        propEnv(ctx, ctx.expr(0));
        Boolean test = visit(ctx.expr(0)).getBoolean();
        if (test) {
            propEnv(ctx, ctx.expr(1));
            return visit(ctx.expr(1));
        } else {
            propEnv(ctx, ctx.expr(2));
            return visit(ctx.expr(2));
        }
    }
    public Val visitPrintl(SchemeExprParser.PrintlContext ctx) {
        propEnv(ctx, ctx.expr());
        Val res = visit(ctx.expr());
        System.out.println(res);
        return res;
    }
    public Val visitWhilel(SchemeExprParser.WhilelContext ctx) {
        ParseTree testexpr = ctx.expr(0);
        ParseTree bodyexpr = ctx.expr(1);
        propEnv(ctx, testexpr);
        propEnv(ctx, bodyexpr);
        Val res = new Val();
        while (true) {
            Boolean test = visit(testexpr).getBoolean();
            if (test) {
                res = visit(bodyexpr);
            } else {
                break;
            }
        }
        return res;
    }
    public Val visitBeginl(SchemeExprParser.BeginlContext ctx) {
        Val res = new Val();
        for (SchemeExprParser.ExprContext expr : ctx.expr()) {
            propEnv(ctx, expr);
            res = visit(expr);
        }
        return res;
    }

    public Val visitFunl(SchemeExprParser.FunlContext ctx) {
        ParseTree idNode = ctx.ID();
        ParseTree bodyNode = ctx.expr();
        propEnv(ctx, bodyNode);
        Val val = visit(bodyNode);
        Environment newenv = new ExtendedEnvironment(getEnv(ctx));
        newenv.addEntry(idNode.getText(), val);
        setEnv(ctx, newenv);
        return new Val();
    }

    public Val visitCalll(SchemeExprParser.CalllContext ctx) {
        ParseTree funNode = ctx.expr(0);
        ParseTree operandNode = ctx.expr(1);
        propEnv(ctx, funNode);
        Val arg = visit(funNode);
        Val res = fun.apply(arg);
        return res;
    }
}