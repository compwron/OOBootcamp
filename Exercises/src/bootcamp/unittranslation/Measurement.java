package bootcamp.unittranslation;


public class Measurement {
    private final double baseUnitCount;

    private final MeasurementType measurementType;

    public Measurement(MeasurementType measurementType, double count) {
        this.measurementType = measurementType;
        this.baseUnitCount = translateToBaseCount(count);
    }

    private double translateToBaseCount(double count) {
        return measurementType.additive + count / measurementType.toBaseMultiplier;
    }

    private double translateToMeasurementCount(double baseUnitCount, int additive, Double multiplier) {
        return (baseUnitCount - additive) * multiplier;
    }

    public Measurement expressedIn(MeasurementType newMeasurementType) {
        if (measurementType.measurementClass.equals(newMeasurementType.measurementClass)) {
            return new Measurement(newMeasurementType, (baseUnitCount - newMeasurementType.additive) * newMeasurementType.toBaseMultiplier);
        }
        return new Measurement(MeasurementType.InvalidConversion, 0.0);
    }

    public Measurement plus(Measurement measurement) {
        Double totalBaseUnitCount = baseUnitCount + measurement.getBaseUnitCount();
        Double newMeasurementCount = translateToMeasurementCount(totalBaseUnitCount, measurement.measurementType.additive, measurement.measurementType.toBaseMultiplier);
        return new Measurement(measurement.measurementType, newMeasurementCount);
    }

    public double measurementUnitCount() {
        return translateToMeasurementCount(baseUnitCount, measurementType.additive, measurementType.toBaseMultiplier);
    }

    public String toString() {
        return measurementUnitCount() + " " + measurementType;
    }

    public double getBaseUnitCount() {
        return baseUnitCount;
    }

    public MeasurementType getMeasurementType() {
        return measurementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        if (Double.compare(that.baseUnitCount, baseUnitCount) != 0) return false;
        if (measurementType != that.measurementType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(baseUnitCount);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + measurementType.hashCode();
        return result;
    }
}
