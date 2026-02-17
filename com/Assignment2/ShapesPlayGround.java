package com.Assignment2;

import java.math.BigDecimal;

public class ShapesPlayGround {
    public static void main(String[] args) {
        Cube cube1 = new Cube(new BigDecimal(5));
        //Cylinder cylinder1 = new Cylinder(new BigDecimal(3), new BigDecimal(4));
        System.out.println("---- Cube ----");
        System.out.println("Area: " + cube1.calculateArea());
        System.out.println("Perimeter: " + cube1.calculatePerimeter());
        //System.out.println("Surface Area: " + cube1.calculateSurfaceArea());
        //System.out.println("Volume: " + cube1.calculateVolume());

        System.out.println();

        System.out.println("---- Cylinder ----");
        // System.out.println("Area: " + cylinder1.calculateArea());
        //System.out.println("Perimeter: " + cylinder1.calculatePerimeter());
        //System.out.println("Surface Area: " + cylinder1.calculateSurfaceArea());
        //System.out.println("Volume: " + cylinder1.calculateVolume());
    }
}
