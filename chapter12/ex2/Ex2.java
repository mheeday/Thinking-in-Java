package chapter12.ex2;

public class Ex2 {
    public static void main(String args[]) {
        String nullString = null;

        try {
            nullString.toString();
        } catch(Exception e) {
            System.out.println("Exception Here" + e);
        }
    }
}
