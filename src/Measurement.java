import java.util.HashMap;

public class Measurement {

    Double count = 0.0;

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    HashMap<Object, Double> equivalentIn = new HashMap<Object, Double>();
}
