import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        
        System.out.println("Length of the rectangle: " + rectangle.getLength());
        System.out.println("Width of the rectangle: " + rectangle.getWidth());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }
}
