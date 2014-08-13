/********************* 
 * ApplyAnd.java
 *********************/

import java.util.List;

class ApplyAnd implements Apply {
    public Val apply(List<Val> args) {
        if (args.size()==0) {
            System.out.println("Warning: 'eq' requires at least one operand");
            return new Val(false);
        }
        Boolean d = args.get(0).getBoolean();
        for (int i = 1; i < args.size(); i++ ) {
            Boolean r = args.get(i).getBoolean();
            if (r & d)
                return new Val(true);
            d = r;
        }
        return new Val(false);
    }
}