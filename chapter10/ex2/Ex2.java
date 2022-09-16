package chapter10.ex2;

class FirstClass {
    String stringVariable;

    FirstClass(String stringVariable) {
        this.stringVariable = stringVariable;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "stringVariable='" + stringVariable + '\'' +
                '}';
    }
}

class Sequence {
    FirstClass[] firstClasses;

    Sequence (int arraySize) {
        this.firstClasses = new FirstClass[arraySize];

    }
}

public class Ex2 {
    public static void main(String[] args) {
        int length = 10;
        Sequence sequence = new Sequence(length);
        for (int i =0; i<length; i++) {
            sequence.firstClasses[i] = new FirstClass(Integer.toString(i));
            System.out.println(sequence.firstClasses[i].toString());
        }
    }
}
