package chapter15.ex4;

import java.lang.reflect.Array;

interface Selector {
    boolean end();
    Object current();
    void next();
}
class Sequence<T> {
    private T[] items;
    private int next = 0;
    public Sequence(Class<T> clazz, int size) { this.items = (T[]) Array.newInstance(clazz, size); }
    public void add(T t) {
        if(next < items.length)
            items[next++] = t;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }

}
public class Ex4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(String.class, 10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
