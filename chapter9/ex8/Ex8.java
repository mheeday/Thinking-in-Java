package chapter9.ex8;

interface FastFood{
    void freeCashier();
    void fry();
}

class Meal {
    Meal() { System.out.println("Meal()"); }
}
class Bread {
    Bread() { System.out.println("Bread()"); }
}
class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}
class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()");}
}
class Sandwich extends PortableLunch implements FastFood{		//Wow
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public void freeCashier(){
        System.out.println("freeCashier()");
    }
    public void fry(){
        System.out.println("fry()");
    }
    public Sandwich() {
        System.out.println("Sandwich()");
        freeCashier(); 				//Calling new methods in constructor
        fry();
    }
}


public class Ex8 {
    public static void main(String[] args) {
        new Sandwich();
    }
}
