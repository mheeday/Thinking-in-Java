package chapter13.ex7;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {
    static void regexSplit(String word, String regex) {
        System.out.println(word.split(regex).toString());
    }
    public static void main(String[] args) {
        String regex = "^\\p{Upper}.+\\.$";

        String sentence = "Hello everyone here. This is another sentence. Here is another.";

        Pattern pattern = Pattern.compile("^[A-Z]([a-z]\\.)\\+\\.$");

        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println("Match " + matcher.group());
        }

//        String[] regexSplit = sentence.split("^[A-Z]([a-z]\\.)*\\.");
//
//        System.out.println(Arrays.toString(regexSplit));




    }
}
