package org.launchcode.l_enumerations_autoboxing_and_annotations;

public class Autobox2 {

   static Integer m(Integer iOb){
        return iOb;
    }

    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(10);
        System.out.println(m(iOb));
//        m(iOb);
    }
}
