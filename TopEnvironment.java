public class TopEnvironment extends Environment {

    public TopEnvironment() {
        super();
    }

    public Val lookupSymbol(String s) {
        System.out.println(s);
        Val v = map.get(s);
        if (v == null)
            throw new RuntimeException("Unbound variable: " + s);
        else
            return v;
    }
}