package chapter10.ex20;

interface Set1{
    static class Unsettled {
        void unsettle(){
            System.out.println("Unsettled!");
        }
    }
}

public class Ex20 {
    public static void main(String[] args) {
        Set1.Unsettled u = new Set1.Unsettled();
        u.unsettle();
    }

}
