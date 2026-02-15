package com.inheritance;

public class Cuboid implements Shape3D {

    double length = 8;
    double breadth = 3;
    double height = 5;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Cuboid() {

    }

    @Override
    public double volume() {
             return length*breadth*height;
    }

    @Override
    public double surfaceArea() {
        return 2* (length*breadth + breadth*height + height*length);
    }
}
