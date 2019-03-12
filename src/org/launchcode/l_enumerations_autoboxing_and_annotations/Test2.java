package org.launchcode.l_enumerations_autoboxing_and_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.Class;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@MyAnno(str ="test",val = 3)
public class Test2 {

   static void mymeth(){
        System.out.println();
    }
    @MyAnno(str ="test",val = 3)
    public static void main(String[] args) {
        Test2 ob = new Test2();
        Class<?> c = ob.getClass();
        try {
            Method m = c.getMethod("mymeth");
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }
    }
}
