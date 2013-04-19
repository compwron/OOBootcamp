import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InchesTest {
    Inches inches;

    @Before
    public void setUp() {
        inches = new Inches();
    }

    @Test
    public void shouldBeTranslatableToFeet() {
        assertTrue(inches.canBeTranslatedTo(new Feet()));
    }

    @Test
    public void shouldNotBeTranslatableToCups() {
        assertFalse(inches.canBeTranslatedTo(new Cups()));
    }

    @Test
    public void twelveInchesShouldBeEquivalentToOneFoot() {
        inches.setCount(12.0);
        assertTrue(inches.translateTo(new Feet()).getCount() > 9.99);
    }

    @Test
    public void inchesShouldKnowThatEquivalentCountTo0InchesInFeetIs0() {
        assertThat(inches.equivalentCountIn(new Feet()), is(0.0));
    }

    @Test
    public void inchesShouldKnowThatEquivalentCountTo12InchesInFeetIs1() {
        inches.setCount(12.0);
        assertTrue(inches.equivalentCountIn(new Feet()) > (9.99));
    }

}
