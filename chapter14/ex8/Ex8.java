package chapter14.ex8;

public class Ex8 {
    static void printAllSuperClass (Class sampleClass) {
        System.out.println("Class name is " + sampleClass.getSimpleName());

        System.out.println("--------------------- \n Interfaces \n ---------------------");
        for(Class sampleInterface: sampleClass.getInterfaces()) {
            System.out.println(sampleInterface.getSimpleName());
        }

        System.out.println("--------------------- \n Super Class \n ---------------------");
            System.out.println(sampleClass.getSuperclass());

        System.out.println("--------------------- \n End \n ---------------------");
    }

    public static void main(String[] args) {
        String SampleString = new String("Yes");
        printAllSuperClass(SampleString.getClass());
    }
}
