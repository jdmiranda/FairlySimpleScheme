/**********************
 * SchemeEvalVisitor.java
 **********************/

import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

class SchemeEvalVisitor extends SchemeExprBaseVisitor<Val> {
    private static  Apply plus = new ApplyPlus();
    private static  Apply minus = new ApplyMinus();
    private static  Apply times = new ApplyTimes();
    private static  Apply div = new ApplyDiv();
    private static  Apply eq = new ApplyEq();
    private static  Apply gt = new ApplyGt();
    private static  Apply lt = new ApplyLt();
    private static  Apply and = new ApplyAnd();
    private static  Apply or = new ApplyOr();
    private static  Apply not = new ApplyNot();

    private  ParseTreeProperty<Environment> envs =
            new ParseTreeProperty<Environment>();
    void setEnv(ParseTree node, Environment env) {
        envs.put(node, env);
    }

    Environment getEnv(ParseTree node) {
        return envs.get(node);
    }


    void propEnv(ParseTree parent, ParseTree child) {
        setEnv(child, getEnv(parent));
    }


    private Environment topEnv;

    public Val visitAppl(SchemeExprParser.ApplContext ctx) {
        List<Val> args = new ArrayList<Val>();
        for (SchemeExprParser.ExprContext expr : ctx.expr()) {
            propEnv(ctx, expr);
            args.add(visit(expr));
        }

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
        String id = idNode.getText();
        propEnv(ctx, bodyNode);
        Fun function = new Fun(id, bodyNode, getEnv(ctx));
        Val res = new Val(function);
        return res;
    }

    public Val visitCalll(SchemeExprParser.CalllContext ctx) {
        ParseTree funNode = ctx.expr(0);
        ParseTree operandNode = ctx.expr(1);
        propEnv(ctx, funNode);
        Fun function = visit(funNode).getFun();
        propEnv(ctx, operandNode);
        Val arg = visit(operandNode);
        Val res = function.apply(arg);
        return res;
    }
}