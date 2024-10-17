import shape.Circle;
import shape.Rectangle;
import shape.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle:");
        Circle circle = new Circle(5.0);
        System.out.println("Pre-resized:");
        System.out.println(circle);
        System.out.println("Post-resized:");
        circle.resize(50);
        System.out.println(circle);
        System.out.println();

        System.out.println("Rectangle:");
        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println("Pre-resized:");
        System.out.println(rectangle);
        System.out.println("Post-resized:");
        rectangle.resize(100);
        System.out.println(rectangle);
        System.out.println();

        System.out.println("Square:");
        Square square = new Square(8.0);
        System.out.println("Pre-resized:");
        System.out.println(square);
        System.out.println("Post-resized:");
        square.resize(80);
        System.out.println(square);
    }
}
