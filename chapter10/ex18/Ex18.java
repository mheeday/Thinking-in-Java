package chapter10.ex18;

public class Ex18 {
    static class NestedClass {	}
    public static NestedClass getNested(){
        return new NestedClass();
    }
    public static void main(String[] args) {
        NestedClass n = getNested();
        NestedClass p = new NestedClass();
    }
}
