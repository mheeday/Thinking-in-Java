package chapter11.ex7;

import java.util.*;

class RandomClass {
     int num;
    RandomClass(int num){
        this.num = num;
        System.out.println("Created Random Class with Number #" + this.num);
    }
    public String toString(){
        return "Jug #" + num;
    }
}

public class Ex7 {
    public static void main(String[] args) {
        RandomClass[] randomClassArray = new RandomClass[5];

        for(int i=0; i<5; i++) {
            randomClassArray[i] = new RandomClass(i);
        }

        List<RandomClass> randomClassList = Arrays.asList(randomClassArray);

        System.out.println("Random Class List" + randomClassList);

        List<RandomClass> subRandomList = randomClassList.subList(2, 5);

        System.out.println("Sublist: " + subRandomList);

        //randomClassList.removeAll(subRandomList);	//Cannot edit List made from Array

    }

}
