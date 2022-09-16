package chapter17.ex41;

import chapter16.CollectionData;
import chapter16.Generator;
import chapter17.RandomGenerator;

import java.util.HashMap;
import java.util.HashSet;

class TwoString2 implements Comparable<TwoString2> {
    String firstString, secondString;
    public TwoString2(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }
    public String toString() {
        return "FirstString = " + firstString + ", SecondString = " + secondString;
    }
    public int compareTo (TwoString2 twoString) {
        String rvi = twoString.firstString;
        return firstString.compareTo(rvi);
    }
    public int hashCode() {
// Since the comparisons are based on s1,
// use s1's hashCode:
        return firstString.hashCode();
    }
    public boolean equals(Object obj) {
        return obj instanceof TwoString2 &&
                ((TwoString2)obj).secondString.equals(secondString);
    }
    private static RandomGenerator.String randomStringGenerator =
            new RandomGenerator.String();
    public static Generator<TwoString2> generator() {
        return new Generator<TwoString2>() {
            public TwoString2 next() {
                return new TwoString2(randomStringGenerator.next(), randomStringGenerator.next());
            }
        };
    }
}


public class Ex41 {
    public static void main(String[] args) {
        HashSet<TwoString2> hashSet = new HashSet<TwoString2>();
        HashMap<TwoString2,Integer> hm =
                new HashMap<TwoString2,Integer>();
        Generator<TwoString2> gen = TwoString2.generator();
        hashSet.addAll(CollectionData.list(gen, 20));
        for(int i = 0; i < 20; i++)
            hm.put(gen.next(), i);
        System.out.println("hs = " + hashSet);
        System.out.println("hm = " + hm);
    }
}
