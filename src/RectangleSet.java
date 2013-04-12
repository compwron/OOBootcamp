import java.util.ArrayList;

public class RectangleSet {
    private final ArrayList<Rectangle> rectangles;

    public RectangleSet(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public int totalArea() {
        int totalArea = 0;
        for (Rectangle rectangle : rectangles){
            totalArea += rectangle.getArea();
        }
        return totalArea;
    }
}
