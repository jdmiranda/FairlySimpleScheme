/*********** 
 * ApplyDiv.java
 ***********/
import java.util.List;

public class ApplyDiv implements Apply {

    public Val apply(List<Val> args) {
        double ret = 0.0;
        if (args.isEmpty()) {
            System.out.println("Illegal call: (-)");
            System.exit(1);
        } else if (args.size() == 1) {
            ret = -args.get(0).getDouble();
        } else {
            ret = args.get(0).getDouble();
            for (int i = 1; i < args.size(); i++)
                ret =  ret - args.get(i).getDouble();
        }
        return new Val(ret);
    }
} 