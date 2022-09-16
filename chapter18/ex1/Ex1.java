package chapter18.ex1;

import chapter18.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                private String ext = args[0].toLowerCase();

                public boolean accept(File dir, String name) {
                    if (name.toLowerCase().endsWith(ext)) {
                        if (args.length == 1)
                            return true;
                        Set<String> words = new HashSet<>(
                                new TextFile(new File(
                                        dir, name).getAbsolutePath(), "\\W+"));
                        for (int i = 1; i < args.length; i++)
                            if (words.contains(args[i]))
                                return true;
                    }
                    return false;
                }
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
}
