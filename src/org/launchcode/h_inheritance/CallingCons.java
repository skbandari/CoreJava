package org.launchcode.h_inheritance;

class A1 {
    A1() {
        System.out.println("Calling Constructor of Class A1");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("Calling Constructor of Class B1");
    }
}

class C1 extends B1{
    C1() {
        System.out.println("Calling Constructor of Class C1");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C1 ob = new C1();
    }
}
