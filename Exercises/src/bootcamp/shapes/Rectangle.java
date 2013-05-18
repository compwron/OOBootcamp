package bootcamp.shapes;

public class Rectangle {
    protected Double area;

    public Rectangle() {
        this.area = 0.0;
    }

    public Rectangle(double width, double height) {
        this.area = width * height;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (!area.equals(rectangle.area)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return area.hashCode();
    }

    @Override
    public String toString() {
        return "Rectangle area: " + getArea();
    }
}
