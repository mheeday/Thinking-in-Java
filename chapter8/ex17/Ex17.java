package chapter8.ex17;


class Cycle {
    int numberOfWheels;

    public void ride (Cycle cycle){
        System.out.println("Cycle is riding!");
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}

class Unicycle extends Cycle {
    int numberOfWheels = 1;

    @Override
    public String toString() {
        return "Unicycle{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }

    public void balance () {
        System.out.println("Unicycle Balance");
    }
}

class Bicycle extends Cycle {
    int numberOfWheels = 2;

    @Override
    public String toString() {
        return "Bicycle{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
    public void balance () {
        System.out.println("Bicycle Balance");
    }
}

class Tricycle extends Cycle {
    int numberOfWheels = 3;

    @Override
    public String toString() {
        return "Tricycle{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }
}


public class Ex17 {
    public static void main(String[] args) {

        Cycle[] cycles = {
                new Unicycle(), new Bicycle(), new Tricycle()
        };

        for (Cycle cycle: cycles) {
            //System.out.println(cycle.balance());
            //It cannot work.
        }


    }
}

