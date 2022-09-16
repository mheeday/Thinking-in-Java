package chapter17.ex2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import chapter17.Countries;
import chapter17.Countries.*;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, String> allCountries = Countries.capitals();

        Map<String, String> countriesMap = new TreeMap<>();
        Set<String> countriesSet =  new TreeSet<>();

        for (String country : allCountries.values()) {
            System.out.println(country);
            if (country.startsWith("A")) {
                System.out.println(country);
                countriesSet.add(country);
                countriesMap.put(country, allCountries.get(country));
            }
        }

        System.out.println(countriesSet);
        System.out.println(countriesMap);
    }
}
