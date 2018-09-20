package org.launchcode.h_inheritance;

final class Finalclass {
    final int x;

    Finalclass(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Value of local variable is :" + x);
    }

}
public class FinalDemo {
    public static void main(String[] args) {
        Finalclass ob = new Finalclass(10);
        ob.display();



        System.out.println(ob.hashCode());
        System.out.println(ob.toString());


    }

}
