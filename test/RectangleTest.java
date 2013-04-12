import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
   @Test
    public void rectangleKnowsItsArea(){
        Rectangle rectangle = new Rectangle(1, 2);
       assertThat(rectangle.getArea(), is(2));
   }
}
