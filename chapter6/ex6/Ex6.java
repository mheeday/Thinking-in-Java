package chapter6.ex6;

public class Ex6 {
    static  protected int height= 1000;
}

class Manipulator {
    public static void main(String[] args) {
        Ex6.height = 2000;
        System.out.println(Ex6.height);
    }

}
