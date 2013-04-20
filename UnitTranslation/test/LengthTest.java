import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class LengthTest {
    Length oneFoot;

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
        assertThat(oneFoot.getLengthType(), is(MeasurementType.Feet));
    }

    @Test
    public void oneFootShouldBeTwelveInches() throws InvalidConversionError {
        Length oneFootInInches = oneFoot.expressedIn(MeasurementType.Inches);
        assertThat(oneFootInInches.getCount(), is(12.0));
    }

    @Test
    public void thirtyInchesShouldBeTwoAndAHalfFeet() throws InvalidConversionError {
        Length twoAndAHalfFeetInInches = new Length(MeasurementType.Inches, 30);
        Length expectedTwoAndAHalfFeet = twoAndAHalfFeetInInches.expressedIn(MeasurementType.Feet);
        assertThat(expectedTwoAndAHalfFeet.getCount(), is(2.5));
    }

    @Test
    public void thereShouldBe3FeetInAYard() throws InvalidConversionError {
        Length oneYard = new Length(MeasurementType.Yard, 1);
        assertThat(oneYard.expressedIn(MeasurementType.Feet).getCount(), is(3.0));
    }

    @Test
    public void thereShouldBe36InchesInAYard() throws InvalidConversionError {
        Length oneYard = new Length(MeasurementType.Yard, 1);
        assertThat(oneYard.expressedIn(MeasurementType.Inches).getCount(), is(36.0));
    }

    @Test
    public void thereShouldBe1YardFor3Feet() throws InvalidConversionError {
        Length oneYard = new Length(MeasurementType.Feet, 3);
        assertThat(oneYard.expressedIn(MeasurementType.Yard).getCount(), is(1.0));
    }

    @Test
    public void oneInchShouldBeOneInch() throws InvalidConversionError {
        Length oneInch = new Length(MeasurementType.Inches, 1);
        assertThat(oneInch.expressedIn(MeasurementType.Inches).getCount(), is(1.0));
    }

    @Test(expected = InvalidConversionError.class)
    public void shouldThrowInvalidConversionErrorWhenAttemptingToTranslateALengthToAVolume() throws InvalidConversionError {
        Length oneInch = new Length(MeasurementType.Inches, 1.0);
        oneInch.expressedIn(MeasurementType.Teaspoons);
    }
}
