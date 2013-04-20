import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public abstract class Measurement {
    @Getter
    protected Double count;

    @Getter
    MeasurementType measurementType;
    private MeasurementClass measurementClass;


    public abstract Measurement expressedIn(MeasurementType measurementType);

    double translateTo(MeasurementType outType) {
        return count * outType.toBaseMultiplier() / measurementType.toBaseMultiplier();
    }

    public String toString(){
        return count + " " + measurementType.name();
    }

    public abstract Measurement plus(Measurement measurement);


    private double combineCounts(Measurement measurement) {
        return expressedIn(measurement.getMeasurementType()).getCount() + measurement.getCount();
    }
}
