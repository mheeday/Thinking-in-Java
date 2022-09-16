package chapter7.ex12;

class Component1{
    Component1(){
        System.out.println("This is Component 1");
    }
    void dispose(){
        System.out.println("Component1.dispose()");
    }
}
class Component2{
    Component2(){
        System.out.println("This is Component 2");
    }
    void dispose(){
        System.out.println("Component2.dispose()");
    }
}
class Component3{
    Component3(){
        System.out.println("This is Component 3");
    }
    void dispose(){
        System.out.println("Component3.dispose()");
    }
}
class Root{
    Component1 component1;
    Component2 component2;
    Component3 component3;
    Root(){
        System.out.println("This is Root");
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
    }
    void dispose(){
        System.out.println("Root.dispose()");
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}
class Stem extends Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;
    Stem(){
        System.out.println("This is Stem");
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
    }
    public void dispose(){
        System.out.println("Stem.dispose()");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }
}
public class Ex12 {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}

