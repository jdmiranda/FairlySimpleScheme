/***********
 * ApplyMinus.java
 ***********/
import java.util.List;


public class ApplyMinus implements Apply {

    public Object apply(List<Object> args) {
        double ret = 0.0;
        if (args.isEmpty()) {
            System.out.println("Illegal call: (-)");
            System.exit(1);
        } else if (args.size() == 1) {
            ret = (Double) -args.get(0);
        } else {
            ret = (Double) args.get(0);
            for (int i = 1; i < args.size(); i++)
                ret -= (Double) args.get(i);
        }
        return ret;
    }
}
