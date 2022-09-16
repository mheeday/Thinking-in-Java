package chapter11.ex9;

import java.util.ArrayList;
import java.util.Iterator;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Ex9 {
public static class Sequence {
    private ArrayList<Object> items;

    public void add(Object newObject) {
        this.items.add(newObject);
    }

    public Sequence() {
        this.items = new ArrayList<Object>();
    }

    private class SequenceSelector implements Iterator<Object> {
        private int counter = 0;
        private int length;

        public SequenceSelector () {
            this.length = items.size();
        }

        @Override
        public boolean hasNext() {
            if (counter>= length) {
                return false;
            }
            return true;
        }

        public Object next() {
            if(this.counter < length) {
                return items.get(counter++);
            }
            return null;
        }
    }

    public SequenceSelector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        SequenceSelector selector = sequence.selector();
        while(selector.hasNext()) {
            System.out.print(selector.next() + " ");
        }
    }
}
 }
