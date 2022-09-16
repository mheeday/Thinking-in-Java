package chapter7;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {

        //System.out.println("The code won't run if this is uncommented"); // Super constructor must be the first thing.
        super(i); // Commenting this will also break the code
        System.out.println("BoardGame constructor");
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}


