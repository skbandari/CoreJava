package org.launchcode.i_packages_and_interfaces.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("n = " + p.n);
        System.out.println("n_pub =  "+ p.n_pub);
        System.out.println("n_pro =  "+ p.n_pro);
    }
}
