package chapter21.ex1;


import chapter21.Worker;

public class Ex1 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
            new Thread(new Worker()).start();
    }
}
