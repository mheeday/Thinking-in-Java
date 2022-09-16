package chapter12.ex5   ;

public class Ex5 {
    static int counter = 0;
    static void throwException() {
        if (counter < 5) {
            counter++;
            throw new IllegalArgumentException();
        }
    }

    public static void main(String args[]) {
        while(true) {
            try {
                throwException();
            } catch(IllegalArgumentException e) {
                System.out.println("Caught IllegalArgumentException" + e);
                continue;
            }
            System.out.println("Got through...");
            break;
        }
        System.out.println("Successful execution");
    }
}
