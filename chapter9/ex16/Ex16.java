package chapter9.ex16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

import java.util.Scanner;


class RandomCharacters implements Readable{
    int length;
    int count = 0;
    int [] integerStream;

    RandomCharacters (int length) {
        this.length = length;

        this.integerStream = new int[length];

        for (int i =0; i < length; i++) {
            System.out.println(i);
            Random random = new Random();
            int randomInteger = random.nextInt(123);
            if (randomInteger < 65) {
                randomInteger += 65;
            }
            if (randomInteger > 91 && randomInteger <97) {
                randomInteger += 6;
            }

            if (randomInteger > 122) {
                randomInteger = 122;
            }
            this.integerStream[i] = randomInteger;
        }
    }

    public int next () {
        if (this.count == this.length) {
            return -1;
        }
        return integerStream[this.count++];

    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        cb.append((char)this.next()+ " ");
        return this.next();
    }
}

public class Ex16 {
    public static void main(String[] args) {

        RandomCharacters randomCharacters = new RandomCharacters(24);

        Scanner scanner = new Scanner(randomCharacters);
        while(scanner.hasNext())
            System.out.println(scanner.next() + " ");
    }
}
