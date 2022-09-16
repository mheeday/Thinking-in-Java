package chapter14.ex7;

class Candy {
    static { System.out.println("Loading Candy"); }
}

class Gum {
    static { System.out.println("Loading Gum"); }
}
class Cookie {
    static { System.out.println("Loading Cookie"); }
}

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            System.out.println(args[0]);
                Class.forName(args[0]);
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn’t find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}
