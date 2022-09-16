package chapter9.ex18;

interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Unicycle");
    }
}
class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        System.out.println("Making new Unicycle");
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Bicycle");
    }
}
class BicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        System.out.println("Making new Bicycle");
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public void ride(){
        System.out.println("Riding Tricycle");
    }
}
class TricycleFactory implements CycleFactory{
    public Cycle getCycle(){
        System.out.println("Making new Tricycle");
        return new Tricycle();
    }
}

public class Ex18 {
    public static void makeAndRideCycle () {
        CycleFactory[] cycleFactories = {
                new UnicycleFactory(),
                new BicycleFactory(),
                new TricycleFactory()
        };
        for (CycleFactory cycleFactory: cycleFactories) {
            System.out.println("--------------------------------");
            Cycle cycle = cycleFactory.getCycle();
            cycle.ride();
        }
    }
    public static void main(String[] args) {
        makeAndRideCycle();
    }
}
