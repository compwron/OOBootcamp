import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Measurement {
    @Getter
    protected Double baseCount;

    @Getter
    MeasurementType defaultMeasurementType;

    public Measurement(MeasurementType measurementType, double count) {
        this.defaultMeasurementType = measurementType;
        this.baseCount = getBaseCount(count);
    }

    public Measurement expressedIn(MeasurementType newType) {
        if (defaultMeasurementType.measurementClass.equals(newType.measurementClass)) {
            return new Measurement(newType, translateTo(newType));
        }
        return new Measurement(MeasurementType.InvalidConversion, 0.0);

    }

    public Measurement plus(Measurement measurement) {
        double sum = measurement.getCount() + this.translateTo(measurement.getDefaultMeasurementType());
        return new Measurement(measurement.getDefaultMeasurementType(), sum);
    }

    double translateTo(MeasurementType outType) {
        return (baseCount - outType.additive) * outType.toBaseMultiplier();
    }

    protected double getBaseCount(double count) {
        return (count / defaultMeasurementType.toBaseMultiplier()) + defaultMeasurementType.additive;
    }

    public String toString() {
        return baseCount + " " + defaultMeasurementType.name();
    }

//    double combineCounts(Measurement measurement) {
//        return (measurement.getBaseCount() + baseCount) * measurement.;
//    }

    public Double getCount() {
        return translateTo(defaultMeasurementType);
    }
}
