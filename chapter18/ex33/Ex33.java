package chapter18.ex33;

import java.util.Scanner;
import java.util.prefs.Preferences;

public class Ex33 {
    public static void main(String[] args) throws Exception {
        Preferences prefs = Preferences
                .userNodeForPackage(Ex33.class);
        String directory =
                prefs.get("base directory", "Not defined");
        System.out.println("directory: " + directory);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new directory: ");
        directory = sc.nextLine();
        prefs.put("base directory", directory);
        System.out.println("\ndirectory: " + directory);
    }
}
