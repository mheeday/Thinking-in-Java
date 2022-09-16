package chapter20.ex10;

import chapter19.ex1.Signal;
import chapter20.OSExecute;
import chapter20.Test;
import chapter20.TestProperty;

class TrafficLight {
    Signal color = Signal.RED;
    public void change() {
        switch(color) {
// Note that you don't have to say Signal.RED
// in the case statement:
            case RED: color = Signal.GREEN;
                break;
            case GREEN: color = Signal.YELLOW;
                break;
            case YELLOW: color = Signal.RED;
                break;
        }
    }
    public String toString() {
        return "The traffic light is " + color;
    }
}

public class Ex10 {
    TrafficLight testObject = new TrafficLight();
    @Test
    void initialization() {
        assert testObject.toString().equals(str(Signal.RED));
    }
    @Test void _change() {
        testObject.change();
        assert testObject.toString().equals(str(Signal.GREEN));
        testObject.change();
        assert testObject.toString().equals(str(Signal.YELLOW));
        testObject.change();
        assert testObject.toString().equals(str(Signal.RED));
    }
    @TestProperty
    private static String str(Signal signal) {
        return "The traffic light is " + signal;
    }
    public static void main(String[] args) throws Exception {
        OSExecute.command("java " +
                " net.mindview.atunit.AtUnit E10_TrafficLightTest");
    }
}
