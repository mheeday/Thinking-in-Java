package chapter11.ex32;

import java.util.*;

class Pet {
}

class Pets {
    public static Pet[] createArray(int i) {
        return new Pet[8];
    }
}
class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class Ex32 {
    static class NonCollectionSequence32 extends PetSequence implements Iterable {

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;

                    public boolean hasNext() {
                        return current > -1;
                    }

                    public Pet next() {
                        return pets[current--];
                    }

                    public void remove() {
                        throw new
                                UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new
                        ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }


}
    public static void main(String[] args) {
        NonCollectionSequence32 nc = new NonCollectionSequence32();
        System.out.print("pets: ");
        for (Pet p : nc.pets)
            System.out.print(p + " ");
        System.out.println("");
        System.out.print("reversed: ");
        for (Pet p : nc.reversed())
            System.out.print(p + " ");
        System.out.println("");
        System.out.print("randomized: ");
        for (Pet p : nc.randomized())
            System.out.print(p + " ");
    }
}
