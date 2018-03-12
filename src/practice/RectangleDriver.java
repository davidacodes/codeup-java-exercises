package practice;

import org.w3c.dom.css.Rect;

public class RectangleDriver {

    public static void main(String[] args) {
        // Rectangle r = new Rectangle();
        // r.length = 10;
        // r.width = 5;

        Rectangle r = new Rectangle(10, 5);
        System.out.println("The area is " + r.getArea());

        Rectangle b = new Rectangle(5,3);
        System.out.println("The area for b is: " + b.getArea());

        Rectangle c = new Rectangle(10,10);
        System.out.println("The area for c is: " + c.getArea());
    }
}
