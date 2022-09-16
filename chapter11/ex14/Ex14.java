package chapter11.ex14;

import java.util.LinkedList;

public class Ex14 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        for (int i = 0; i<10; i++) {
            integerLinkedList.add(integerLinkedList.size()/2, i);
        }
        System.out.println(integerLinkedList);
    }
}
