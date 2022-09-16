package chapter14.ex4;

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

public class Ex4 {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();

        Shape upcastRhomboid = (Shape) rhomboid;

        Rhomboid downcastRhomboid = null;

        if (upcastRhomboid instanceof  Rhomboid) {
            downcastRhomboid = (Rhomboid) upcastRhomboid;
            System.out.println("Downcast to Rhomboid Worked! ");
        }

        Circle circleRhomboid = null;


//        if (downcastRhomboid instanceof  Circle) {
//            circleRhomboid = (Circle) downcastRhomboid;
//            System.out.println("Downcast to Circle Worked! ");
//        }

        //Inconvertible types; cannot cast Rhomboid to Circle
    }
}
