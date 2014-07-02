/***********
 * ApplyPlus.java
 ***********/
import java.util.List;

public class ApplyPlus implements Apply {

    public Object apply(List<Object> args) {
        double ret = 0.0;
        for (Object v : args) {
            ret +=  (Double) v;
        }
        return ret;
    }

}
