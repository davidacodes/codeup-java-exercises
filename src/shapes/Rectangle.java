package shapes;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    protected Rectangle() {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    public double getArea() {
        return length * width;
    }
}
