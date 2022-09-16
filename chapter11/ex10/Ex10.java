package chapter11.ex10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Rodent{
    void eat(){
        System.out.println("Rodent.eat()");
    }
    void run(){
        System.out.println("Rodent.run()");
    }

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

public class Ex10 {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<>();
        rodents.add(new Rodent());
        rodents.add(new Mouse());
        rodents.add(new Gerbil());
        rodents.add(new Hamster());

        Iterator<Rodent> rodentIterator = rodents.iterator();
        while (rodentIterator.hasNext()){	//Calling base-class methods
            rodentIterator.next().eat();
            rodentIterator.next().run();
        }
    }
}

