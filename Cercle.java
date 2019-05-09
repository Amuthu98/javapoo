package com.company;

public class Cercle extends Ellipsis {


    public Cercle(String nom, double x, double y, double a, double b, double r) {
        super(nom, x, y, a, b, r);
    }

    @Override
    double area() {
        return Math.PI*r;
    }

    @Override
    double perimeter() {
        return Math.PI*(2*r);
    }
}
