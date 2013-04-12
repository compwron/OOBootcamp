import java.awt.*;
import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Point> vertices = new ArrayList<Point>();
    private int area;

    // TODO: refactor away this constructor
    public Rectangle(int length, int width) {
        this.area = length * width;
    }

    public Rectangle(Point point, Point point1, Point point2, Point point3) {
        this.vertices.add(point);
        this.vertices.add(point1);
        this.vertices.add(point2);
        this.vertices.add(point3);
    }

    public int getArea() {
        return area;
    }

    public boolean contains(Point point) {
        for(Point vertex : vertices){
            if(vertex.equals(point)){
                return true;
            }
        }
        return false;
    }
}
