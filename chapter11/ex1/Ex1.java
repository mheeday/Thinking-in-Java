package chapter11.ex1;

import java.util.ArrayList;

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

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i <5; i++) {
            gerbils.add(new Gerbil(i));
        }

        for (int i = 0; i <5; i++) {
            gerbils.get(i).hop();
        }
    }
}
