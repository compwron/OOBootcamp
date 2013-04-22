import java.util.ArrayList;

class RectangleSet {
    private final ArrayList<Rectangle> rectangles;

    public RectangleSet(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public int totalArea() {
        int totalArea = 0;
        for (Rectangle rectangle : rectangles) {
            totalArea += rectangle.getArea();
        }
        return totalArea;
    }

    public String toString(){
        String string = "[";
        for (Rectangle rectangle : rectangles){
            string += rectangle.toString() + ", ";
        }
        return string + "]";
    }
}
