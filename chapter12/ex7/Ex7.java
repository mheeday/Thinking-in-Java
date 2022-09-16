package chapter12.ex7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex7 {
    private static Logger logger =
            Logger.getLogger("Sample Logger");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String args[]) {
        String[] strings = new String[5];
        try {
            strings[6] = "Hello";
        } catch(ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
