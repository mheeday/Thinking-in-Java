package chapter11.ex12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(9);
        List<Integer> secondList = new ArrayList<>(9);
        Collections.addAll(firstList, 0,1,2,3,4,5,6,7,8,9);

        Iterator<Integer> firstListIterator = firstList.listIterator();

        while (firstListIterator.hasNext()) {
            secondList.add(0, firstListIterator.next());
        }

        System.out.println(firstList);
        System.out.println(secondList);
    }
}
