/***********
 * ApplyDiv.java
 ***********/
import java.lang.Double;
import java.lang.Object;
import java.util.List;


public class ApplyDiv implements Apply {

    public Object apply(List<Double> args) {
        double ret = 0.0;
        if (args.isEmpty()) {
            System.out.println("Illegal call: (/)");
            System.exit(1);
        } else if (args.size() == 1) {
            ret = -args.get(0);
        } else {
            ret = args.get(0);
            for (int i = 1; i < args.size(); i++)
                ret = ret / args.get(i);
        }
        return ret;
    }
}
