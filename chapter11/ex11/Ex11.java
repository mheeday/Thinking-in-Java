package chapter11.ex11;

import java.util.*;

public class Ex11 {
    static void loopCollection(Collection<Object> objectCollection) {
        Iterator<Object> objectIterator = objectCollection.iterator();

        while (objectIterator.hasNext()) {
            System.out.println(objectIterator.toString());
        }
    }

    public static void main(String[] args) {
        Object[] objects = {1,2,3,4, "Two", 'c'};

        List<Object> objectArrayList = new ArrayList<>(Arrays.asList(objects));
        List<Object> objectLinkedList = new LinkedList<>(Arrays.asList(objects));

        loopCollection(objectArrayList);
        loopCollection(objectLinkedList);

    }
}
