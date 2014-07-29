
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class RefPhase extends SchemeExprBaseListener {
    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope;

    public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
        this.scopes = scopes;
        this.globals = globals;
    }
    public void enterFile(SchemeExprParser.FileContext ctx) {
        currentScope = globals;
    }

    public void enterFunctionDecl(SchemeExprParser.FunctionDeclContext ctx) {
        currentScope = scopes.get(ctx);
    }
    public void exitFunctionDecl(SchemeExprParser.FunctionDeclContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterBlock(SchemeExprParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }
    public void exitBlock(SchemeExprParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitVar(SchemeExprParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if ( var==null ) {
            SchemeExprDriver.error(ctx.ID().getSymbol(), "no such variable: "+name);
        }
        if ( var instanceof FunctionSymbol ) {
            SchemeExprDriver.error(ctx.ID().getSymbol(), name+" is not a variable");
        }
    }

    public void exitCall(SchemeExprParser.CallContext ctx) {

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
