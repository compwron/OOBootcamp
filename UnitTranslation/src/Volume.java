import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Volume {

    @Getter
    private Double count;

    @Getter
    private VolumeType volumeType;

    public Volume(VolumeType volumeType, double count) {
        this.volumeType = volumeType;
        this.count = count;
    }

    public Volume expressedIn(VolumeType outType) {
        return new Volume(volumeType, translateTo(outType, count));
    }

    private double translateTo(VolumeType outType, Double count) {
        return count * 1 / volumeType.toBaseMultiplier() * outType.toBaseMultiplier();
    }
}
