package com.company;

public abstract class Geometry {

double x ;
double y;
double couleur;
    abstract double area();
    // only for 3d geometry
    abstract double perimeter();
    abstract double volume();
    abstract void display();
    abstract double compareformeto();

}
