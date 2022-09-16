package chapter10.ex12;


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


public class Ex12 {
    public static void main(String[] args) {
        new Outer1().new Inner1().modifyOuter1();
        new Outer2().modifyInner2();

    }

}

