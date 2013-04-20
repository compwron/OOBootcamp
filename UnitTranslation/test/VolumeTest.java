import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolumeTest {
    @Test
    public void oneTbspIsThreeTsp() {
        Volume oneTbsp = new Volume(MeasurementType.Tablespoons, 1.0);
        assertThat(oneTbsp.expressedIn(MeasurementType.Teaspoons).getCount(), is(3.0));
    }

    @Test
    public void oneTspIsHalfOfATbsp() {
        Volume oneTsp = new Volume(MeasurementType.Teaspoons, 1.0);
        assertThat(oneTsp.expressedIn(MeasurementType.Tablespoons).getCount(), is(0.3333333333333333));
    }

    @Test
    public void oneCupShouldContain16Tablespoons() {
        Volume oneCup = new Volume(MeasurementType.Cups, 1.0);
        assertThat(oneCup.expressedIn(MeasurementType.Tablespoons).getCount(), is(16.0));
    }

    @Test
    public void oneCupShouldContain48Teaspoons() {
        Volume oneCup = new Volume(MeasurementType.Cups, 1.0);
        assertThat(oneCup.expressedIn(MeasurementType.Teaspoons).getCount(), is(48.0));
    }

    @Test
    public void shouldThrowInvalidConversionErrorWhenAttemptingToTranslateAVolumeToALength() {
        Volume oneCup = new Volume(MeasurementType.Cups, 1.0);
        assertThat(oneCup.expressedIn(MeasurementType.Inches), is(new Volume(MeasurementType.InvalidConversion, 0.0)));
    }

    @Test()
    public void lengthShouldPrintCountAndTypeInToString(){
        assertThat(new Volume(MeasurementType.Tablespoons, 1.0).toString(), is("1.0 Tablespoons"));
    }

}
