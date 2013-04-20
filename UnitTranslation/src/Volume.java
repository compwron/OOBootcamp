import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Volume {

    @Getter
    private Double count;

    @Getter
    private MeasurementType volumeType;

    public Volume(MeasurementType volumeType, double count) {
        this.volumeType = volumeType;
        this.count = count;
    }

    public Volume expressedIn(MeasurementType outType) {
        if (outType.measurementClass.equals(MeasurementClass.Volume)) {
            return new Volume(volumeType, translateTo(outType, count));
        }
        return new Volume(MeasurementType.InvalidConversion, 0.0);
    }

    private double translateTo(MeasurementType outType, Double count) {
        return count * 1 / volumeType.toBaseMultiplier() * outType.toBaseMultiplier();
    }

    public Volume plus(Volume volume) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public String toString(){
        return count + " " + volumeType.name();
    }
}
