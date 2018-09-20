package org.launchcode.i_packages_and_interfaces;

public class B implements A.NestedIf {
    @Override
    public boolean isNegative(int x) {
      return   (x < 0) ?  true :  false;
    }
}
