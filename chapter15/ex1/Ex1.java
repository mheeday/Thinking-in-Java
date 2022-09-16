package chapter15.ex1;

class BaseClass {

}

class DerivedClass extends  BaseClass{

}

class Holder<T> {
    private T a;
    public Holder(T a) { this.a = a; }
    public void set(T a) { this.a = a; }
    public T get() { return a; }
}
public class Ex1 {
    public static void main(String[] args) {
        Holder<BaseClass> holder = new Holder<>(new DerivedClass());

        System.out.println(holder.get());
    }
}
