import java.util.HashMap;

public abstract class Measurement {

    private Double count;

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    HashMap<Measurement, Double> equivalentIn = new HashMap<Measurement, Double>();

    public Measurement translateTo(Measurement measurement) {
        if(canBeTranslatedTo(measurement)){
            Double equivalentCount = equivalentCountIn(measurement);
            measurement.setCount(equivalentCount);
            return measurement;
        }
        return null;
    }

    public abstract boolean canBeTranslatedTo(Measurement measurement);

    Double equivalentCountIn(Measurement measurement) {
        return count * equivalentIn.get(measurement);
    }
}
