package chapter16.ex1;



public class Ex1 {

    public static class BerylliumSphere {
        private static long counter;
        private final long id = counter++;

        public String toString() {
            return "Sphere " + id;
        }
    }

    public static void berylliumSphereMethod(BerylliumSphere[] berylliumSpheres) {
        for (BerylliumSphere berylliumSphere : berylliumSpheres) {
            System.out.println("Beryllium -> " + berylliumSphere);
        }
    }

    public static void main(String[] args) {

        // Dynamic aggregate initialization:
        berylliumSphereMethod(new BerylliumSphere[]{
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()
        });

        // Ordinary aggregate array initialization throws error
//        berylliumSphereMethod({ new BerylliumSphere(), new BerylliumSphere() });

        // Aggregate initialization:
        BerylliumSphere[] berylliumSpheres = {
                new BerylliumSphere(),
                new BerylliumSphere(),
                new BerylliumSphere()};
        berylliumSphereMethod(berylliumSpheres);

        // Redundant dynamic aggregate initialization
        BerylliumSphere[] spheres = new BerylliumSphere[]{
                new BerylliumSphere(),
                new BerylliumSphere()};
        berylliumSphereMethod(spheres);
    }

}
