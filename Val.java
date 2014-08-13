/**********************
 * Val.java 
 *********************/

public class Val {

    static enum ValType { DOUBLE, BOOLEAN, FUN };

    Double d;
    Boolean b;
    ValType curType;
    Fun f;

    public Val() {
        this(0.0);
    }

    public Val(Fun f){
        this.f = f;
        this.curType = ValType.FUN;
    }

    public Val(Double d) {
        this.d = d;
        this.curType = ValType.DOUBLE;
    }

    public Val(Boolean b) {
        this.b = b;
        this.curType = ValType.BOOLEAN;
    }

    public Fun getFun(){
        if (!isType(ValType.FUN))
            throw new RuntimeException("Val does not wrap Fun");
        return this.f;
    }
    public Double getDouble() {
        if (!isType(ValType.DOUBLE))
            throw new RuntimeException("Val does not wrap Double");
        return this.d;
    }

    public Boolean getBoolean() {
        if (!isType(ValType.BOOLEAN))
            throw new RuntimeException("Val does not wrap Boolean");
        return this.b;
    }

    public ValType getType() {
        return this.curType;
    }

    public boolean isType(ValType v) {
        return this.curType == v;
    }

    public String toString() {
        String res = "";
        switch (getType()) {

            case DOUBLE: res = this.d.toString(); break;
            case BOOLEAN: res = this.b.toString(); break;
            case FUN: res = this.f.toString(); break;
            default: throw new RuntimeException("Val: unknown type");
        }
        return res;
    }
}