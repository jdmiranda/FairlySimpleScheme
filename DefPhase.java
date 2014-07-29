
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends SchemeExprBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;
    public void enterFile(SchemeExprParser.FileContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    public void exitFile(SchemeExprParser.FileContext ctx) {
        System.out.println(globals);
    }

    public void enterFunctionDecl(SchemeExprParser.FunctionDeclContext ctx) {
        String name = ctx.ID().getText();
        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = SchemeExprDriver.getType(typeTokenType);

        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
        currentScope.define(function);
        saveScope(ctx, function);
        currentScope = function;
    }

    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }

    public void exitFunctionDecl(SchemeExprParser.FunctionDeclContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public void enterBlock(SchemeExprParser.BlockContext ctx) {

        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    public void exitBlock(SchemeExprParser.BlockContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public void exitFormalParameter(SchemeExprParser.FormalParameterContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    public void exitVarDecl(SchemeExprParser.VarDeclContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    void defineVar(SchemeExprParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = SchemeExprDriver.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }
}
