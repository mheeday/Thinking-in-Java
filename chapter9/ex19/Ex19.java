package chapter9.ex19;

import java.util.Random;

enum CoinOutcome {
    HEAD,
    TAIL
}

interface Tosser{
    void toss();
}

class CoinTosser implements Tosser {
    public void toss(){
        Random random = new Random();
        int randomInt = random.nextInt(CoinOutcome.values().length+1);
        CoinOutcome randomChoice = CoinOutcome.values()[randomInt];
        System.out.println(randomChoice);
    }
}
class DiceTosser implements Tosser{
    public void toss(){
        Random random = new Random();
        int randomInt = random.nextInt(6);
        System.out.println(randomInt+1);
    }
}

public class Ex19 {
    public static void tossTosser(){
        Tosser[] tossers = {
                new CoinTosser(),
                new DiceTosser()
        };

        for (Tosser tosser : tossers) {
            tosser.toss();

        }
    }
    public static void main(String[] args) {
        tossTosser();
    }
}
