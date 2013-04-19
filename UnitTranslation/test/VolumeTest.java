import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolumeTest {
    @Test
    public void oneTbspIsTwoTsp(){
        Volume oneTbsp = new Volume(VolumeType.Tablespoons, 1.0);
        assertThat(oneTbsp.expressedIn(VolumeType.Teaspoons).getCount(), is(2.0));
    }

    @Test
    public void oneTspIsHalfOfATbsp(){
        Volume oneTsp = new Volume(VolumeType.Teaspoons, 1.0);
        assertThat(oneTsp.expressedIn(VolumeType.Tablespoons).getCount(), is(0.5));
    }
}
