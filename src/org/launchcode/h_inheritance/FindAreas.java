package org.launchcode.h_inheritance;

class Figure {
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void area() {
        System.out.println("Area of the Figure is unknown ");
    }
}

class Rectangle extends Figure {

    Rectangle(double length, double breadth) {
        super(length, breadth);
    }


    @java.lang.Override
    public void area() {
        System.out.println("Area of the Rectangle is : " + dim1*dim2);
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    public void area() {
        System.out.println("Area of triangle is :" + dim1*dim2/2);
    }
}

public class FindAreas {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(20,30);
        rect.area();

        Triangle tri = new Triangle(39,32);
        tri.area();

    }

}
