package chapter8.ex10;

class BaseClass {
    void method1 () {
        System.out.println("Method 1");
        this.method2();
    }
    void method2 () {
        System.out.println("Method 2");
    }
}

public class Ex10 extends BaseClass {
    @Override
    void method2 () {
        System.out.println("Overridden Method 2");
    }

    public static void main(String[] args) {
        BaseClass ex10 = new Ex10();
        ex10.method1();
        //Method 1 of the base class calls the overridden method 2
    }
}
