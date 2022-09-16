package chapter11.ex6;

import java.util.*;

public class Ex6 {
    public static List<String> StringsToList(int max) {
        Random random = new Random(47);
        List<String> stringArrayList = new ArrayList<String>();
        for(int i = 0; i < max; i++)
            stringArrayList.add(Integer.toString(random.nextInt(47)));
        return stringArrayList;
    }
    public static void main(String[] args) {
        Random random = new Random(47);
        List<String> stringList = StringsToList(10);
        System.out.println("1: " + stringList);
        String h = "1";
        stringList.add(h); // Automatically resizes
        System.out.println("2: " + stringList);
        System.out.println("3: " + stringList.contains(h));
        stringList.remove(h); // Remove by object
        String p = stringList.get(2);
        System.out.println("4: " + p + " " + stringList.indexOf(p));
        String cymric = "2";
        System.out.println("5: " + stringList.indexOf(cymric));
        System.out.println("6: " + stringList.remove(cymric));
        // Must be the exact object:
        System.out.println("7: " + stringList.remove(p));
        System.out.println("8: " + stringList);
        stringList.add(3, "3"); // Insert at an index
        System.out.println("9: " + stringList);
        List<String> sub = stringList.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + stringList.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + stringList.containsAll(sub));
        Collections.shuffle(sub, random); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + stringList.containsAll(sub));
        List<String> copy = new ArrayList<String>(stringList);
        sub = Arrays.asList(stringList.get(1), stringList.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(stringList); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, "5"); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + stringList.isEmpty());
        stringList.clear(); // Remove all elements
        System.out.println("19: " + stringList);
        System.out.println("20: " + stringList.isEmpty());
        stringList.addAll(StringsToList(4));
        System.out.println("21: " + stringList);
        Object[] o = stringList.toArray();
        System.out.println("22: " + o[3]);
        String[] pa = stringList.toArray(new String[0]);
        System.out.println("23: " + pa[3]);
    }
}
