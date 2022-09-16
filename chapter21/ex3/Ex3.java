package chapter21.ex3;

import chapter21.Worker;

import java.util.concurrent.*;

public class Ex3 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
            exec.execute(new Worker());
        Thread.yield();
        exec.shutdown();
        exec = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; i++)
            exec.execute(new Worker());
        Thread.yield();
        exec.shutdown();
        exec = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 5; i++)
            exec.execute(new Worker());
        Thread.yield();
        exec.shutdown();
    }
}
