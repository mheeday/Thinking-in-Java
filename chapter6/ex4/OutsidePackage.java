package chapter6.ex4;

import chapter6.ex4.sample.SampleClass;

public class OutsidePackage {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
       // sampleClass.happy();//Won't work!
    }
}
