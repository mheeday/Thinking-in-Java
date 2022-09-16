package chapter13.ex11;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11 {
    public static void main(String[] args) {
        String sampleString = "Arline ate eight apples and one orange while Anita hadn’t any";

        Pattern pattern = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");

        Matcher matcher = pattern.matcher(sampleString);

        while (matcher.find()) {
            System.out.println("Mach " + matcher.group());
        }

        //System.out.println(Arrays.toString(sampleString.split("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b")));
    }
}
