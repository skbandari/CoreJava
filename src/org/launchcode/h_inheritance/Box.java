package org.launchcode.h_inheritance;

public class Box {
    private double width;
    private double height;
    double depth;

    Box() {
        width = height = depth = -1;
    }

    Box(double width, double height , double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box( double len) {
        width = height = depth = len;
    }

    double volume(){
        return  width*height*depth;
    }

}
