package org.launchcode.g_a_closer_look_at_methods_and_classes;

class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
public class PassByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int i, j;
        i=10; j =20;
        System.out.println("i and j are : " + i + " " + j );
        ob.meth(i, j);
        System.out.println("i and j are : " + i + " " + j );


    }
}
