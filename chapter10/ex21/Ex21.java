package chapter10.ex21;

interface SampleInterface {
    String add();
    static class InterfaceClass {
        static void callAdd(SampleInterface sampleInterface) {
            System.out.println(sampleInterface.add());
        }
    }
}

public class Ex21 implements SampleInterface {
    public String add(){
        int i = 1;
        i++;
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        InterfaceClass.callAdd(new Ex21());
    }
}
