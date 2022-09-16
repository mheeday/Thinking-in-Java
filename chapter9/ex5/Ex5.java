package chapter9.ex5;

import chapter9.ex5.diff.SampleInterface;

public class Ex5 implements SampleInterface {
    public void one () {
        System.out.println("One");
    }

    public void two () {
        System.out.println("Two");
    }

    public void three () {
        System.out.println("Three");
    }

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();

        ex5.one();
        ex5.two();
        ex5.three();
    }
}
