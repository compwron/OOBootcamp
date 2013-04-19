import lombok.Getter;

public class Length {

    @Getter
    private Double count;

    @Getter
    private LengthType lengthType;

    public Length(LengthType lengthType, double count) {
        this.lengthType = lengthType;
        this.count = count;
    }

    public Double expressedIn(LengthType lengthTypes) {
        return null;
    }
}
