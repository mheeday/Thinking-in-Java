package chapter7;

class Simple{
    int i = 5;
    void printI(){
        System.out.println(i);
    }
}
    public class Ex1 {
        Simple simple;
        void useSimple(){
            simple = new Simple(); //Lazy initialization
            simple.printI();
        }
        public static void main(String[] args){
            Ex1 ex1 = new Ex1();
            ex1.useSimple();
        }
    }

