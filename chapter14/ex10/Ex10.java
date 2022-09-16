package chapter14.ex10;

public class Ex10 {

    public static void main(String[] args) {
        char[] primitiveArray = {'a', 'b', 'c'};
        Character[] objectArray = {'a', 'b', 'c'};

        try {
            System.out.println(primitiveArray.getClass().getSimpleName());
            System.out.println(objectArray.getClass().getSimpleName());
            System.out.println("Is a Object");

        }
        catch (Exception e) {
            System.out.println("Not a Object");
        }
    }
}
