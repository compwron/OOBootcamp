import org.junit.Test;

import java.awt.*;

import static junit.framework.Assert.assertFalse;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
   @Test
    public void rectangleKnowsItsArea(){
        Rectangle rectangle = new Rectangle(1, 2);
       assertThat(rectangle.getArea(), is(2));
   }

   @Test
    public void rectangleDoesNotContainPointOutsideItself(){
       Rectangle rectangle = new Rectangle(new Point(1, 2), new Point(1, 2), new Point(1, 2), new Point(1, 2));
       assertFalse(rectangle.contains(new Point(3, 3)));
   }
}
