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

    public Volume expressedIn(MeasurementType outType) throws InvalidConversionError {
        if (outType.measurementClass.equals(MeasurementClass.Volume)) {
            return new Volume(volumeType, translateTo(outType, count));
        }
        throw new InvalidConversionError();
    }

    private double translateTo(MeasurementType outType, Double count) {
        return count * 1 / volumeType.toBaseMultiplier() * outType.toBaseMultiplier();
    }
}
