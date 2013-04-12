import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Line2D.Float> borders = new ArrayList<Line2D.Float>();
    private double area;

    public Rectangle(Point point, Point point1, Point point2, Point point3) {
        setBorderLines(point, point1, point2, point3);
        setArea(point, point1, point2, point3);
    }

    private void setArea(Point point, Point point1, Point point2, Point point3) {
        area = distanceBetween(point, point1) * distanceBetween(point1, point2);
    }

    private double distanceBetween(Point point, Point point1){
        return Math.sqrt(Math.pow((point.getX() - point1.getX()), 2) + Math.pow((point1.getY() - point.getY()), 2));
    }

    private void setBorderLines(Point point, Point point1, Point point2, Point point3) {
        borders.add(new Line2D.Float(point, point1));
        borders.add(new Line2D.Float(point1, point2));
        borders.add(new Line2D.Float(point2, point3));
        borders.add(new Line2D.Float(point3, point));
    }

    public double getArea() {
        return area;
    }

    public boolean contains(Point point) {
        for (Line2D line : borders) {
            if (pointIsWithinEndpointsOf(line, point)) {
                return true;
            }
        }
        if (pointIsOnSameSideOf(borders.get(0), borders.get(2), point) && pointIsOnSameSideOf(borders.get(1), borders.get(3), point)){
            return true;
        }
        return false;
    }

    protected boolean pointIsWithinEndpointsOf(Line2D line, Point point) {
        boolean pointXisWithinLineX = point.getX() >= line.getX1() && point.getX() <= line.getX2();
        boolean pointYIsWithinLineY = point.getY() >= line.getX1() && point.getY() <= line.getY2();
        return line.ptLineDist(point) == 0 && pointXisWithinLineX && pointYIsWithinLineY;
    }

    private boolean pointIsOnSameSideOf(Line2D.Float line1, Line2D.Float line2, Point point) {
        return line1.relativeCCW(point) == line2.relativeCCW(point);
    }
}
