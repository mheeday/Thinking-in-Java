package chapter8.ex8;

import java.util.Random;

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

class RandomInstrumentGenerator {		//An instrument generator
    private Random rand = new Random(47);
    public Instrument next() {
        switch(rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Piano();
        }
    }
}

public class Ex8 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

    public static void tune(Instrument i) {
// ...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] inst = new Instrument[9]; //Array creation
        for (int i = 0; i < inst.length; i++)   //Array population
            inst[i] = gen.next();
        for (Instrument i : inst) {                //Array manipulation :) Could be also done with tuneAll/printAll methods
            Ex8.tune(i);
            System.out.println(i);
        }
    }
}
