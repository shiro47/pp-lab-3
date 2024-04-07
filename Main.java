import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.5, 2.0);
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");

        Circle circle = new Circle(point, 5.0);
        System.out.println("Center of the circle: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius of the circle: " + circle.getRadius());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}
