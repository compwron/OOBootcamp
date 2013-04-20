public class Volume extends Measurement {

    public Volume(MeasurementType measurementType, double count) {
        this.measurementType = measurementType;
        this.count = count;
    }

    public Volume expressedIn(MeasurementType outType) {
        if (outType.measurementClass.equals(MeasurementClass.Volume)) {
            return new Volume(measurementType, translateTo(outType));
        }
        return new Volume(MeasurementType.InvalidConversion, 0.0);
    }

    public Volume plus(Volume volume) {
        return new Volume(volume.getMeasurementType(), combineCounts(volume));
    }

    private double combineCounts(Volume volume) {
        return expressedIn(volume.getMeasurementType()).getCount() + volume.getCount();
    }

    public String toString(){
        return count + " " + measurementType.name();
    }

    @Override
    public Measurement plus(Measurement measurement) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
