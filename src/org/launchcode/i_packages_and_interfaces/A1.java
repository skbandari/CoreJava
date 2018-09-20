package org.launchcode.i_packages_and_interfaces;

public interface A1 {
    void meth1();
    void meth2();
}

 interface B1 extends  A1 {
    default void meth3(){
        System.out.println("meth3 default");
    }
}
