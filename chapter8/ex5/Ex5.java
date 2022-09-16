package chapter8.ex5;

class Cycle {
    int numberOfWheels;

    public void ride (){
        System.out.println("You are riding with " + this.wheels() + " wheel(s) !");
    }

    public int wheels () {
        return this.numberOfWheels;
    }
}

class Unicycle extends Cycle {
    int numberOfWheels = 1;

    @Override
    public void ride (){
        System.out.println("You are riding with " + this.wheels() + " wheel(s) !");
    }

    @Override
    public int wheels () {
        return this.numberOfWheels;
    }
}

class Bicycle extends Cycle {
    int numberOfWheels = 2;

    @Override
    public void ride (){
        System.out.println("You are riding with " + this.wheels() + " wheel(s) !");
    }

    @Override
    public int wheels () {
        return this.numberOfWheels;
    }
}

class Tricycle extends Cycle {
    int numberOfWheels = 3;

    @Override
    public void ride (){
        System.out.println("You are riding with " + this.wheels() + " wheel(s) !");
    }

    @Override
    public int wheels () {
        return this.numberOfWheels;
    }
}


public class Ex5 {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
    }
}
