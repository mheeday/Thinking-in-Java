package chapter11.ex3;


import java.util.ArrayList;
import java.util.List;

interface Selector {
    boolean end();
    Object current();
    void next();
}
class Sequence {
    private List<Object> objectList;
    public Sequence() { objectList = new ArrayList<Object>(); }
    public void add(Object x) {
        objectList.add(x);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == objectList.size(); }
        public Object current() { return objectList.get(i); }
        public void next() { if(i < objectList.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }

}

public class Ex3 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }

}
