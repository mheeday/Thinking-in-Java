package chapter16.ex3;

import java.util.Arrays;

public class Ex3 {

    public static double[][] arrayConstructor(int firstLength, int secondLength, double start, double end) {
        double[][] doubles = new double[firstLength][secondLength];
        double increment = (end - start) / (firstLength * secondLength);
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                doubles[i][j] = start;
                start += increment;
            }
        }
        return doubles;
    }

    public static void printArrayGuys(double[][] doubles) {
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(Arrays.toString(doubles[i]));
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        double[][] newArray = arrayConstructor(2, 2, 50, 100.0);
        printArrayGuys(newArray);
        System.out.println("=======================================");
        double[][] newArray2 = arrayConstructor(10, 10, 1000.0, 100.0);
        printArrayGuys(newArray2);
        System.out.println("=======================================");
    }
}
