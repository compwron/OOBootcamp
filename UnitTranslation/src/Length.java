import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Length {

    @Getter
    private Double count;

    @Getter
    private LengthType lengthType;

    public Length(LengthType lengthType, double count) {
        this.lengthType = lengthType;
        this.count = count;
    }

    public Length expressedIn(LengthType lengthType) {
        return new Length(lengthType, translateTo(lengthType, count));
    }

    private double translateTo(LengthType outType, Double count) {
        return count * 1 / lengthType.toBaseMultiplier() * outType.toBaseMultiplier();
    }
}
