package chapter10.ex3;

class Outer {
    private String privateString;

    Outer (String privateString) {
        this.privateString = privateString;
    }
    Inner returnInner () {
        return new Inner();
    }
    class Inner {

        @Override
        public String toString() {
            return privateString;
        }
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer("Private String").returnInner();
        System.out.println(inner.toString());
    }
}
