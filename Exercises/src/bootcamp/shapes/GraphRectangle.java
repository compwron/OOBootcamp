package bootcamp.shapes;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

class GraphRectangle extends Rectangle {
    final private ArrayList<Line2D.Float> borders = new ArrayList<Line2D.Float>();
    private ArrayList<Point> points = new ArrayList<Point>();

    public GraphRectangle(Point point, Point point1, Point point2, Point point3) {
        super();
        addToPoints(point, point1, point2, point3);
        setBorderLines(point, point1, point2, point3);
        setArea(point, point1, point2);
    }

    private void addToPoints(Point... points) {
        for (Point point : points){
            this.points.add(point);
        }
    }

    private void setArea(Point point, Point point1, Point point2) {
        area = distanceBetween(point, point1) * distanceBetween(point1, point2);
    }

    private double distanceBetween(Point point, Point point1) {
        return Math.sqrt(Math.pow((point.getX() - point1.getX()), 2) + Math.pow((point1.getY() - point.getY()), 2));
    }

    private void setBorderLines(Point point, Point point1, Point point2, Point point3) {
        borders.add(new Line2D.Float(point, point1));
        borders.add(new Line2D.Float(point1, point2));
        borders.add(new Line2D.Float(point2, point3));
        borders.add(new Line2D.Float(point3, point));
    }

    public boolean contains(Point point) {
        for (Line2D line : borders) {
            if (pointIsWithinEndpointsOf(line, point)) {
                return true;
            }
        }
        return pointIsOnSameSideOf(borders.get(0), borders.get(2), point) && pointIsOnSameSideOf(borders.get(1), borders.get(3), point);
    }

    boolean pointIsWithinEndpointsOf(Line2D line, Point point) {
//make rectangleLine to hide this logic
        boolean pointXisWithinLineX = point.getX() >= line.getX1() && point.getX() <= line.getX2();
        boolean pointYIsWithinLineY = point.getY() >= line.getX1() && point.getY() <= line.getY2();
        return line.ptLineDist(point) == 0 && pointXisWithinLineX && pointYIsWithinLineY;
    }

    private boolean pointIsOnSameSideOf(Line2D.Float line1, Line2D.Float line2, Point point) {
        return line1.relativeCCW(point) == line2.relativeCCW(point);
    }

    public String toString(){
        String pointString = "";
        for (Point point: points){
            pointString += point.getX() + "," + point.getY() + "|";
        }
        return "Area:" + getArea() + ";Points:" + pointString;
    }
}
