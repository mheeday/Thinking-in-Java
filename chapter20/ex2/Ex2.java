package chapter20.ex2;

import chapter20.ExtractInterface;
import chapter20.InterfaceExtractorProcessor;
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

import java.util.*;
import java.util.Set;

public class Ex2 implements AnnotationProcessorFactory {
    public AnnotationProcessor getProcessorFor(
            Set<AnnotationTypeDeclaration> atds,
            AnnotationProcessorEnvironment env) {return new InterfaceExtractorProcessor(env);
    }
    public Collection<String> supportedAnnotationTypes() {
        return
                Collections.singleton("annotations.ExtractInterface");
    }
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }
}
@ExtractInterface("IDivisor")
class Divisor {
    public int divide(int x, int y) {
        int total = 0;
        while(x >= y) {
            x = sub(x, y);
            total++;
        }
        return total;
    }
    private int sub(int x, int y) { return x - y; }
    public static void main(String[] args) {
        System.out.println(
                "13000/100 = " + new Divisor().divide(13000, 100));
    }
}
