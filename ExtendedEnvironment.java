class ExtendedEnvironment extends Environment {

    Environment enclosingEnv;

    public ExtendedEnvironment(Environment enclosingEnv) {
        super();
        this.enclosingEnv = enclosingEnv;
    }

    public Val lookupSymbol(String s) {
        Val v = map.get(s);
        if (v == null)
            return enclosingEnv.lookupSymbol(s);
        else
            return v;
    }
}