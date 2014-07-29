public class Symbol { // A generic programming language symbol
    public static enum Type {tINVALID, tVOID, tINT, tFLOAT}

    String name;      // All symbols at least have a name
    Val val;
    Scope scope;      // All symbols know what scope contains them.

    public Symbol(String name) { this.name = name; }
    public Symbol(String name, Val val) { this(name); this.val = val; }
    public String getName() { return name; }

    /*public String toString() {
        if ( type!=Type.tINVALID ) return '<'+getName()+":"+type+'>';
        return getName();
    }*/
}