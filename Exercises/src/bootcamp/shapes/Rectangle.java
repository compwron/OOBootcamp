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
        return area.compareTo(other.getArea()) < 0;
    }
}
