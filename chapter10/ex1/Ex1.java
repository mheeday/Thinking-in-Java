package chapter10.ex1;

class Outer {
    Inner returnInner () {
        return new Inner();
    }
    class Inner {

    }
}

public class Ex1 {
    public static void main(String[] args) {
        Outer.Inner inner =  new Outer().returnInner();
    }
}
