package chapter14.ex25;

import chapter14.ex25.diffpackage.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex25 {
    static void getHiddenMethod(Object objectVar, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = objectVar.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(objectVar);
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Sample newSample = new Sample();

        getHiddenMethod(newSample, "privateMethod");
        getHiddenMethod(newSample, "protectedMethod");
        getHiddenMethod(newSample, "packageMethod");
    }

}
