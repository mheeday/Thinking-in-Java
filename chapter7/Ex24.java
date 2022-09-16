package chapter7;

class Insect {
    private int i = 2;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 9;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 5;
    }
}
class Ant extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Ant() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");
}
class BlackCarpenter extends Ant {
    private int l = printInit("Coleoptera.l initialized");
    public BlackCarpenter() {
        System.out.println("j = " + j);
        System.out.println("l = " + l);
    }
    private static int x3 =
            printInit("static Coleoptera.x3 initialized");
}
public class Ex24 {
    public static void main(String[] args) {
        BlackCarpenter c = new BlackCarpenter();
    }
}
