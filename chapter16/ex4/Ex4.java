package chapter16.ex4;

import java.util.Arrays;

public class Ex4 {
    public static double[][][] arrayConstructor(int firstLength, int secondLength, int thirdLength, double start, double end) {
        double[][][] doubles = new double[firstLength][secondLength][thirdLength];
        double increment = (end - start) / (firstLength * secondLength * thirdLength);
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                for (int k = 0; k < doubles[i][j].length; k++) {
                    doubles[i][j][k] = start;
                    start += increment;
                }
            }
        }
        return doubles;
    }

    public static void printArrayGuys(double[][][] triples) {
        for (int i = 0; i < triples.length; i++) {
            for (int j = 0; j < triples[i].length; j++) {
                System.out.println(Arrays.toString((triples[i][j])));
                System.out.println("-----------------------------");
            }
        }
    }

    public static void main(String[] args) {
        double[][][] twoD = arrayConstructor(2, 2, 2, 100.0, 1000.0);
        printArrayGuys(twoD);
        System.out.println("=======================================");
        double[][][] twoD2 = arrayConstructor(10, 10, 10, 100.0, 200.0);
        printArrayGuys(twoD2);
        System.out.println("=======================================");
    }
}
