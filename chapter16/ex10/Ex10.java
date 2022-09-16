package chapter16.ex10;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        ArrayList<List<String>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<String>());
// Compile-time checking produces an error:
//! ls.add(new ArrayList<Integer>());
        arrayList.get(0).add("Array of Generics");
        System.out.println(arrayList);
    }
}
