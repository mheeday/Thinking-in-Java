package chapter7;


class ClassA{
    ClassA(int i){ System.out.println("Aa " + i); }
}

class classB {
    classB(int i){ System.out.println("Bb " + i); }
}

class ClassC extends ClassA{
    ClassC(int i){
        super(i);
        classB b = new classB(i);
    }
}

public class Ex7 {
    public static void main(String[] args) {
        ClassC c = new ClassC(5);
    }
}

