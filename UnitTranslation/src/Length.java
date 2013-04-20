public class Length extends Measurement {

    public Length(MeasurementType measurementType, double count) {
        this.measurementType = measurementType;
        this.count = count;
    }

    public Length expressedIn(MeasurementType lengthType) {
        if (lengthType.measurementClass.equals(MeasurementClass.Length)) {
            return new Length(lengthType, translateTo(lengthType));
        }
        return new Length(MeasurementType.InvalidConversion, 0.0);

    }

    public String toString(){
        return count + " " + measurementType.name();
    }

    @Override
    public Length plus(Measurement measurement) {
        return new Length(measurement.getMeasurementType(), combineCounts(measurement));
    }

    private double combineCounts(Measurement measurement) {
        return expressedIn(measurement.getMeasurementType()).getCount() + measurement.getCount();
    }
}
