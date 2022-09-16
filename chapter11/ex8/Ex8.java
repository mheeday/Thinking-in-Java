package chapter11.ex8;

import java.util.ArrayList;
import java.util.Iterator;

class  Gerbil{
    int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop(){
        System.out.println("Gerbil NUmber is " + this.gerbilNumber);
        System.out.println("hopping");
    }
}

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        for (int i = 0; i <15; i++) {
            gerbils.add(new Gerbil(i));
        }

        Iterator<Gerbil> gerbilIterator = gerbils.iterator();

        while (gerbilIterator.hasNext()) {
            gerbilIterator.next().hop();
        }
    }
}