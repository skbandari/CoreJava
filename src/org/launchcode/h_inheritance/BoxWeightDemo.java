package org.launchcode.h_inheritance;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight ob = new BoxWeight(10,20,40,34);

        System.out.println(ob.volume());

        Box ob2 = ob;
        System.out.println(((BoxWeight) ob2).weight);
    }
}
