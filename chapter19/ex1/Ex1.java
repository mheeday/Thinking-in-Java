package chapter19.ex1;

import static chapter19.ex1.Signal.*;

public class Ex1 {
    Signal color = RED;
    public void change() {
        switch(color) {
            case RED: color = GREEN;
                break;
            case GREEN: color = YELLOW;
                break;
            case YELLOW: color = RED;
        }
    }
    public String toString() {
        return "The traffic light is " + color;
    }
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        for(int i = 0; i < 7; i++) {
            System.out.println(ex1);
            ex1.change();
        }
    }
}
