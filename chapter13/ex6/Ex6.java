package chapter13.ex6;

import static java.lang.String.format;

public class Ex6 {
    public static class DataHolder {
        public int data;
        int intField = 10;
        long longField = 20L;
        float floatField = 45.0f;
        double doubleField = 4.0;
        public DataHolder() {
            this.data = data;
        }
        public DataHolder(int data) {
            this.data = data;
        }

        public String toString() {
            StringBuilder result =
                    new StringBuilder("DataHolder: \n");
            result.append(
                    format("intField: %d\n", intField));
            result.append(
                    format("longField: %d\n", longField));
            result.append(
                    format("floatField: %f\n", floatField));
            result.append(
                    format("doubleField: %e\n", doubleField));
            return result.toString();
        }
    }


    public static void main(String[] args) {
        System.out.println(new DataHolder());
    }
}
