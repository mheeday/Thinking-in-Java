package chapter12.ex1;

public class Ex1 {
    public static void main(String args[]) {
        try {
            throw new Exception("A sample exception");
        } catch(Exception e) {
            System.out.println(
                    "Exception Message is  " + e.getMessage());
        } finally {
            System.out.println("I was there ");
        }
    }
}
