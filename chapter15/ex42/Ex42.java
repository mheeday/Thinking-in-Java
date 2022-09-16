package chapter15.ex42;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


interface UnaryFunction<R,T> { R function(T x); }

class A {
    private int aValue;

    public int getaValue() {
        return aValue;
    }
    public void tenA() {
        this.aValue *= 10;
    }

    public A(int aValue) {
        this.aValue = aValue;
    }

    public void setaValue(int aValue) {
        this.aValue = aValue * 2;
    }
}

class B {
    private String bValue;

    public String getbValue() {
        return bValue;
    }

    public B(String bValue) {
        this.bValue = bValue;
    }
    public String doubleB() {
        return this.bValue = this.bValue + " " + this.bValue;
    }
    public void setbValue(String  bValue) {
        this.bValue = bValue;
    }
}

interface Combiner<T> { T combine(T x, T y); }
interface Collector<T> extends UnaryFunction<T,T> {
    T result(); // Extract result of collecting parameter
}
interface UnaryPredicate<T> { boolean test(T x); }

class Functional {
    // Calls the Combiner object on each element to combine
// it with a running result, which is finally returned:
    public static <T> T
    reduce(Iterable<T> seq, Combiner<T> combiner) {
        Iterator<T> it = seq.iterator();
        if (it.hasNext()) {
            T result = it.next();
            while (it.hasNext())
                result = combiner.combine(result, it.next());
            return result;
        }
// If seq is the empty list:
        return null; // Or throw exception
    }

    // Take a function object and call it on each object in
// the list, ignoring the return value. The function
// object may act as a collecting parameter, so it is
// returned at the end.
    public static <T> Collector<T>
    forEach(Iterable<T> seq, Collector<T> func) {
        for (T t : seq)
            func.function(t);
        return func;
    }

    // Creates a list of results by calling a
// function object for each object in the list:
    public static <R, T> List<R>
    transform(Iterable<T> seq, UnaryFunction<R, T> func) {
        List<R> result = new ArrayList<R>();
        for (T t : seq)
            result.add(func.function(t));
        return result;
    }

    // Applies a unary predicate to each item in a sequence,
// and returns a list of items that produced "true":
    public static <T> List<T>
    filter(Iterable<T> seq, UnaryPredicate<T> pred) {
        List<T> result = new ArrayList<T>();
        for (T t : seq)
            if (pred.test(t))
                result.add(t);
        return result;
    }

    //
// To use the above generic methods, we need to create
// function objects to adapt to our particular needs:
    static class IntegerAdder implements Combiner<Integer> {
        public Integer combine(Integer x, Integer y) {
            return x + y;
        }
    }

    static class
    IntegerSubtracter implements Combiner<Integer> {
        public Integer combine(Integer x, Integer y) {
            return x - y;
        }
    }

    static class
    BigDecimalAdder implements Combiner<BigDecimal> {
        public BigDecimal combine(BigDecimal x, BigDecimal y) {
            return x.add(y);
        }
    }

    static class
    BigIntegerAdder implements Combiner<BigInteger> {
        public BigInteger combine(BigInteger x, BigInteger y) {
            return x.add(y);
        }
    }

    static class
    AtomicLongAdder implements Combiner<AtomicLong> {
        public AtomicLong combine(AtomicLong x, AtomicLong y) {
// Not clear whether this is meaningful:
            return new AtomicLong(x.addAndGet(y.get()));
        }
    }

    // We can even make a UnaryFunction with an "ulp"
// (Units in the last place):
    static class BigDecimalUlp
            implements UnaryFunction<BigDecimal, BigDecimal> {
        public BigDecimal function(BigDecimal x) {
            return x.ulp();
        }
    }

    static class GreaterThan<T extends Comparable<T>>
            implements UnaryPredicate<T> {
        private T bound;

        public GreaterThan(T bound) {
            this.bound = bound;
        }

        public boolean test(T x) {
            return x.compareTo(bound) > 0;
        }
    }

    static class MultiplyingIntegerCollector
            implements Collector<Integer> {
        private Integer val = 1;

        public Integer function(Integer x) {
            val *= x;
            return val;
        }

        public Integer result() {
            return val;
        }
    }
}
public class Ex42 {
    static class TenTimes implements
            UnaryFunction<A,A> {
        public A function(A x) {
            x.tenA();
            return x;
        }
    }
    static class Doubleb
            implements UnaryFunction<String,B> {
        public String function(B x) {
            return x.doubleB();
        }
    }

    public static void main(String[] args) {
        A rf = new A(4);
        List<A> ldm1 = Arrays.asList(
                new A(3), new A(10),
                new A(1),new A(7));

        List<B> ldm2 = Arrays.asList(
                new B("a"), new B("B"),
                new B("c"),new B("d"));

    }
}
