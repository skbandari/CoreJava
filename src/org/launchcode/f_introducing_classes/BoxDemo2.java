package org.launchcode.f_introducing_classes;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol1, vol2;
        //Details of Box 1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        //Details of Box 2
        myBox2.width = 100;
        myBox2.height = 200;
        myBox2.depth = 150;

        vol1 = myBox1.width*myBox1.depth*myBox1.height;
        vol2 = myBox2.width*myBox2.depth*myBox2.height;

        System.out.println("Volume of Box 1 is " + vol1);
        System.out.println("Volume of Box 2 is " + vol2);


    }
}
