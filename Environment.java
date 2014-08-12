/***************
 * Environment data type
 **************/

import java.util.HashMap;

public abstract class Environment {
    HashMap<String,Val> map;
    public Environment() {
        this.map = new HashMap<String,Val>();
    }
    public void addEntry(String s, Val val) {
        map.put(s, val);
    }
    public abstract Val lookupSymbol(String s);
    public Val get(String s) {
        return lookupSymbol(s);
    }
    public String toString() {
        return map.toString();
    }
}
