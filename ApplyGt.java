/**************** 
 * ApplyGt.java
 ***************/
import java.util.List;

class ApplyGt implements Apply {
    public Val apply(List<Val> args) {
        if (args.size()==0) {
            System.out.println("Warning: 'gt' requires at least one operand");
            return new Val(false);
        }
        double d = args.get(0).getDouble();
        for (int i = 1; i < args.size(); i++ ) {
            double r = args.get(i).getDouble();
            if (r >= d)
                return new Val(false);
            d = r;
        }
        return new Val(true);
    }
} 
