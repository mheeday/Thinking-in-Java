package chapter9.ex7;

interface Rodent{
    void eat();
    void run();

}
class Mouse implements Rodent {
    public void eat(){
        System.out.println("Mouse.eat()");
    }
    public void run(){
        System.out.println("Mouse.run()");
    }
}
class Gerbil implements Rodent {

    public void eat(){
        System.out.println("Gerbil.eat()");
    }

    public void run(){
        System.out.println("Gerbil.run()");
    }
}
class Hamster implements Rodent {

    public void eat(){
        System.out.println("Hamster.eat()");
    }

    public void run(){
        System.out.println("Hamster.run()");
    }
}

public class Ex7 {
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

