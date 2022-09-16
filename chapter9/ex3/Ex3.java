package chapter9.ex3;

abstract class BaseClass {
    int integerValue = 100;
    abstract void print();
}

public class Ex3 extends BaseClass{
    int integerValue = 1234;
    void print() {
        System.out.println(this.integerValue);
    }

    Ex3 () {
        print();
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        ex3.print();
        //The  constructor calls the print method of the derived class and get the integer Vale in the instance of Ex3.
    }
}
