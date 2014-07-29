
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class RefPhase extends SchemeExprBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope;

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }
    public void enterProgl(SchemeExprParser.ProglContext ctx) {
        currentScope = globals;
    }

    public void enterLetl(SchemeExprParser.LetlContext ctx) {
        currentScope = scopes.get(ctx);
    }
    public void exitLetl(SchemeExprParser.LetlContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterLetvardecl(SchemeExprParser.LetvardeclContext ctx) {
        currentScope = scopes.get(ctx);
    }
    public void exitLetvardecl(SchemeExprParser.LetvardeclContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitExpr(SchemeExprParser.ExprContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            SchemeExprDriver.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
            SchemeExprDriver.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
    }

    public void exitDefinel(SchemeExprParser.DefinelContext ctx) {

        String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if ( meth==null ) {
            SchemeExprDriver.error(ctx.ID().getSymbol(), "no such function: "+funcName);
        }
        if ( meth instanceof VariableSymbol ) {
            SchemeExprDriver.error(ctx.ID().getSymbol(), funcName+" is not a function");
        }
    }
}
