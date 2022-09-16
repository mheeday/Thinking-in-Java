package chapter10.ex9;

interface SampleInterface {
    void sampleMethod ();
}

public class Ex9 {
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
