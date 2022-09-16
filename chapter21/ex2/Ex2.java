package chapter21.ex2;

import chapter21.Fibonacci;




public class Ex2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
            new Thread(new Fibonacci(i)).start();
    }
}
