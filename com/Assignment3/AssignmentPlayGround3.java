package com.Assignment3;

import java.math.BigDecimal;

public class AssignmentPlayGround3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(new BigDecimal(5));
        Cylinder cylinder1 = new Cylinder(new BigDecimal(5),new BigDecimal(10));
        System.out.println(cube1.displayShapeName());
        System.out.println("Surface Area: " + cube1.calculateSurfaceArea());
        System.out.println("Volume: " + cube1.calculateVolume());
        System.out.println(cylinder1.displayShapeName());
        System.out.println("Surface Area: " + cylinder1.calculateSurfaceArea());
        System.out.println("Volume: " + cylinder1.calculateVolume());
    }
}
