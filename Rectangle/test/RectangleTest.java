import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.awt.geom.Line2D;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));
    }

    @Test
    public void rectangleShouldHaveAreaOf6WhenSidesAre2And3() {
        assertThat(rectangle.getArea(), is(6.0));
    }

    @Test
    public void rectangleShouldNotThinkThatItContainsPointOutsideItself() {
        assertFalse(rectangle.contains(new Point(5, 5)));
    }

    @Test
    public void rectangleShouldContainItsOwnVertex() {
        assertTrue(rectangle.contains(new Point(0, 0)));
    }

    @Test
    public void rectangleShouldContainsPointOnOneOfItsEdges() {
        assertTrue(rectangle.contains(new Point(1, 2)));
    }

    @Test
    public void rectangleShouldNotContainPointOnOneOfTheLinesThatCompriseItsEdgesButNotInRectangle() {
        assertFalse(rectangle.contains(new Point(1, 3)));
    }

    @Test
    public void rectangleContainsPointInsideOfItself() {
        Assert.assertTrue(rectangle.contains(new Point(2, 1)));
    }

    @Test
    public void pointOnLineBeyondLineEdgeShouldNotBeOnLine() {
        assertFalse(rectangle.pointIsWithinEndpointsOf(new Line2D.Float(new Point(0, 0), new Point(1, 0)), new Point(2, 0)));
    }

    @Test
    public void pointOnLineAndNotBeyondLineEdgeShouldBeOnLine() {
        assertTrue(rectangle.pointIsWithinEndpointsOf(new Line2D.Float(new Point(0, 0), new Point(2, 0)), new Point(1, 0)));
    }

    @Test
    public void rectangleToStringShouldContainPointsAndArea(){
        assertThat(rectangle.toString(), is("Area:6.0;Points:0.0,0.0|0.0,2.0|3.0,2.0|3.0,0.0|"));
    }
}
