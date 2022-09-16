package chapter19;

import chapter16.Generator;
import chapter19.ex3.Input;

public class RandomInputGenerator implements Generator<Input> {
    public Input next() { return Input.randomSelection(); }
}
