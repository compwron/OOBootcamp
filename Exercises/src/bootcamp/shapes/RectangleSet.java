package bootcamp.shapes;

import java.util.ArrayList;

class RectangleSet {
    private final ArrayList<GraphRectangle> graphRectangles;

    public RectangleSet(ArrayList<GraphRectangle> graphRectangles) {
        this.graphRectangles = graphRectangles;
    }

    public int totalArea() {
        int totalArea = 0;
        for (GraphRectangle graphRectangle : graphRectangles) {
            totalArea += graphRectangle.getArea();
        }
        return totalArea;
    }

    public String toString() {
        String string = "[";
        for (GraphRectangle graphRectangle : graphRectangles) {
            string += graphRectangle.toString() + ", ";
        }
        return string + "]";
    }
}
