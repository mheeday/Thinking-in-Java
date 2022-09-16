package chapter21;

public class Worker implements Runnable {
    private static int taskCount;
    private final int id = taskCount++;

    public Worker() {
        System.out.println("Ex1 started, ID = " + id);
    }

    @Override
    public void run() {
        System.out.println("Stage 1..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 2..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 3..., ID = " + id);
        Thread.yield();
        System.out.println("Worker ended, ID = " + id);

    }
}
