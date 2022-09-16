package chapter7;

class Art {
    Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
    Drawing() { System.out.println("Drawing constructor"); }
}

class Cartoon extends Drawing {
    //public Cartoon() { System.out.println("Cartoon constructor"); }

}

public class Ex3 {
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
