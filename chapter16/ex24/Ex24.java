package chapter16.ex24;

import java.util.Arrays;
import java.util.Comparator;

import static chapter13.ex6.Ex6.DataHolder;

class DataHolderWithEquals extends DataHolder {
    DataHolderWithEquals(int data) { super(data); }
    public boolean equals(Object o) {
        return o instanceof DataHolderWithEquals &&
                data == ((DataHolder)o).data;
    }
}

public class Ex24 {
    public static void main(String[] args) {
        Comparator<DataHolder> comp =
                new Comparator<DataHolder>() {
                    public int compare(DataHolder o1, DataHolder o2) {
                        return (o1.data < o2.data ? -1 :
                                (o1.data == o2.data ? 0 : 1));
                    }
                };
        DataHolder[] a = new DataHolderWithEquals[10];
        for(int i = 0; i < a.length; i++)
            a[i] = new DataHolderWithEquals(i);
        Arrays.sort(a, comp);
        int location = Arrays.binarySearch(a, a[7], comp);
        System.out.println("Variable " + a[7] + " is at " + location);
        if(location >= 0)
            System.out.println(", a[" + location + "] = " + a[location]);
        else
            System.out.println();
        location = Arrays.binarySearch(a, a[5], comp);
        System.out.println("Variable " + a[5] + " is at " + location);
        if(location >= 0)
            System.out.println(", a[" + location + "] = " + a[location]);
    }
}
