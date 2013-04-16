import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void shouldReturn12InchesIn1Foot(){
        Converter converter = new Converter();
        assertThat(converter.feetInInches(1), is(12));
    }

    @Test
    public void shouldReturn24InchesIn2Feet(){
        Converter converter = new Converter();
        assertThat(converter.feetInInches(2), is(24));
    }
}
