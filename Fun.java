import org.antlr.v4.runtime.tree.*;
import org.antlr.*;

public class Fun{
    Environment env;
    String param;
    ParseTree body;



    public Fun(){

    }
    public Fun(String param, ParseTree body, Environment env) {
        this.param = param;
        this.body = body;
        this.env = env;
    }

    public Val apply(Val arg) {
        Environment newenv = new ExtendedEnvironment(env);
        newenv.addEntry(param, arg);
        SchemeEvalVisitor eval = new SchemeEvalVisitor();
        eval.setEnv(body, env);
        return eval.visit(body);
    }

    public String toString() {
        return "<fun>";
    }

}