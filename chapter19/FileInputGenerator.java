package chapter19;

import chapter16.Generator;
import chapter18.TextFile;
import chapter19.ex3.Input;

import java.util.Iterator;

public class FileInputGenerator implements Generator<Input> {
    private Iterator<String> input;

    public FileInputGenerator(String fileName) {
        input = new TextFile(fileName, ";").iterator();
    }

    public Input next() {
        if (!input.hasNext())
            return null;
        return Enum.valueOf(Input.class, input.next().trim());
    }
}
