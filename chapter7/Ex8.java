package chapter7;

class FirstClass{
    FirstClass(String s) {
        System.out.println("FirstClass " + s);
    }
}

class SecondClass extends FirstClass{
    SecondClass(){
        super("empty");
    }
    SecondClass(String s){
        super(s);
    }
}

public class Ex8 {
    public static void main(String[] args) {
        SecondClass sc1 = new SecondClass();
        SecondClass sc2 = new SecondClass("Arguments");
    }
}
