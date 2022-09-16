package chapter13.ex20;

import java.util.Scanner;

class SampleClass {
     int intVar;
     long longVar;
     float floatVar;
     double doubleVar;
     String stringVar;

     public SampleClass (String stringArgument) {
         Scanner scanner = new Scanner(stringArgument);

         this.intVar = scanner.nextInt();
         this.longVar = scanner.nextLong();
         this.floatVar = scanner.nextFloat();
         this.doubleVar = scanner.nextDouble();
         this.stringVar = scanner.next("\\w+");
     }

    @Override
    public String toString() {
        return "SampleClass{" +
                "intVar=" + intVar +
                ", longVar=" + longVar +
                ", floatVar=" + floatVar +
                ", doubleVar=" + doubleVar +
                ", stringVar='" + stringVar + '\'' +
                '}';
    }
}
public class Ex20 {
    public static void main(String[] args) {
        String sampleInput = "123 1234567890987654321 12.21 3e44 Hello World";
        //String sampleInput = "HelloWorld 3e44 12.21 1234567890987654321 123";
        SampleClass sampleClass = new SampleClass(sampleInput);
        System.out.println(sampleClass);
    }
}
