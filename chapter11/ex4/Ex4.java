package chapter11.ex4;

import java.util.*;
class Generator {
    public String[] snowWhiteCharacters = new String[10];
    public Generator(){
        snowWhiteCharacters[0] = "Dopey";
        snowWhiteCharacters[1] = "Sleepy";
        snowWhiteCharacters[2] = "Sneezy";
        snowWhiteCharacters[3] = "The Prince";
        snowWhiteCharacters[4] = "The Huntsman";
        snowWhiteCharacters[5] = "Snow White";
        snowWhiteCharacters[6] = "Doc";
        snowWhiteCharacters[7] = "Grumpy";
        snowWhiteCharacters[8] = "The Evil Queen";
        snowWhiteCharacters[9] = "The Magic Mirror";
    }

    private static int counter = 0;
    public String next(){
        if (counter == 9) {
            counter = 0;
        }
        return snowWhiteCharacters[counter++];
    }
    public Collection<String> fillCollection(Collection<String> stringCollection, int i){
        for (int l = 0; l <= i; l++){
            stringCollection.add(next());
        }
        return stringCollection;
    }
}



public class Ex4 {
    public static void main(String[] args) {
        Generator generator = new Generator();
        String[] stringArray = new String[11];
        for (int i = 0; i < stringArray.length; i++){		//Array is created and populated in a lousy way
            stringArray[i] = generator.next();
        }
        for (String s : stringArray){
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println(generator.fillCollection(new HashSet<String>(), 8));
        System.out.println(generator.fillCollection(new LinkedHashSet<String>(), 7));
        System.out.println(generator.fillCollection(new TreeSet<String>(), 12));
        System.out.println(generator.fillCollection(new ArrayList<String>(), 10));
        System.out.println(generator.fillCollection(new LinkedList<String>(), 9));
            }
}
