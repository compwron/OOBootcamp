package bootcamp.shapes;

public class Rectangle {
    private Double area;

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
