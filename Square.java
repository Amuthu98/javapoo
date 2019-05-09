package com.company;

import static java.lang.Math.pow;

public class Carre extends Rectangle {
    public Carre(double x, double y, double largeur, double hauteur) {
        super(x, y, largeur, hauteur);
    }

    @Override
    double area() {
        return pow(largeur,2.0);
    }

    @Override
    double perimeter() {
        return super.perimeter();
    }


}
