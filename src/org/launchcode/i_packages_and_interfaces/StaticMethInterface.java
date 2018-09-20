package org.launchcode.i_packages_and_interfaces;

public interface StaticMethInterface {
    void meth1();
    default void meth2() {
        System.out.println("meth2");
    }
    static int staticMeth(int x){
        return x*10;
    }


}

class A3 implements StaticMethInterface{
    @Override
    public void meth1() {
        System.out.println(StaticMethInterface.staticMeth(39));
    }

    @Override
    public void meth2() {
        System.out.println("meth2");

    }
}

class A4 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.meth1();
    }
}