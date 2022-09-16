package chapter9.ex10;

enum Note {
    MIDDLE_C
}

interface Playable{
    abstract void play(Note n);
}

abstract class Instrument {		//An abstract class to inherit from
    abstract public String toString();	//Had to specify "public" level
    abstract void adjust();
}

class Wind extends Instrument implements Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}
class Percussion extends Instrument implements Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}
class Stringed extends Instrument implements Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { System.out.println(this + ".adjust()"); }
}
class Brass extends Wind {
    public String toString() { return "Brass"; }
}
class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

public class Ex10 {
    static void tune(Playable i) {		//Accepts Playable now
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
