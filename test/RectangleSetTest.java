import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleSetTest {
    @Test
    public void shouldFindSumOfRectangleAreasForOneRectangle(){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle(1, 2));
        RectangleSet rectangleSet = new RectangleSet(rectangles);
        assertThat(rectangleSet.totalArea(), is(2));
    }

    @Test
    public void shouldFindSumOfRectangleAreasForMoreThanOneRectangle(){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(10, 3));
        RectangleSet rectangleSet = new RectangleSet(rectangles);
        assertThat(rectangleSet.totalArea(), is(32));
    }
}
