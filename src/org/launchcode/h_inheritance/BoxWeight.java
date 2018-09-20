package org.launchcode.h_inheritance;

class BoxWeight extends Box {

    double weight;

    BoxWeight(double weight) {
        this.weight= weight;
    }
    BoxWeight(double weight, double width, double length, double depth) {

        super(width,depth,length);
        this.weight = weight;
    }
}

