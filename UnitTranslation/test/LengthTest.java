import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void lengthShouldHaveTypeAndCount(){
        Length oneFoot = new Length(LengthType.Feet, 1.0);
        assertThat(oneFoot.getCount(), is(1.0));
        assertThat(oneFoot.getType(), is(LengthType.Feet));
    }

}
