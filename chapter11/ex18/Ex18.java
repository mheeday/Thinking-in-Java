package chapter11.ex18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class Ex18 {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(1, "One");
        integerStringHashMap.put(2, "Two");
        integerStringHashMap.put(3, "Three");
        integerStringHashMap.put(4, "Four");
        integerStringHashMap.put(5, "Five");

        System.out.println(integerStringHashMap);

        TreeSet<Integer> sortedKeySet = new TreeSet<>(integerStringHashMap.keySet());

        System.out.println(sortedKeySet);

        LinkedHashMap<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();
        for (Integer i: sortedKeySet) {
            integerStringLinkedHashMap.put(i, integerStringHashMap.get(i));
        }

        System.out.println(integerStringLinkedHashMap);
    }
}
