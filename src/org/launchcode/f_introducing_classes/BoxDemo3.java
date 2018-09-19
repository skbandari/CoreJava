package org.launchcode.f_introducing_classes;

class BoxTest {
    double length, width, depth;

    BoxTest(double length, double width, double depth) {
        length = length;
        width = width;
        depth = depth;

    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        BoxTest ob = new BoxTest(10,20,30);
        System.out.println(ob.length);
        System.out.println(ob.width);
        System.out.println(ob.depth);
    }
}
