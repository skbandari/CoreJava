package org.launchcode.z_questions;

import org.launchcode.k_multithreaded_programming.Test;

import java.io.Serializable;

class A implements Serializable {
    int a;
    transient  int b;

    A(){
        a = 3;
        b = 5;

    }

    void myMeth(){
        System.out.println("a and b are : " + a + " " + b);
    }
}

public class TransientDemo {
    public static void main(String[] args) {
        A ob = new A();
        System.out.println(ob instanceof A);
        ob.myMeth();
    }
}
