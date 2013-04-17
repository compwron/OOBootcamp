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

    public Measurement translateTo(Measurement measurement) {
        return null;
    }

    public boolean canBeTranslatedTo(Measurement measurement) {
        return false;
    }

    Double equivalentCountIn(Measurement measurement) {
        return (count * equivalentIn.get(measurement.getClass()));
    }
}
