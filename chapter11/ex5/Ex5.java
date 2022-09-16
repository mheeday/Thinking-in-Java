package chapter11.ex5;

import java.util.*;

public class Ex5 {
    public static List<Integer> IntegersToList(int max) {
    Random random = new Random(47);
    List<Integer> integerArrayList = new ArrayList<Integer>();
    for(int i = 0; i < max; i++)
        integerArrayList.add(random.nextInt(47));
    return integerArrayList;
}
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> Integers = IntegersToList(7);
        System.out.println("1: " + Integers);
        Integer h = 1;
        Integers.add(h); // Automatically resizes
        System.out.println("2: " + Integers);
        System.out.println("3: " + Integers.contains(h));
        Integers.remove(h); // Remove by object
        Integer p = Integers.get(2);
        System.out.println("4: " + p + " " + Integers.indexOf(p));
        Integer cymric = 2;
        System.out.println("5: " + Integers.indexOf(cymric));
        System.out.println("6: " + Integers.remove(cymric));
        // Must be the exact object:
        System.out.println("7: " + Integers.remove(p));
        System.out.println("8: " + Integers);
        Integers.add(3, 3); // Insert at an index
        System.out.println("9: " + Integers);
        List<Integer> sub = Integers.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + Integers.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + Integers.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + Integers.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(Integers);
        sub = Arrays.asList(Integers.get(1), Integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Integer>(Integers); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, 5); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + Integers.isEmpty());
        Integers.clear(); // Remove all elements
        System.out.println("19: " + Integers);
        System.out.println("20: " + Integers.isEmpty());
        Integers.addAll(IntegersToList(4));
        System.out.println("21: " + Integers);
        Object[] o = Integers.toArray();
        System.out.println("22: " + o[3]);
        Integer[] pa = Integers.toArray(new Integer[0]);
        System.out.println("23: " + pa[3]);
    }

}
