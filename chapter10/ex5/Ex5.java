package chapter10.ex5;

class Outer {
    class Inner {

    }
}


public class Ex5 {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
}
