package com.interfaceAssignment;

import java.math.BigDecimal;

public class Shape3dMain {
    public static void main(String[] args)
    {
        Cube cube1 = new Cube(new BigDecimal(3));

        Sphere sphere1 = new Sphere(new BigDecimal(1));

        System.out.println(cube1.volume());

        System.out.println(sphere1.volume());
    }
}
