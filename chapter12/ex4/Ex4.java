package chapter12.ex4;

class SampleException extends Exception {
    String errorMessage;
    public SampleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public void printMsg() {
        System.out.println("Error Message: " + errorMessage);
    }
}

public class Ex4 {
    public static void main(String args[]) {
        try {
            throw new SampleException("MyException message");
        } catch(SampleException e) {
            e.printMsg();
        }
    }
}
