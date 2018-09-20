package org.launchcode.h_inheritance;

abstract class Figure1 {
    double dim1, dim2;

    Figure1(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class Rectangle1 extends Figure1 {

    Rectangle1(double a, double b){
        super(a,b);

    }

    void display(){
        System.out.println();
    }

    void area () {
        System.out.println("Area of Rectangle is " + dim1*dim2);
    }
}

class Triangle1 extends Figure1 {

    Triangle1(double b, double h) {
        super(b, h);
    }

    void area() {
        System.out.println("Area of Triangle is " + dim1*dim2/2);
    }
}
public class AbstractAreas {
    public static void main(String[] args) {

        Rectangle1 rect = new Rectangle1(10,20);
        Triangle1 tri = new Triangle1(123,34);
        Figure1 fig;
        fig = rect;
        fig.area();
        fig = tri;
        fig.area();

    }
}
