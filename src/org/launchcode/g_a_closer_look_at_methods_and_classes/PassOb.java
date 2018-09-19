package org.launchcode.g_a_closer_look_at_methods_and_classes;

import java.util.Objects;

class Test {
    int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test ob) {
        if ((ob.a == a) && (ob.b == b)) {
            return true;
        } else {
            return false;
        }
    }
}
public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(1,3);
        Test ob2 = new Test(1,4);
        System.out.println("ob1 == ob2 -->" + ob1.equalTo(ob2));
    }
}
