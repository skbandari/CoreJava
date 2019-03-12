package org.launchcode.l_enumerations_autoboxing_and_annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface
MyAnnotation1{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface
MyAnnotation2{
    boolean bool();
    double doub();
}

public class Meta2 {
    @MyAnnotation1(str = "My annotation", val = 100)
    @MyAnnotation2(bool = true, doub = 2)
    public static void myMeth2() throws Exception{
        Meta2 ob  = new Meta2();
        Class<?> c = Meta2.class;

        Method m = c.getMethod("myMeth2");
//        boolean b = c.isAnnotationPresent((Class<? extends Annotation>) c);

        Annotation o[] = c.getDeclaredAnnotations();

        Annotation annos[]= m.getAnnotations();
        for(Annotation a : annos){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        try{
            myMeth2();
        } catch(Exception e) {
            System.out.println(e);

        }

    }
}
