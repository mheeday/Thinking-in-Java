package chapter12.ex3;

public class Ex3 {
    public static void main(String args[]) {
        String[] strings = new String[5];
        try {
            strings[6] = "Hello";
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception = " + e);
        }
    }
}
