package chapter14.ex3;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
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

public class Ex3 {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();

        Shape upcastRhomboid = (Shape) rhomboid;

        Rhomboid downcastRhomboid = (Rhomboid) upcastRhomboid;

        //Circle circleRhomboid = (Circle) downcastRhomboid;


        //Inconvertible types; cannot cast Rhomboid to Circle
    }
}
