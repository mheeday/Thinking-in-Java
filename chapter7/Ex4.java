package chapter7;

class BaseClass {
    BaseClass() { System.out.println("BaseClass constructor"); }
}

class MidClass extends Art {
    MidClass() { System.out.println("MidClass constructor"); }
}

class DerivedClass extends Drawing {
    public DerivedClass() { System.out.println("Derived Class constructor"); }

}

public class Ex4 {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
    }
}
