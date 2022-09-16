package chapter20;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
    @Override
    public AnnotationProcessor getProcessorFor( Set<AnnotationTypeDeclaration> atds, AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }
    public Collection<String> supportedAnnotationTypes() {
        return
                Collections.singleton("annotations.ExtractInterface");
    }
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }

}
