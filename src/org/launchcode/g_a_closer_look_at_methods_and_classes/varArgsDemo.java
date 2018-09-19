package org.launchcode.g_a_closer_look_at_methods_and_classes;

public class varArgsDemo {
    static void varArgsTest(String msg, int ... v) {
        System.out.print(msg + " contents: ");
        for(int i=0; i< v.length; i++)
            System.out.print(v[i] + ", ");

        System.out.println();
    }

    static void varArgsTest(String msg, boolean ... b) {
        System.out.print(msg + " contents: ");
        for(int i=0; i< b.length; i++)
            System.out.print(b[i] + ", ");

        System.out.println();
    }


    public static void main(String[] args) {
        varArgsTest("one argument", 1);
        varArgsTest("Three Arguments", 12,34,54);
        varArgsTest("Boolean", true, false, true,true);
    }
}
