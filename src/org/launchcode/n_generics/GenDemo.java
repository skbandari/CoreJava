package org.launchcode.n_generics;

class Gen<T>{
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(90);
        Gen<String> strOb = new Gen<>("Test");

        int i = iOb.getOb();
        String s = strOb.getOb();

        System.out.println(i);
        System.out.println(s);
        iOb.showType();
        strOb.showType();


    }
}
