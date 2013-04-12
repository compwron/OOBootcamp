import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Point> vertices = new ArrayList<Point>();
    ArrayList<Line2D.Float> borders = new ArrayList<Line2D.Float>();
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
        borders.add(new Line2D.Float(point, point1));
        borders.add(new Line2D.Float(point1, point2));
        borders.add(new Line2D.Float(point2, point3));
        borders.add(new Line2D.Float(point3, point));
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
        for (Line2D line : borders) {
            if (line.ptLineDist(point) == 0) {
                return true;
            }
        }
        if (pointIsOnSameSideOf(borders.get(0), borders.get(2), point) && pointIsOnSameSideOf(borders.get(1), borders.get(3), point)){
            return true;
        }
        return false;
    }

    private boolean pointIsOnSameSideOf(Line2D.Float line1, Line2D.Float line2, Point point) {
        return line1.relativeCCW(point) == line2.relativeCCW(point);
    }
}
