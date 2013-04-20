public class Length extends Measurement {

    public Length(MeasurementType measurementType, double count) {
        this.measurementType = measurementType;
        this.count = count;
    }

    public Length expressedIn(MeasurementType measurementType) {
        if (measurementType.measurementClass.equals(MeasurementClassification.Length)) {
            return new Length(measurementType, translateTo(measurementType));
        }
        return new Length(MeasurementType.InvalidConversion, 0.0);

    }

    @Override
    public Length plus(Measurement measurement) {
        return new Length(measurement.getMeasurementType(), combineCounts(measurement));
    }
}
