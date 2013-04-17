import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    Converter converter;
    @Before
    public void setUp(){
        converter = new Converter();
    }
    @Test
    public void shouldReturn12InchesIn1Foot(){
        assertThat(converter.feetInInches(1), is(12));
    }

    @Test
    public void shouldReturn24InchesIn2Feet(){
        assertThat(converter.feetInInches(2), is(24));
    }

    @Test
    public void shouldReturn1FootFor12Inches(){
        assertThat(converter.inchesInFeet(12), is(1));
    }

    @Test
    public void shouldReturn2FeetFor24Inches(){
        assertThat(converter.inchesInFeet(24), is(2));
    }
}
