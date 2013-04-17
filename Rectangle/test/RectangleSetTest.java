import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleSetTest {
    Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));

    @Test
    public void shouldFindSumOfRectangleAreasForOneRectangle() {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(rectangle);
        RectangleSet rectangleSet = new RectangleSet(rectangles);
        assertThat(rectangleSet.totalArea(), is(6));
    }

    @Test
    public void shouldFindSumOfRectangleAreasForMoreThanOneRectangle() {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(rectangle);
        rectangles.add(rectangle);
        RectangleSet rectangleSet = new RectangleSet(rectangles);
        assertThat(rectangleSet.totalArea(), is(12));
    }
}
