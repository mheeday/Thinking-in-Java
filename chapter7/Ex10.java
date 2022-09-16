package chapter7;

class NewComponent1{
    NewComponent1(int i){
        System.out.println("This is Component 1");
    }
}
class NewComponent2{
    NewComponent2(int i){
        System.out.println("This is Component 2");
    }
}
class NewComponent3{
    NewComponent3(int i){
        System.out.println("This is Component 3");
    }
}
class NewRoot{
    NewRoot(int i){
        System.out.println("This is Root");
        NewComponent1 newComponent1 = new NewComponent1(i);
        NewComponent2 newComponent2 = new NewComponent2(i);
        NewComponent3 newComponent3 = new NewComponent3(i);
    }
}
class NewStem extends NewRoot{
    NewStem(int i){
        super(i);
        System.out.println("This is Stem");
        NewComponent1 newComponent1 = new NewComponent1(i);
        NewComponent2 newComponent2 = new NewComponent2(i);
        NewComponent3 newComponent3 = new NewComponent3(i);
    }
}
public class Ex10 {
    public static void main(String[] args) {
        NewStem newStem = new NewStem(20);
    }
}

