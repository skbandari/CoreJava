package org.launchcode.h_inheritance;

class A {
    private int i;
    int j;

    void setij(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
class B extends  A {
    int total;

    void sum() {
//        total  = i+j;
    }

}
public class Access {
    public static void main(String[] args) {
        B ob = new B();
        ob.setij(10, 30);

    }
}
