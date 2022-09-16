package chapter9.ex2;

abstract class CannotCreate {
    CannotCreate() {
        System.out.println("Yes");
    }
}

public class Ex2 {
    //CannotCreate cannotCreate = new CannotCreate();
    //Cannot be created even after writing a constructor
}
