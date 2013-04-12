import java.awt.*;

public class Rectangle {
    private int area;

    // TODO: refactor away this constructor
    public Rectangle(int length, int width) {
        this.area = length * width;
    }

    public Rectangle(Point point, Point point1, Point point2, Point point3) {
    }

    public int getArea() {
        return area;
    }

    public boolean contains(Point point) {
        return false;
    }
}
