package bootcamp.shapes;

import bootcamp.shapes.GraphRectangle;
import bootcamp.shapes.RectangleSet;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleSetTest {
    private final GraphRectangle graphRectangle = new GraphRectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));

    @Test
    public void sumOfRectangleAreasForOneRectangleWithSidesLength2And3ShouldBe6() {
        ArrayList<GraphRectangle> graphRectangles = new ArrayList<GraphRectangle>();
        graphRectangles.add(graphRectangle);
        RectangleSet rectangleSet = new RectangleSet(graphRectangles);
        assertThat(rectangleSet.totalArea(), is(6));
    }

    @Test
    public void shouldFindSumOfRectangleAreasForMoreThanOneRectangle() {
        ArrayList<GraphRectangle> graphRectangles = new ArrayList<GraphRectangle>();
        graphRectangles.add(graphRectangle);
        graphRectangles.add(graphRectangle);
        RectangleSet rectangleSet = new RectangleSet(graphRectangles);
        assertThat(rectangleSet.totalArea(), is(12));
    }
}
