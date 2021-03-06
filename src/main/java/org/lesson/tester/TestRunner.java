package org.lesson.tester;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public void run(Class<?> clazz) throws Exception {
        final Constructor<?> constructor = clazz.getConstructor();
        final Object object = constructor.newInstance();
        final Method[] methods = clazz.getDeclaredMethods();
        List<Method> testMethods = getMethodsByAnnotation(Test.class, methods);
        List<Method> beforeMethods = getMethodsByAnnotation(Before.class, methods);
        List<Method> afterMethods = getMethodsByAnnotation(After.class, methods);
        List<Method> afterAllMethods = getMethodsByAnnotation(AfterAll.class, methods);
        List<Method> beforeAllMethods = getMethodsByAnnotation(BeforeAll.class, methods);
        for (Method beforeAllMethod : beforeAllMethods) {
            beforeAllMethod.invoke(object);
        }
        for (Method testMethod : testMethods) {
            for (Method beforeMethod : beforeMethods) {
                beforeMethod.invoke(object);
            }
            testMethod.invoke(object);
            for (Method afterMethod : afterMethods) {
                afterMethod.invoke(object);
            }
        }
        for (Method afterAllMethod : afterAllMethods) {
            afterAllMethod.invoke(object);
        }


    }

    private List<Method> getMethodsByAnnotation(Class<? extends Annotation> annotation, Method[] methods) {
        final List<Method> tempMethods = new ArrayList<Method>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(annotation)) {
                tempMethods.add(method);
            }
        }
        return tempMethods;
    }
}
