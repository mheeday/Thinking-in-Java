package chapter8.ex13;

class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef() { refCount++; }
    protected void dispose() {
        if(--refCount == 0)
            System.out.println("Disposing " + this);
    }
    protected void finalize() {
        System.out.println("Trying to finalize " + this);
        if (--refCount != 0)
            System.out.println("Cannot finalize " + this);
        else System.out.println("Successfully finalized " + this);
    }
    public String toString() { return "Shared " + id; }
}
class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }
    protected void finalize() {
        System.out.println("Trying to finalize " + this + " which includes " + shared);		// Finalizing Composing
        shared.finalize();								//Calling finalize() for Shared class
    }
    public String toString() { return "Composing " + id; }
}


public class Ex13 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared) };
        for(Composing c : composing){
            c.dispose();
            c.finalize();
        }
    }
}
