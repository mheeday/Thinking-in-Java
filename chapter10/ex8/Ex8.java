package chapter10.ex8;

class Box {
    class Pencil {
        private int i;
        private void draw(){
            System.out.println("draw()");
        }
    }
    void modifyPencil(){
        Pencil c = new Pencil();
        System.out.println(c.i);
        c.draw();
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Box b = new Box();
        b.modifyPencil();		//Works
    }
}
