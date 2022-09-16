package chapter10.ex26;

class SampleClass {
    class InnerClass {
        int intVar;
        InnerClass(int intVar){
            this.intVar = intVar;
        }
    }
}
class SampleClass2 {
    class SmallerClass extends SampleClass.InnerClass {
        SmallerClass(SampleClass bc, int intVar) {
            bc.super(intVar);
        }	//Inheritance
    }
}

public class Ex26 {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        SampleClass2 sampleClass2 = new SampleClass2();
        SampleClass2.SmallerClass smallerClass = sampleClass2.new SmallerClass(sampleClass, 55);
        System.out.println(smallerClass.intVar);
    }
}
