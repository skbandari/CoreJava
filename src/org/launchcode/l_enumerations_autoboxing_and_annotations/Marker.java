package org.launchcode.l_enumerations_autoboxing_and_annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Write a class to demonstrate marker interface and the use of IsAnnotationPresent method
 */

@Retention(RetentionPolicy.RUNTIME)
@interface
MyMarker{}


@Retention(RetentionPolicy.RUNTIME)
@interface
MyMarker2{
    int val();
}

public class Marker {

    @MyMarker2(val=2)

    @MyMarker
    public static void myMethod() throws Exception{
        Marker ob = new Marker();
        Class<?> c = ob.getClass();

        Method m = c.getMethod("myMethod");
        if(m.isAnnotationPresent(MyMarker.class))
            System.out.println("Annotation is present :" + m.getAnnotation(MyMarker.class));

    }

    public static void main(String[] args) {
        try{
            myMethod();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
