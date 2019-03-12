package org.launchcode.n_generics;

class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    public Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob = new NonGen(80);
        int i =  (Integer) iob.getOb();
        System.out.println(i);
        iob.showType();

        NonGen strOb = new NonGen("Test");
        String s = (String) strOb.getOb();
        System.out.println(s);
        strOb.showType();
    }
}
