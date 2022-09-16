package chapter19.ex2;

import java.util.Random;

enum CartoonCharacter {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private static Random rand = new Random(47);
    public static CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}

public class Ex2 {
    public static void printNext() {
        System.out.print(CartoonCharacter.next() + ", ");
    }
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
            printNext();
    }
}
//Benefit of using this is that you don't need to create an instance of Ex2 to call that method.
