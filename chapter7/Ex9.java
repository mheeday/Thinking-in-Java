package chapter7;

class Component1{
    Component1(){
        System.out.println("This is Component 1");
    }
}
class Component2{
    Component2(){
        System.out.println("This is Component 2");
    }
}
class Component3{
    Component3(){
        System.out.println("This is Component 3");
    }
}
class Root{
    Root(){
        System.out.println("This is Root");
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
    }
}
class Stem extends Root{
    Stem(){
        System.out.println("This is Stem");
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
    }
}
public class Ex9 {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
