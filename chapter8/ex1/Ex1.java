package chapter8.ex1;

import static chapter8.ex1.Cycle.ride;

class Cycle {
    int numberOfWheels;

    public static void ride (Cycle cycle){
        System.out.println("Cycle is riding!");
    }
}

class Unicycle extends Cycle {
    int numberOfWheels = 1;
}

class Bicycle extends Cycle {
    int numberOfWheels = 2;
}

class Tricycle extends Cycle {
    int numberOfWheels = 3;
}


public class Ex1 {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        ride((Cycle) unicycle);
        ride((Cycle) bicycle);
        ride((Cycle) tricycle);
    }
}
