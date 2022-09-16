package chapter10.ex13;

interface SampleInterface {
    void sampleMethod ();
}

public class Ex13 {
    SampleInterface classMethod () {
        class InMethod implements SampleInterface {

            @Override
            public void sampleMethod() {
                System.out.println("sampleMethod");
            }
        }
        return new InMethod();
    }
}
