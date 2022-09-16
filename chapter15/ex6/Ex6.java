package chapter15.ex6;

import java.util.*;
class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) { storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
}

public class Ex6 {
    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for(String s: ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for(int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");

        System.out.println("\n------------------------- \n");

        //Using it with another type
        RandomList<Integer> integerRandomList = new RandomList<>();
        for(Integer integer: new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
            integerRandomList.add(integer);
        for(int i = 0; i < 11; i++)
            System.out.print(integerRandomList.select() + " ");

        System.out.println("\n-------------------------\n");

        //Using it with another type
        RandomList<Character> charRandomList = new RandomList<>();
        for(Character character: new char[]{'a', 'b', 'c', 'd', 'e', 'f'})
            charRandomList.add(character);
        for(int i = 0; i < 11; i++)
            System.out.print(charRandomList.select() + " ");
    }
}
