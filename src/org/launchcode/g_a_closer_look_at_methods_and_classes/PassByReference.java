package org.launchcode.g_a_closer_look_at_methods_and_classes;

class Test2 {
    int i, j;
    void meth (Test2 ob){
        ob.i *= 2;
        ob.j /= 2;
    }
}
public class PassByReference {
    public static void main(String[] args) {
        int i , j;
        i=10; j=20;
        Test2 ob = new Test2();
        ob.i = i; ob.j = j;
        System.out.println("i and j are : " + ob.i + " " + ob.j);
        ob.meth(ob);
        System.out.println("i and j are : " + ob.i + " " + ob.j);
    }
}
