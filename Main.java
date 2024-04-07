import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Rectangle;
import geometry.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(2.0);

        System.out.println("Side length of the square: " + square.getLength());
        System.out.println("Area of the square: " + square.calculateArea());
        System.out.println("Perimeter of the square: " + square.calculatePerimeter());
    }
}
