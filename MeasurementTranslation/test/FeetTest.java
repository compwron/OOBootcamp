import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FeetTest {
    @Test
    public void feetShouldBeCreatedKnowingHowManyFeetItIs() {
        Feet feet = new Feet(1.0);
        assertThat(feet.getCount(), is(1.0));
    }

    @Test
    public void feetCreatedWithoutCountHasCountOf0() {
        Feet feet = new Feet();
        assertThat(feet.getCount(), is(0.0));
    }

    @Test
    public void oneFootShouldTranslateTo12Inches() {
        Feet feet = new Feet(1.0);
        assertThat(feet.translateTo(new Inches()).getCount(), is(12.0));
    }
}
