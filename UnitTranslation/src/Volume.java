public class Volume extends Measurement {

    public Volume(MeasurementType measurementType, double count) {
        this.measurementType = measurementType;
        this.count = count;
    }

    public Volume expressedIn(MeasurementType outType) {
        if (outType.measurementClass.equals(MeasurementClassification.Volume)) {
            return new Volume(outType, translateTo(outType));
        }
        return new Volume(MeasurementType.InvalidConversion, 0.0);
    }

    @Override
    public Volume plus(Measurement volume) {
        return new Volume(volume.getMeasurementType(), combineCounts(volume));
    }
}
