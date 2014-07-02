import java.util.List;

public class ApplyEqual implements Apply {

    public Object apply(List<Object> args) {
        double ret = 0.0;
        double val = 0.0;
        int counter = 0;
        for (Double v : args) {
            if (counter == 0) {
                ret = v;
            }
            counter++;

            if (ret == v) {
                val = 1.0;
            } else {
                val = 0.0;
            }
        }

        return val;
    }
}

