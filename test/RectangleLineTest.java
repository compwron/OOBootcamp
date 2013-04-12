import org.junit.Test;

import java.awt.*;

import static junit.framework.Assert.assertFalse;

public class RectangleLineTest {

    @Test
    public void lineKnowsWhenItDoesNotContainAPoint(){
        RectangleLine line = new RectangleLine(new Point(0,0), new Point(1, 1));
        assertFalse(line.contains(new Point(0,1)));
    }
}
