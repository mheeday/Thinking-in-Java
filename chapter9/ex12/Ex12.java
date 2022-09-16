package chapter9.ex12;

interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
interface CanClimb {	//Required New Interface
    void climb();
}
class ActionCharacter {
    public void fight() {}
}
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {		//Mention the interface here
    public void swim() {}
    public void fly() {}
    public void climb() {}
}
class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void r(CanClimb x) { x.climb(); }	//A new method that takes CanClimb as an argument and calls it's method climb()
    public static void w(ActionCharacter x) { x.fight(); }
}


public class Ex12 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Adventure adventure = new Adventure();
        adventure.t(hero);
        adventure.u(hero);
        adventure.v(hero);
        adventure.w(hero);
        adventure.r(hero);	//Treat it as a CanClimb
        //Runs without errors
    }
}
