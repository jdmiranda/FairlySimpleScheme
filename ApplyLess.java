import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.util.List;

public class ApplyLess implements Val {

    @Override
    public Object val(List<Object> args) {
        return (Double)args.get(0) < (Double)args.get(1);
    }
}
