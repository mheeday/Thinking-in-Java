package chapter8.ex4;

import java.util.Random;

class Shape {
    public void draw() {}

    public void erase() {}

}
class Circle extends Shape {
    @Override
    public void draw() {System.out.println("Circle.draw()");}

    @Override
    public void erase() {System.out.println("Circle.erase()");}

}

class Square extends Shape {
    @Override
    public void draw() {System.out.println("Square.draw()");}

    @Override
    public void erase() {System.out.println("Square.erase()");}
}

class Triangle extends Shape {
    @Override
    public void draw() {System.out.println("Triangle.draw()");}

    @Override
    public void erase() {System.out.println("Triangle.erase()");}
}

class Octagon extends Shape {
    @Override
    public void draw() {System.out.println("Octagon.draw()");}

    @Override
    public void erase() {System.out.println("Octagon.erase()");}
}

class RandomShapeGenerator {
    private Random rand = new Random(48);

    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Octagon();
            case 2:
                return new Triangle();
            case 3:
                return new Square();
        }
    }
}

public class Ex4 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
// Make polymorphic method calls:
        for (Shape shp : s) {
            shp.draw();
        }
    }
}
