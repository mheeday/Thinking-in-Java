package chapter9.ex1;

abstract class Rodent{
    abstract void eat();
    abstract void run();

}
class Mouse extends Rodent {
    @Override
    void eat(){
        System.out.println("Mouse.eat()");
    }
    @Override
    void run(){
        System.out.println("Mouse.run()");
    }
}
class Gerbil extends Rodent {
    @Override
    void eat(){
        System.out.println("Gerbil.eat()");
    }
    @Override
    void run(){
        System.out.println("Gerbil.run()");
    }
}
class Hamster extends Rodent {
    @Override
    void eat(){
        System.out.println("Hamster.eat()");
    }
    @Override
    void run(){
        System.out.println("Hamster.run()");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Rodent[] rodents = { 		//Creation and population of an array
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent rodent : rodents){	//Calling base-class methods
            rodent.eat();
            rodent.run();
        }
    }
}

