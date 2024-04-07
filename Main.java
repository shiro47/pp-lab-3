import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 2.0);
        circles[1] = new Circle(new Point(1, 1), 3.0);
        circles[2] = new ColoredCircle(new Point(2, 2), 4.0, "blue");
        
        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Area of the circle: " + area);
            
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                String color = coloredCircle.getColor();
                System.out.println("Color of the circle: " + color);
            }
        }
    }
}
