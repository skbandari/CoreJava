package org.launchcode.f_introducing_classes;

public class BoxDemo {
    public static void main(String[] args) {
        double vol;

        Box myBox = new Box();
        myBox.width = 10;
        myBox.depth = 20;
        myBox.height = 30;

        vol = myBox.depth*myBox.height*myBox.width;

        System.out.println("Volume of the box is " + vol);

    }
}
