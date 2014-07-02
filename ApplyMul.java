/***********
 * ApplyMul.java
 ***********/
import java.util.List;



public class ApplyMul implements Apply {

    public Object apply(List<Double> args) {
        double ret = 0.0;
        for (Double v : args) {
            ret = ret * v;
        }
        return ret;
    }

}
