/***********
 * ApplyPlus.java
 ***********/
import java.util.List;

public class ApplyPlus implements Apply {

    public Object apply(List<Double> args) {
        double ret = 0.0;
        for (Double v : args) {
            ret +=   v;
        }
        return ret;
    }

}
