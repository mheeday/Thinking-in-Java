package chapter8.ex7;

enum Note {
    MIDDLE_C
}


class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }						//Overriden toString method. Had to make it public because visibility could not be reduced
    void adjust() { System.out.println("Adjusting Instrument"); }
}
class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}
class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}
class Stringed extends Instrument {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Piano extends Stringed {
    void play(Note n) { System.out.println("Piano.play() " + n); }
    public String toString() { return "Piano"; }
    void adjust() { System.out.println("Adjusting Piano"); }
}

class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    public String toString() { return "Brass"; }
    void adjust() { System.out.println("Adjusting Brass"); }
}
class Woodwind extends Wind {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

public class Ex7 {
    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Piano()
        };
        tuneAll(orchestra);
        System.out.println(orchestra);
    }
}
