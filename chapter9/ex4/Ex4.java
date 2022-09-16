package chapter9.ex4;

//abstract class AbstractClass {
//
//}
//
//public class Ex4 extends AbstractClass{
//    void sampleMethod () {
//        System.out.println("Sample Method");
//    }
//
//    static void staticMethod(AbstractClass abstractClass) {
//        Ex4 downCastEx4 = (Ex4) abstractClass;
//        downCastEx4.sampleMethod();
//    }
//
//    public static void main(String[] args) {
//        AbstractClass abstractClass = new Ex4();
//        staticMethod(abstractClass);
//    }
//}


abstract class AbstractClass {
    abstract void sampleMethod ();

}

public class Ex4 extends AbstractClass{
    void sampleMethod () {
        System.out.println("Sample Method");
    }

    static void staticMethod(AbstractClass abstractClass) {
        Ex4 downCastEx4 = (Ex4) abstractClass;
        downCastEx4.sampleMethod();
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new Ex4();
        abstractClass.sampleMethod();
    }
}
