import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;
import controller.Method;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(8.0, 12.0);
        shapes[2] = new Square(10.0);

        System.out.println("Pre-resized");
        Method.printShape(shapes);

        for (Shape shape : shapes) {
            shape.resize(Math.round(Math.random() * 100));
        }

        System.out.println("Post-resized");
        Method.printShape(shapes);
    }
}
