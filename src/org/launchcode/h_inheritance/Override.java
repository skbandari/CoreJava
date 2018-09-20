package org.launchcode.h_inheritance;
import java.lang.*;
class A2 {
    private int i;
    private int j;

    A2(int i, int j) {
        this.i = i;
        this.j= j;
    }

    A2 (){
        i = j = -1;
    }

    void show(){
        System.out.println("i and j are : " + i + " "+ j);
    }
}

class B2 extends A2 {
    int k;
    B2(){
        super();
        k = -1;
    }

    B2(int i, int j, int k) {
        super(i,j);
        this.k = k;
    }

    @java.lang.Override
    void show() {
        super.show();
        System.out.println("k is " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B2 ob = new B2();
        ob.show();
        ob.k= 199;
        ob.show();
    }
}
