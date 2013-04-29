import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Measurement {
    @Getter
    private final double baseUnitCount;

    @Getter
    private final MeasurementType measurementType;

    public Measurement(MeasurementType measurementType, double count){
        this.measurementType = measurementType;
        this.baseUnitCount = getBaseCount(count);
    }

    private double getBaseCount(double count) {
        return count / measurementType.toBaseMultiplier();
    }

    public double getCountInMeasurement(){
        return baseUnitCount * measurementType.toBaseMultiplier();
    }

    public Measurement expressedIn(MeasurementType newMeasurementType) {
        return new Measurement(newMeasurementType, baseUnitCount * newMeasurementType.toBaseMultiplier());
    }

    public Measurement plus(Measurement measurement) {
        Double totalBaseUnitCount = baseUnitCount + measurement.getBaseUnitCount();
        return new Measurement(measurement.measurementType, totalBaseUnitCount * measurement.measurementType.toBaseMultiplier());
    }

    public String toString(){
        return getCountInMeasurement() + " " + measurementType;
    }
}
