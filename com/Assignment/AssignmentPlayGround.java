package com.Assignment;

import java.math.BigDecimal;

public class AssignmentPlayGround {
    public static void main(String[] args) {

        Cube cube1 = new Cube(new BigDecimal(5));
        Cuboid cuboid1 = new Cuboid(new BigDecimal(4),new BigDecimal(3),new BigDecimal(2));
        Cylinder cylinder1 = new Cylinder(new BigDecimal(10),new BigDecimal(12));
        System.out.println("Cube");
        System.out.println("Surface Area "+ cube1.calculateSurfaceArea());
        System.out.println("Volume "+ cube1.calculateVolume());

        System.out.println("Cuboid");
        System.out.println("Surface Area "+ cuboid1.calculateSurfaceArea());
        System.out.println("Volume "+ cuboid1.calculateVolume());


        System.out.println("Cylinder");
        System.out.println("Surface Area "+ cylinder1.calculateSurfaceArea());
        System.out.println("Volume "+ cylinder1.calculateVolume());
    }
}
