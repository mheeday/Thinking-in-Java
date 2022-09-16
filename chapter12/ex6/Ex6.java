package chapter12.ex6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class SampleLogger1 extends Exception {
    private static Logger logger =
            Logger.getLogger("SampleLogger1");
    public SampleLogger1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class SampleLogger2 extends Exception {
    private static Logger logger =
            Logger.getLogger("SampleLogger2");
    public SampleLogger2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Ex6 {
    public static void main(String[] args) {
        try {
            throw new SampleLogger1();
        } catch(SampleLogger1 e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new SampleLogger2();
        } catch(SampleLogger2 e) {
            System.err.println("Caught " + e);
        }
    }
}
