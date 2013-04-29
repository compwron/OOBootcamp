import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Measurement {
    @Getter
    private final double baseUnitCount;

    @Getter
    private final MeasurementType measurementType;

    public Measurement(MeasurementType measurementType, double count) {
        this.measurementType = measurementType;
        this.baseUnitCount = translateToBaseCount(count);
    }

    private double translateToBaseCount(double count) {
        return measurementType.additive + count / measurementType.toBaseMultiplier();
    }

    private double translate(double baseUnitCount, int additive, Double multiplier) {
        return (baseUnitCount - additive) * multiplier;
    }

    public Measurement expressedIn(MeasurementType newMeasurementType) {
        if (measurementType.measurementClass.equals(newMeasurementType.measurementClass)) {
            return new Measurement(newMeasurementType, (baseUnitCount -  newMeasurementType.additive) * newMeasurementType.toBaseMultiplier());
        }
        return new Measurement(MeasurementType.InvalidConversion, 0.0);
    }

    public Measurement plus(Measurement measurement) {
        Double totalBaseUnitCount = baseUnitCount + measurement.getBaseUnitCount();
        Double newMeasurementCount = translate(totalBaseUnitCount, measurement.measurementType.additive, measurement.measurementType.toBaseMultiplier());
        return new Measurement(measurement.measurementType, newMeasurementCount);
    }

    public double measurementUnitCount() {
        return translate(baseUnitCount, measurementType.additive, measurementType.toBaseMultiplier());
    }

    public String toString() {
        return measurementUnitCount() + " " + measurementType;
    }
}
