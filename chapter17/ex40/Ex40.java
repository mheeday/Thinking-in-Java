package chapter17.ex40;

import chapter16.CollectionData;
import chapter16.Generated;
import chapter16.Generator;
import chapter17.RandomGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class TwoString implements Comparable<TwoString> {
    String firstString, secondString;
    public TwoString(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }
    public String toString() {
        return "FirstString = " + firstString + ", SecondString = " + secondString;
    }

    public int compareTo(TwoString twoString) {
        String rvi = twoString.firstString;
        return firstString.compareTo(rvi);
    }
    private static RandomGenerator.String randomStringGenerator =
            new RandomGenerator.String();
    public static Generator<TwoString> generator() {
        return new Generator<TwoString>() {
            public TwoString next() {
                return new TwoString(randomStringGenerator.next(), randomStringGenerator.next());
            }
        };
    }
}
class CompareSecond implements Comparator<TwoString> {
    public int compare(TwoString sc1, TwoString sc2) {
        return sc1.secondString.compareTo(sc2.secondString);
    }
}


public class Ex40 {
    public static void main(String[] args) {
        TwoString[] array = new TwoString[10];
        Generated.array(array, TwoString.generator());
        System.out.println("before sorting, array = " +
                Arrays.asList(array));
        Arrays.sort(array);
        System.out.println("\nafter sorting, array = " +
                Arrays.asList(array));
        Arrays.sort(array, new CompareSecond());
        System.out.println(
                "\nafter sorting with CompareSecond, array = " +
                        Arrays.asList(array));
        ArrayList<TwoString> list = new ArrayList<TwoString>(
                CollectionData.list(TwoString.generator(), 10));
        TwoString zeroth = list.get(0);
        System.out.println("\nbefore sorting, list = " + list);
        Collections.sort(list);
        System.out.println("\nafter sorting, list = " + list);
        Comparator<TwoString> comp = new CompareSecond();
        Collections.sort(list, comp);
        System.out.println(
                "\nafter sorting with CompareSecond, list = "
                        + list);
        int index =
                Collections.binarySearch(list, zeroth, comp);
        System.out.println("\nFormer zeroth element " +
                zeroth + " now located at " + index);
    }
}
