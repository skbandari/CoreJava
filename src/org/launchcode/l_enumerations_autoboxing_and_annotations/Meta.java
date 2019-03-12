package org.launchcode.l_enumerations_autoboxing_and_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface
MyAnnot{
    String str();
    int val();
}

public class Meta {
    @MyAnnot(str="Annotation Example", val = 100)
    public static void myMeth(String s, int i) throws Exception {

        Meta ob = new Meta();

        //obtain the annotation of this method and
        //display the value of the members
        try{
            //first get a class object that represents this class
            Class<?> c = ob.getClass();

            //Now get the method object that represents this method
            Method m = c.getMethod("myMeth", String.class, int.class);

            //Next, get the Annotation for this class
            MyAnnot anno = m.getAnnotation(MyAnnot.class);
            System.out.println(anno.str() + "---"+ anno.val());


        } catch(Exception e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        try{
            myMeth("test", 2);
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}
