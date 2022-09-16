package chapter10.ex6;


import chapter10.ex6.inner.SampleInterface;


public class Ex6 {
    protected class InnerClass implements SampleInterface {

        @Override
        public void sampleMethod() {
            System.out.println("Yes");
        }
    }
}
