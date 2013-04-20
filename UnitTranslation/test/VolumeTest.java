import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolumeTest {
    Volume oneCup;

    @Before
    public void setUp(){
        oneCup = new Volume(MeasurementType.Cups, 1.0);
    }

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
        assertThat(oneCup.expressedIn(MeasurementType.Tablespoons).getCount(), is(16.0));
    }

    @Test
    public void oneCupShouldContain48Teaspoons() {
        assertThat(oneCup.expressedIn(MeasurementType.Teaspoons).getCount(), is(48.0));
    }

    @Test
    public void shouldThrowInvalidConversionErrorWhenAttemptingToTranslateAVolumeToALength() {
        assertThat(oneCup.expressedIn(MeasurementType.Inches), is(new Volume(MeasurementType.InvalidConversion, 0.0)));
    }

    @Test
    public void lengthShouldPrintCountAndTypeInToString(){
        assertThat(new Volume(MeasurementType.Tablespoons, 1.0).toString(), is("1.0 Tablespoons"));
    }

    @Test
    public void addingOneCupAndOneTablespoonShouldBe17Tablespoons(){
        Volume oneCupAndOneTablespoon = oneCup.plus(new Volume(MeasurementType.Tablespoons, 1.0));
        assertThat(oneCupAndOneTablespoon, is(new Volume(MeasurementType.Tablespoons, 17.0)));
    }

    @Test
    public void addingOneTablespoonAndOneTeaspoonShouldBe4Teaspoons(){
        Volume oneTablespoonAndOneTeaspoon = new Volume(MeasurementType.Tablespoons, 1.0).plus(new Volume(MeasurementType.Teaspoons, 1.0));
        assertThat(oneTablespoonAndOneTeaspoon, is(new Volume(MeasurementType.Teaspoons, 4.0)));
    }

}
