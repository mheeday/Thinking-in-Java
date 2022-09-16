package chapter15.ex41;

import java.util.*;
class Pet {
    public Pet() {
    }
}

class Pets {
    public static Pet[] createArray(int i) {
        return new Pet[8];
    }
}

class Dog extends Pet {
    public Dog(String name) { super(); }
    public Dog() { super(); }
}
class Mutt extends Dog {
    public Mutt(String name) { super(name); }
    public Mutt() { super(); }
}

class Cat extends Pet {
    public Cat(String name) { super(); }
    public Cat() { super(); }
}
class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() { super(); }
}
class Cymric extends Manx {
    public Cymric(String name) { super(name); }
    public Cymric() { super(); }
}

class Rodent{
    void eat(){
        System.out.println("Rodent.eat()");
    }
    void run(){
        System.out.println("Rodent.run()");
    }

}
class Mouse extends Rodent {
    @Override
    void eat(){
        System.out.println("Mouse.eat()");
    }
    @Override
    void run(){
        System.out.println("Mouse.run()");
    }
}

interface Addable<T> { void add(T t); }
interface Generator<T> { T next(); }

class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void add(T t) { storage.offer(t); }
    public T get() { return storage.poll(); }
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
class Fill2 {
    // Classtoken version:
//    public static <T> void fill(Addable<T> addable,
//                                Class<? extends T> classToken, int size) {
//        for(int i = 0; i < size; i++)
//            try {
//                addable.add(classToken.newInstance());
//            } catch(Exception e) {
//                throw new RuntimeException(e);
//            }
//    }
    // Generator version:
    public static <T> void fill(Addable<T> addable,
                                Generator<T> generator, int size) {
        for(int i = 0; i < size; i++)
            addable.add(generator.next());
    }

    public static <T> void fill(Addable<T> collectionAdapter, Class<T> mouseClass, int size) {
        for(int i = 0; i < size; i++)
            try {
                collectionAdapter.add(mouseClass.newInstance());
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
    }

}
// To adapt a base type, you must use composition.
// Make any Collection Addable using composition:
class AddableCollectionAdapter<T> implements Addable<T> {
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }
    public void add(T item) { c.add(item); }
}
// A Helper to capture the type automatically:
class Adapter {
    public static <T>
    Addable<T> collectionAdapter(Collection<T> c) {
        return new AddableCollectionAdapter<T>(c);
    }

    // Make a SimpleQueue Addable using inheritance:
}

class AddableSimpleQueue<T>
        extends SimpleQueue<T> implements Addable<T> {
    public void add(T item) {
        super.add(item);
    }
}
public class Ex41 {
    public static void main(String[] args) throws Exception {
// Adapt a Collection:
        List<Pet> carrier = new ArrayList<Pet>();
        Fill2.fill(
                new AddableCollectionAdapter<Pet>(carrier),
                Pet.class, 3);
// Helper method captures the type:
//        Fill2.fill(Adapter.collectionAdapter(carrier),
//                Mouse.class, 2);
        for(Pet p: carrier)
            System.out.println(p);
        System.out.println("----------------------");
// Use an adapted class:
            AddableSimpleQueue<Pet> petQueue =
                new AddableSimpleQueue<Pet>();
//        Fill2.fill(petQueue, Mutt.class, 4);
//        Fill2.fill(petQueue, Cymric.class, 1);
        for(Pet p: petQueue)
            System.out.println(p);
    }
}
