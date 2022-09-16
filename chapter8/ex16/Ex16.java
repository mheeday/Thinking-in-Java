package chapter8.ex16;

class AlertStatus{
    public void display(){
    }
}
class Stop extends AlertStatus{
    public void display(){
        System.out.println("Stop Status");
    }
}
class Ready extends AlertStatus{
    public void display(){
        System.out.println("Ready Status");
    }
}
class Go extends AlertStatus{
    public void display(){
        System.out.println("Go Status");
    }
}
class Starship{
    AlertStatus alert = new Stop();
    public void turnOff(){
        alert = new Stop();
    }
    public void turnReady(){
        alert = new Ready();
    }
    public void turnOn(){
        alert = new Go();
    }
    public void showMoods(){
        alert.display();
    }
}


public class Ex16 {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.showMoods();
        starship.turnOn();
        starship.showMoods();
        starship.turnReady();
        starship.showMoods();
    }
}
