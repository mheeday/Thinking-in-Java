package chapter12.ex8;

class SampleException extends Exception {

    String errorMessage;
    public SampleException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void printMsg() {
        System.out.println("Error Message: " + errorMessage);
    }
}

class ExceptionThrower {
    public void f() {}
    public void g() throws SampleException {
        throw new SampleException("Inside g()");
    }
}

public class Ex8 {
    public static void main(String args[]) {
        ExceptionThrower t = new ExceptionThrower();
        try {
            t.g();
        } catch(SampleException e) {
            e.printMsg();
        }
    }
}
