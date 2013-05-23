package bootcamp.shapes;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Rectangle {
    @Getter
    protected Double area;

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
