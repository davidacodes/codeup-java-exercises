package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Shape shortBox = new Square(8);
        Shape longBox = new Rectangle(5,6);

        System.out.println("Square: Area -> " + shortBox.getArea());
        System.out.println("Square: Perimeter -> " + shortBox.getPerimeter());
        System.out.println("Rectangle: Area -> " + longBox.getArea());
        System.out.println("Rectangle: Perimeter -> " + longBox.getPerimeter());
    }


}
