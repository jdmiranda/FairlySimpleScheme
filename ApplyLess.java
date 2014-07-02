import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.util.List;

public class ApplyLess implements Val {

    @Override
    public Object val(List<Double> args) {
        return args.get(0) < args.get(1);
    }
}
