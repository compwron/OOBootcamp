import java.awt.*;
import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Point> vertices = new ArrayList<Point>();
    ArrayList<RectangleLine> borders = new ArrayList<RectangleLine>();
    private int area;

    // TODO: refactor away this constructor
    public Rectangle(int length, int width) {
        this.area = length * width;
    }

    public Rectangle(Point point, Point point1, Point point2, Point point3) {
        setVertices(point, point1, point2, point3);
        setBorderLines(point, point1, point2, point3);

    }

    private void setBorderLines(Point point, Point point1, Point point2, Point point3) {
        borders.add(new RectangleLine(point, point1));
        borders.add(new RectangleLine(point1, point2));
        borders.add(new RectangleLine(point2, point3));
        borders.add(new RectangleLine(point3, point));
    }

    private void setVertices(Point... points) {
        for (Point point : points) {
            this.vertices.add(point);
        }
    }

    public int getArea() {
        return area;
    }

    public boolean contains(Point point) {
        for (Point vertex : vertices) {
            if (vertex.equals(point)) {
                return true;
            }
        }
        for (RectangleLine line : borders){
            if (line.contains(point)){
                return true;
            }
        }
        return false;
    }
}
