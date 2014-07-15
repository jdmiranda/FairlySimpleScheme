/***********
 * ApplyMul.java
 ***********/
import java.util.List;



public class ApplyMul implements Apply {
    public Val apply(List<Val> args) {
        double ret = 0.0;
        for (Val v : args) {
            ret = ret * v.getDouble();
        }
        return new Val(ret);
    }

}
