package chapter17.ex3;

import chapter17.Countries;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Map<String, String> allCountries = Countries.capitals();

        Set<String> oneCountryTress =  new TreeSet<>();
        Set<String> oneCountryHash =  new HashSet<>();
        Set<String> oneCountryLinked =  new LinkedHashSet<>();

        for (int  i = 0 ; i < 5 ; i++) {
            oneCountryTress.add(allCountries.get("ALGERIA"));
            oneCountryHash.add(allCountries.get("ALGERIA"));
            oneCountryLinked.add(allCountries.get("ALGERIA"));
        }
        System.out.println(oneCountryTress);
        System.out.println(oneCountryHash);
        System.out.println(oneCountryLinked);
    }
}
