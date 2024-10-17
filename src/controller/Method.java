package controller;

import shape.Shape;

public class Method {
    public static void printShape(Shape[] shape) {
        for (Shape s : shape) {
            System.out.println(s);
        }
    }
}
