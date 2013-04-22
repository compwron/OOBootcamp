import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(rectangle());
        rectangles.add(rectangle());
        RectangleSet rectangleSet = new RectangleSet(rectangles);
        System.out.println("For the list of rectangles " + rectangleSet.toString() + " the area is: " + rectangleSet.totalArea());

        Rectangle rectangle = rectangle();
        Point inPoint = new Point(0,0);
        System.out.println("Does rectangle " + rectangle + " contain point " + inPoint + "?: " + rectangle.contains(inPoint));

        Point outPoint = new Point(10,10);
        System.out.println("Does rectangle " + rectangle + " contain point " + outPoint + "?: " + rectangle.contains(outPoint));
    }

    private static Rectangle rectangle() {
        return new Rectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));
    }
}
