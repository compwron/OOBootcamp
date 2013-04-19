import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class LengthTest {
    Length oneFoot;

    @Before
    public void setUp(){
        oneFoot = new Length(LengthType.Feet, 1.0);
    }

    @Test
    public void lengthShouldHaveTypeAndCount(){
        assertThat(oneFoot.getCount(), is(1.0));
        assertThat(oneFoot.getLengthType(), is(LengthType.Feet));
    }

    @Test
    public void oneFootShouldBeTwelveInches(){
        assertThat(oneFoot.expressedIn(LengthType.Inches), is(new Length(LengthType.Inches, 12.0)));
    }

}
