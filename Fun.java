/**********************
 * Fun.java
 *********************/

import org.antlr.v4.runtime.tree.*;

class Fun {
    String param;
    ParseTree body;
    Environment env;

    public Fun(String param, ParseTree body, Environment env) {
        this.param = param;
        this.body = body;
        this.env = env;
    }

    public Val apply(Val arg) {
        Environment newenv = new ExtendedEnvironment(env);
        newenv.addEntry(param, arg);
        SchemeEvalVisitor eval = new SchemeEvalVisitor();
        eval.setEnv(body, newenv);
        Val res = eval.visit(body);
        return res;
    }

    public String toString() {
        return "<fun>";
    }
}