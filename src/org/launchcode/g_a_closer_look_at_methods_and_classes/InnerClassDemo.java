package org.launchcode.g_a_closer_look_at_methods_and_classes;

class Outer {
    int outer_x = 100;

    void test () {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        void display() {
            System.out.println("outer x value is " + outer_x);
        }

    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer ob = new Outer();
        ob.test();
    }
}
