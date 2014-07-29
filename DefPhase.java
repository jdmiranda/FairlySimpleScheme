
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends SchemeExprBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;
    public void enterProgl(SchemeExprParser.ProglContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    public void exitProgl(SchemeExprParser.ProglContext ctx) {
        System.out.println(globals);
    }

    public void enterLetl(SchemeExprParser.LetlContext ctx) {
        String name = ctx.ID().getText();
        //int typeTokenType = ctx.type().start.getType();
        //Symbol.Type type = SchemeExprDriver.getType(typeTokenType);

        FunctionSymbol function = new FunctionSymbol(name, val, currentScope);
        currentScope.define(function);
        saveScope(ctx, function);
        currentScope = function;
    }

    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }

    public void exitLetl(SchemeExprParser.LetlContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterLetvardecl(SchemeExprParser.LetvardeclContext ctx) {

        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitLetvardecl(SchemeExprParser.LetvardeclContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitDefinel(SchemeExprParser.DefinelContext ctx) {
        defineVar(ctx.ID().getSymbol());
    }

    public void exitLetl(SchemeExprParser.LetllContext ctx) {
        letvardecl(ctx.ID().getSymbol());
    }

    //could have to change this, i think i changed it to Definel up above
    void defineVar(SchemeExprParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = SchemeExprDriver.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }
}
