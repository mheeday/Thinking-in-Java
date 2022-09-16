package chapter10.ex7;

class Outer1{
    private int intOut1;

    private void methodOut1 () {
        System.out.println("methodOut1");
    }

    class Inner1 {
        void modifyOuter1 () {
            Outer1.this.intOut1 = 10;
            Outer1.this.methodOut1();
        }
    }
}

class Outer2{
    void modifyInner2 () {
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        inner2.methodInner2();
    }

    class Inner2{

        public void methodInner2() {
            System.out.println("methodInner2");
        }
    }
}


public class Ex7 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1();
        inner1.modifyOuter1();

        Outer2 outer2 = new Outer2();
        outer2.modifyInner2();
    }

}
