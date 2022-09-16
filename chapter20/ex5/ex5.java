package chapter20.ex5;

import chapter20.OSExecute;
import chapter20.Test;

import java.util.HashSet;

public class ex5 extends HashSet<String> {
    @Test
    void _t1() {
        assert isEmpty();
        add("one");
    }
    @Test void _t2() {
        assert isEmpty();
        add("one");
    }
    public static void main(String[] args) throws Exception {
        OSExecute.command("java " +
                "net.mindview.atunit.AtUnit E05_TestSetupFixture2");
    }
}
