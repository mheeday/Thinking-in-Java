package chapter16.ex2;

import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Ex2 {
    public static BerylliumSphere[] berylliumSphereFactory (int number) {
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[number];
        for (int i = 0; i < number; i++) {
            berylliumSpheres[i] = new BerylliumSphere();
        }
        return berylliumSpheres;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(berylliumSphereFactory(10)));
    }
}
