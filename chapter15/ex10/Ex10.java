package chapter15.ex10;

class GenericMethods {
    public <T, U, V>  void f (String x, U y, V z) {
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(z.getClass().getName());
    }

}

public class Ex10 {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("a", 1, 's');
        genericMethods.f("genericMethods", genericMethods,genericMethods);
    }
}
