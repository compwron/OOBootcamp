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

    public Length expressedIn(MeasurementType lengthType) {
        if (lengthType.measurementClass.equals(MeasurementClass.Length)) {
            return new Length(lengthType, translateTo(lengthType));
        }
        return new Length(MeasurementType.InvalidConversion, 0.0);

    }

    private double translateTo(MeasurementType outType) {
        return count * outType.toBaseMultiplier() / lengthType.toBaseMultiplier();
    }
}
