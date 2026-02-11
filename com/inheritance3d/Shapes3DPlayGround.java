package com.inheritance3d;

import java.math.BigDecimal;

public class Shapes3DPlayGround {
    public static void main(String[] args) {
        Cube cube = new Cube(new BigDecimal(4));
        Sphere sphere = new Sphere(new BigDecimal(3));

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());
    }
}