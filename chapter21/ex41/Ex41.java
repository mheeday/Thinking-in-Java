package chapter21.ex41;

import java.util.concurrent.*;
import java.util.*;
import java.io.*;
import net.mindview.simple.*;


public class Ex41 {
    private ExecutorService executorService =
            Executors.newSingleThreadExecutor();
    private Random rand = new Random(47);
    // Insert a random delay to produce the effect
// of a calculation time:
    private void pause(int factor) {
        try {
            TimeUnit.MILLISECONDS.sleep(
                    100 + rand.nextInt(factor));
        } catch(InterruptedException e) {
            Print.Print("sleep() interrupted");
        }
    }
    public Future<Integer>
    calculateInt(final int x, final int y) {
        return executorService.submit(new Callable<Integer>() {
            public Integer call() {
                Print.Print("starting " + x + " + " + y);
                pause(500);
                return x + y;}
        });
    }
    public Future<Float>
    calculateFloat(final float x, final float y) {
        return executorService.submit(new Callable<Float>() {
            public Float call() {
                Print.Print("starting " + x + " + " + y);
                pause(2000);
                return x + y;
            }
        });
    }
    // Message handler without a return value:
    public void printDocument(final String s) {
        executorService.execute(new Runnable() {
            public void run() {
                Print.Print("System.out.println;ing document " + s);
                pause(1000);
                Print.Print("document " + s + " System.out.println;ed");
            }
        });
    }
    public void shutdown() { executorService.shutdown(); }
    public static void main(String[] args) {
        Ex41 d1 = new Ex41();
// Prevents ConcurrentModificationException:
        List<Future<?>> results =
                new CopyOnWriteArrayList<Future<?>>();
        for(float f = 0.0f; f < 1.0f; f += 0.2f)
            results.add(d1.calculateFloat(f, f));
        for(int i = 0; i < 5; i++) {
            results.add(d1.calculateInt(i, i));
            d1.printDocument("DOC_" + i);
        }
        System.out.println("All asynch calls made");
        while(results.size() > 0) {
            for(Future<?> f : results)
                if(f.isDone()) {
                    try {
                        System.out.println(f.get());
                    } catch(Exception e) {
                        throw new RuntimeException(e);
                    }
                    results.remove(f);
                }
        }
        d1.shutdown();
    }
}
