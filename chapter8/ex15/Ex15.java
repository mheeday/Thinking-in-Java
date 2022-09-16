package chapter8.ex15;

class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int length = 1, breadth = 1;
    RectangularGlyph(int length, int breadth) {
        this.length = length; this.breadth = breadth;
        System.out.println("RectangularGlyph.RectangularGlyph(), a = " + length + " b = " + breadth);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), a = " + length + " b = " + breadth);
    }
}

public class Ex15 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(5, 3);
    }
}
