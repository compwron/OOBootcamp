package bootcamp.shapes;

public class Rectangle {
    protected Double area;

    public Rectangle(){
        this.area = 0.0;
    }

    public Rectangle(double width, double height) {
        this.area = width * height;
    }

    public Double getArea() {
        return area;
    }
}
