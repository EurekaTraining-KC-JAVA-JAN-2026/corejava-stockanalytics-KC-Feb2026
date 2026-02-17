package com.inheritanceAssignment;

import java.math.BigDecimal;

public class Shape3dMain {
    public static void main(String[] args)
    {
        Cube cube1 = new Cube(new BigDecimal(3));

        Sphere sphere1 = new Sphere(new BigDecimal(1));

        System.out.println(cube1.volume());

        System.out.println(sphere1.volume());
        cube1.setEdge(new BigDecimal(4));
        System.out.println(cube1.volume());
        System.out.println(cube1.density());
        System.out.println(cube1.density(new BigDecimal(2)));

        System.out.println(sphere1.density());
        System.out.println(sphere1.density(new BigDecimal(3)));
    }
}
