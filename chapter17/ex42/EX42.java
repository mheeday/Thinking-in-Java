package chapter17.ex42;

import chapter16.CollectionData;
import chapter16.Generated;
import chapter16.Generator;
import chapter17.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class TwoStringAlphabetic
        implements Comparable<TwoStringAlphabetic> {
    String firstString, secondString;
    public TwoStringAlphabetic(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }
    public String toString() {
        return "[s1 = " + firstString + ", s2 = " + secondString + "]";
    }
    public int compareTo(TwoStringAlphabetic otherToCompare) {
        String rvi = otherToCompare.firstString;
        return firstString.toLowerCase().compareTo(rvi.toLowerCase());
    }
    private static RandomGenerator.String randomStringGenerator =
            new RandomGenerator.String();
    public static Generator<TwoStringAlphabetic> generator() {
        return new Generator<TwoStringAlphabetic>() {
            public TwoStringAlphabetic next() {
                return new TwoStringAlphabetic(
                        randomStringGenerator.next(), randomStringGenerator.next());
            }
        };
    }
}
class CompareSecondAlphabetic
        implements Comparator<TwoStringAlphabetic> {
    public int compare(TwoStringAlphabetic twoStringAlphabetic1,
                       TwoStringAlphabetic twoStringAlphabetic2) {
        return twoStringAlphabetic1.firstString.toLowerCase().compareTo(
                twoStringAlphabetic2.firstString.toLowerCase());
    }
}

public class EX42 {
    public static void main(String[] args) {
        TwoStringAlphabetic [] array =
                new TwoStringAlphabetic [10];
        Generated.array(array, TwoStringAlphabetic.generator());
        System.out.println("before sorting, array = " +
                Arrays.asList(array));
        Arrays.sort(array);
        System.out.println("\nafter sorting, array = " +
                Arrays.asList(array));
        Arrays.sort(array, new CompareSecondAlphabetic());
        System.out.println("\nafter sorting with CompareSecondAlphabetic," +
                " array = " +
                Arrays.asList(array));
        ArrayList<TwoStringAlphabetic> list =
                new ArrayList<TwoStringAlphabetic>(
                        CollectionData.list(
                                TwoStringAlphabetic.generator(), 10));
        TwoStringAlphabetic zeroth = list.get(0);
        System.out.println("\nbefore sorting, list = " + list);
        Collections.sort(list);
        System.out.println("\nafter sorting, list = " + list);
        Comparator<TwoStringAlphabetic> comp =
                new CompareSecondAlphabetic();
        Collections.sort(list, comp);
        System.out.println("\nafter sorting with CompareSecondAlphabetic," +
                " list = "
                + list);
        int index =
                Collections.binarySearch(list, zeroth, comp);
        System.out.println("\nFormer zeroth element " +
                zeroth + " now located at " + index);
    }
}
