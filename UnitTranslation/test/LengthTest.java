import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class LengthTest {
    private Length oneFoot;

    @Before
    public void setUp() {
        oneFoot = new Length(MeasurementType.Feet, 1.0);
    }

    @Test
    public void lengthsWithSameValuesShouldBeEqual() {
        assertEquals(new Length(MeasurementType.Inches, 1), new Length(MeasurementType.Inches, 1));
    }

    @Test
    public void lengthShouldHaveTypeAndCount() {
        assertThat(oneFoot.getCount(), is(1.0));
        assertThat(oneFoot.getMeasurementType(), is(MeasurementType.Feet));
    }

    @Test
    public void oneFootShouldBeTwelveInches() {
        Length oneFootInInches = oneFoot.expressedIn(MeasurementType.Inches);
        assertThat(oneFootInInches.getCount(), is(12.0));
    }

    @Test
    public void thirtyInchesShouldBeTwoAndAHalfFeet() {
        Length twoAndAHalfFeetInInches = new Length(MeasurementType.Inches, 30);
        Length expectedTwoAndAHalfFeet = twoAndAHalfFeetInInches.expressedIn(MeasurementType.Feet);
        assertThat(expectedTwoAndAHalfFeet.getCount(), is(2.5));
    }

    @Test
    public void thereShouldBe3FeetInAYard() {
        Length oneYard = new Length(MeasurementType.Yards, 1);
        assertThat(oneYard.expressedIn(MeasurementType.Feet).getCount(), is(3.0));
    }

    @Test
    public void thereShouldBe36InchesInAYard() {
        Length oneYard = new Length(MeasurementType.Yards, 1);
        assertThat(oneYard.expressedIn(MeasurementType.Inches).getCount(), is(36.0));
    }

    @Test
    public void thereShouldBe1YardFor3Feet() {
        Length oneYard = new Length(MeasurementType.Feet, 3);
        assertThat(oneYard.expressedIn(MeasurementType.Yards).getCount(), is(1.0));
    }

    @Test
    public void oneInchShouldBeOneInch() {
        Length oneInch = new Length(MeasurementType.Inches, 1);
        assertThat(oneInch.expressedIn(MeasurementType.Inches).getCount(), is(1.0));
    }

    @Test()
    public void shouldReturnLengthWithTypeInvalidConversionWithCountOfZeroWhenAttemptingToTranslateALengthToAVolume() {
        Length oneInch = new Length(MeasurementType.Inches, 1.0);
        assertThat(oneInch.expressedIn(MeasurementType.Teaspoons), is(new Length(MeasurementType.InvalidConversion, 0.0)));
    }

    @Test()
    public void lengthShouldPrintCountAndTypeInToString() {
        assertThat(oneFoot.toString(), is("1.0 Feet"));
    }

    @Test
    public void addingOneFootAndOneInchShouldBe13Inches() {
        Length oneFootAndOneInch = oneFoot.plus(new Length(MeasurementType.Inches, 1.0));
        assertThat(oneFootAndOneInch, is(new Length(MeasurementType.Inches, 13.0)));
    }
}
