package org.launchcode.g_a_closer_look_at_methods_and_classes;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x is " + x);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }

    static {
        System.out.println("static block initialised");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
