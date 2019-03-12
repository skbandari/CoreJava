package org.launchcode.l_enumerations_autoboxing_and_annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface
Myannotation3 {
    String str() default "teat";
    boolean bool() default  true;
}

public class Meta3 {

    @Myannotation3
    public static void mymeth4() throws Exception{

        Class<?> c = Meta3.class;
        Method m = c.getMethod("mymeth4");
        Annotation a[] = m.getAnnotations();
        for(Annotation b : a)
            System.out.println(b);
    }

    public static void main(String[] args) {
        try{
            mymeth4();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
