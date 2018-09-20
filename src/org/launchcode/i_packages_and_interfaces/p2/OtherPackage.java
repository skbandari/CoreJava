package org.launchcode.i_packages_and_interfaces.p2;

import org.launchcode.i_packages_and_interfaces.p1.Protection;

import javax.print.attribute.standard.MediaSize;

public class OtherPackage {

    OtherPackage() {
        Protection p = new Protection();
        System.out.println("n = " + p.n_pub);
    }
}
