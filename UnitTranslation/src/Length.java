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
    public Measurement plus(Measurement measurement) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Length plus(Length length) {
        return new Length(length.getMeasurementType(), combineCounts(length));
    }

    private double combineCounts(Length length) {
        return expressedIn(length.getMeasurementType()).getCount() + length.getCount();
    }
}
