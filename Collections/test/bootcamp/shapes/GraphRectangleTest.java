package bootcamp.shapes;

import bootcamp.shapes.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.awt.geom.Line2D;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GraphRectangleTest {
    private GraphRectangle graphRectangle;

    @Before
    public void setUp() {
        graphRectangle = new GraphRectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));
    }

    @Test
    public void plainRectangleShouldHaveWidthLengthConstructorAndReturnArea(){
        assertThat(new bootcamp.shapes.Rectangle(1, 3).getArea(), is(3.0));
    }

    @Test
    public void rectangleShouldHaveAreaOf6WhenSidesAre2And3() {
        assertThat(graphRectangle.getArea(), is(6.0));
    }

    @Test
    public void rectangleShouldNotThinkThatItContainsPointOutsideItself() {
        assertFalse(graphRectangle.contains(new Point(5, 5)));
    }

    @Test
    public void rectangleShouldContainItsOwnVertex() {
        assertTrue(graphRectangle.contains(new Point(0, 0)));
    }

    @Test
    public void rectangleShouldContainsPointOnOneOfItsEdges() {
        assertTrue(graphRectangle.contains(new Point(1, 2)));
    }

    @Test
    public void rectangleShouldNotContainPointOnOneOfTheLinesThatCompriseItsEdgesButNotInRectangle() {
        assertFalse(graphRectangle.contains(new Point(1, 3)));
    }

    @Test
    public void rectangleContainsPointInsideOfItself() {
        Assert.assertTrue(graphRectangle.contains(new Point(2, 1)));
    }

    @Test
    public void pointOnLineBeyondLineEdgeShouldNotBeOnLine() {
        assertFalse(graphRectangle.pointIsWithinEndpointsOf(new Line2D.Float(new Point(0, 0), new Point(1, 0)), new Point(2, 0)));
    }

    @Test
    public void pointOnLineAndNotBeyondLineEdgeShouldBeOnLine() {
        assertTrue(graphRectangle.pointIsWithinEndpointsOf(new Line2D.Float(new Point(0, 0), new Point(2, 0)), new Point(1, 0)));
    }

    @Test
    public void rectangleToStringShouldContainPointsAndArea(){
        assertThat(graphRectangle.toString(), is("Area:6.0;Points:0.0,0.0|0.0,2.0|3.0,2.0|3.0,0.0|"));
    }
}
