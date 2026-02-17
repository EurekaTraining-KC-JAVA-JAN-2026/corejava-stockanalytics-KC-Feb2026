package com.InheritanceAssignment;

import java.math.BigDecimal;

public class Shape3dPlayground {

    public static void main(String[] args) {

        Cube cube = new Cube(new BigDecimal("5"));

        Cuboid cuboid = new Cuboid(
                new BigDecimal("10"),
                new BigDecimal("15"),
                new BigDecimal("20")
        );

        Sphere sphere = new Sphere(new BigDecimal("7"));

        System.out.println("Cube");
        System.out.println("Perimeter " + cube.calculatePerimeter());
        System.out.println("Surface Area " + cube.calculateSurfaceArea());
        System.out.println("Volume " + cube.calculateVolume());

        System.out.println();

        System.out.println("Cuboid");
        System.out.println("Perimeter " + cuboid.calculatePerimeter());
        System.out.println("Surface Area " + cuboid.calculateSurfaceArea());
        System.out.println("Volume " + cuboid.calculateVolume());

        System.out.println();

        System.out.println("Sphere");
        System.out.println("Perimeter " + sphere.calculatePerimeter());
        System.out.println("Surface Area " + sphere.calculateSurfaceArea());
        System.out.println("Volume " + sphere.calculateVolume());
    }
}
