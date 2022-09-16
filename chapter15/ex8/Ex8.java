package chapter15.ex8;

import java.util.Iterator;
import java.util.Random;

interface Generator<T> { T next(); }

class StoryCharacter {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuys extends StoryCharacter {
    public String toString() {
        return super.toString() + " is a good guy";
    }
}

class BadGuys extends StoryCharacter {
    public String toString() {
        return super.toString() + " is a bad guy";
    }
}
class Thano extends BadGuys {};
class ScarletWitch extends BadGuys {};

class IronMan extends GoodGuys {};
class DoctorStrange extends GoodGuys {};


class StoryCharacterGenerator implements
        Generator<StoryCharacter>, Iterable<StoryCharacter> {
    private Class<?>[] types = {
            Thano.class, ScarletWitch.class,
            IronMan.class, DoctorStrange.class
    };
    private static Random rand = new Random(47);
    public StoryCharacterGenerator() {}
    private int size = 0;
    public StoryCharacterGenerator(int sz) { size = sz; }
    public StoryCharacter next() {
        try {
            return (StoryCharacter)
                    types[rand.nextInt(types.length)].newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    class CharacterIterator implements
            Iterator<StoryCharacter> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public StoryCharacter next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    };
    public Iterator<StoryCharacter> iterator() {
        return new CharacterIterator();
    }
}

public class Ex8 {
    public static void main(String[] args) {
        StoryCharacterGenerator storyCharacters = new StoryCharacterGenerator();
        for(int i = 0; i < 7; i++)
            System.out.println(storyCharacters.next());
        for(StoryCharacter storyCharacter : new StoryCharacterGenerator(7))
            System.out.println(storyCharacter);
    }
}
