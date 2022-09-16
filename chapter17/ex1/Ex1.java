package chapter17.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> countryArrayList = new ArrayList<>();
        LinkedList<String> countryLinkedList = new LinkedList<>();

        String[] countries = {"Algeria", "Benin", "Burkina Faso", "Burundi", "Cameron", "Central African Republic", "Chad", "Congo", "Egypt"};

        for (String country : countries) {
            countryArrayList.add(country);
            countryLinkedList.add(country);
        }

        Collections.sort(countryArrayList);
        Collections.sort(countryLinkedList);

        System.out.println("Sorted Array List -> " + countryArrayList);
        System.out.println("Sorted Linked List -> " + countryLinkedList);

        for (int i = 0; i < 5; i++) {
            Collections.shuffle(countryArrayList);
            System.out.println("Shuffled Array List -> " + countryArrayList);

            Collections.shuffle(countryLinkedList);
            System.out.println("Shuffled Linked List -> " + countryLinkedList);
        }
    }
}

