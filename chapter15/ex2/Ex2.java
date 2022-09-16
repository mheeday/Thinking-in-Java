package chapter15.ex2;


class Holder<T> {
    private  T a,b,c;

    public Holder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getC() {
        return c;
    }

    public T getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Holder<String> stringHolder = new Holder<>("Hello", "New", "World");
        System.out.println(stringHolder);
    }
}
