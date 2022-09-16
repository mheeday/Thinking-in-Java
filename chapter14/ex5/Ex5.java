package chapter14.ex5;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    int angle = 0;
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}
class Circle extends Shape {
    public String toString() { return "Circle"; }
}
class Square extends Shape {
    public String toString() { return "Square"; }
}
class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

public class Ex5 {
    static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Cannot rotate circle");
        }
        else {
            shape.angle += 90;
            System.out.println("This " + shape.getClass().getSimpleName()  + " object angle is now at " + shape.angle + " degree");
        }
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for(Shape shape : shapeList) {
            rotate(shape);
            rotate(shape);
        }
    }
}