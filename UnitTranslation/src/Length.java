import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Length {

    @Getter
    private Double count;

    @Getter
    private MeasurementType lengthType;

    public Length(MeasurementType lengthType, double count) {
        this.lengthType = lengthType;
        this.count = count;
    }

    public Length expressedIn(MeasurementType lengthType) throws InvalidConversionError {
        if (lengthType.measurementClass.equals(MeasurementClass.Length)) {
            return new Length(lengthType, translateTo(lengthType));
        }
        throw new InvalidConversionError();

    }

    private double translateTo(MeasurementType outType) {
        return count * outType.toBaseMultiplier() / lengthType.toBaseMultiplier();
    }
}
