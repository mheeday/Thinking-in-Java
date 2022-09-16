package chapter9.ex6;

interface SampleInterface {
    void mustBePublic();
}

public class Ex6 implements SampleInterface{
    public void mustBePublic () {}
    //Throw error when you remove the public modifier
}
