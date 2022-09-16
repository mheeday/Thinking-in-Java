package chapter7;

class BasedClass {
    static int staticIntegerBC = printInit("Initializing Base Class variable");
    static int printInit(String s){
        System.out.println(s);
        return 1;
    }
    BasedClass(){
        System.out.println("Base Class Constructor");
    }
}
class ExClass extends BasedClass {
    static int staticIntegerEC = printInit("Initializing Ex Class variable");
    ExClass(){
        System.out.println("Ex Class constructor");
    }
}

public class Ex23 {
    public static void main(String[] args) {
        ExClass.staticIntegerEC = 1; 				 //Accessing static member calls
        ExClass exClass = new ExClass(); //Calling derived class constructor from already loaded classes
    }
}
