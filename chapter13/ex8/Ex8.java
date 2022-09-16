package chapter13.ex8;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        String knights =
                "Then, when you have found the shrubbery, you must " +
                        "cut down the mightiest tree in the forest... " +
                        "with... a herring!";
        String[] splitArray = knights.split("the|you");
        System.out.println(Arrays.toString(splitArray));
    }
}
