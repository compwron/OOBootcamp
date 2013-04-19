import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolumeTest {
    @Test
    public void oneTbspIsThreeTsp(){
        Volume oneTbsp = new Volume(VolumeType.Tablespoons, 1.0);
        assertThat(oneTbsp.expressedIn(VolumeType.Teaspoons).getCount(), is(3.0));
    }

    @Test
    public void oneTspIsHalfOfATbsp(){
        Volume oneTsp = new Volume(VolumeType.Teaspoons, 1.0);
        assertThat(oneTsp.expressedIn(VolumeType.Tablespoons).getCount(), is(0.3333333333333333));
    }
}
