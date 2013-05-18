package bootcamp.shapes;

import java.awt.*;
import java.util.ArrayList;

public class RectangleMain {
    public static void main(String[] args) {
        ArrayList<GraphRectangle> graphRectangles = new ArrayList<GraphRectangle>();
        graphRectangles.add(rectangle());
        graphRectangles.add(rectangle());
        RectangleSet rectangleSet = new RectangleSet(graphRectangles);
        System.out.println("For the list of graphRectangles " + rectangleSet.toString() + " the area is: " + rectangleSet.totalArea());

        GraphRectangle graphRectangle = rectangle();
        Point inPoint = new Point(0, 0);
        System.out.println("Does graphRectangle " + graphRectangle + " contain point " + inPoint + "?: " + graphRectangle.contains(inPoint));

        Point outPoint = new Point(10, 10);
        System.out.println("Does graphRectangle " + graphRectangle + " contain point " + outPoint + "?: " + graphRectangle.contains(outPoint));
    }

    private static GraphRectangle rectangle() {
        return new GraphRectangle(new Point(0, 0), new Point(0, 2), new Point(3, 2), new Point(3, 0));
    }
}
