package bootcamp.shapes;


//@EqualsAndHashCode
public class Rectangle {
    protected Double area;

    public Double getArea(){
        return area;
    }

    public Rectangle() {
        this.area = 0.0;
    }

    public Rectangle(double width, double height) {
        this.area = width * height;
    }

    public String toString() {
        return "Rectangle area: " + getArea();
    }

    public boolean hasLowerAreaThan(Rectangle other) {
        return area < other.getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (area != null ? !area.equals(rectangle.area) : rectangle.area != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return area != null ? area.hashCode() : 0;
    }
}
