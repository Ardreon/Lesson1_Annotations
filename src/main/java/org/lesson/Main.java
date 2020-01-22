package org.lesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //final A a = new A();
        final Class<A> aClass = A.class;
        final Constructor<A> constructor = aClass.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        final A a = constructor.newInstance(1);
        //a.method();
        final Method method = aClass.getDeclaredMethod("method");
        method.setAccessible(true);
        final Object invoke = method.invoke(a);
        System.out.println(invoke);
        //A.staticMethod();
    }
}


class A{
    private A(int i){
        System.out.println("1");
    }

    private void method(){
        System.out.println("Non-static method ");
    }


    private static void staticMethod(){
        System.out.println("static method ");
    }

}