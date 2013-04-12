import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
    Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));
    }

    @Test
    public void rectangleKnowsItsArea() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertThat(rectangle.getArea(), is(2));
    }

    @Test
    public void rectangleDoesNotContainPointOutsideItself() {
        assertFalse(rectangle.contains(new Point(5, 5)));
    }

    @Test
    public void rectangleContainsItsOwnVertex() {
        assertTrue(rectangle.contains(new Point(0, 0)));
    }

    @Test
    public void rectangleContainsPointOnOneOfItsEdges() {
        assertTrue(rectangle.contains(new Point(1, 2)));
    }

    @Test
    public void rectangleDoesNotContainPointOnOneOfTheLinesThatCompriseItsEdgesButNotInRectangle() {
        assertFalse(rectangle.contains(new Point(1, 3)));
    }

    @Test
    public void rectangleContainsPointInsideOfItself(){
        Assert.assertTrue(rectangle.contains(new Point(2, 1)));
    }
}
