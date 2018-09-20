package org.launchcode.i_packages_and_interfaces;

public class C1 implements B1 {
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");

    }


    @Override
    public void meth3() {

    }
    public static void main(String[] args) {
        C1 t = new C1();
        t.meth1();
        t.meth2();
        t.meth3();
    }

}
