package com.interfaces;

import java.math.BigDecimal;

public class ThreeDimensionalPlayGround {
    public static void main(String[] args) {
        Sphere s = new Sphere(new BigDecimal(8));
        Cube cub = new Cube(new BigDecimal(10));
        Cylinder cyl = new Cylinder(new BigDecimal(4), new BigDecimal(9));


        System.out.println("Printing Value of sphere");
        System.out.println("Surface Area of sphere is "+" "+ s.surfaceArea());
        System.out.println("Volume of sphere is"+" "+ s.volume());

        System.out.println("Printing Value of Cube");
        System.out.println("Surface Area of Cube is "+" "+ cub.surfaceArea());
        System.out.println("Volume of Cube is "+" "+ cub.volume());


        System.out.println("Printing Value of Cylinder");
        System.out.println("Surface Area of Cylinder"+" "+ cyl.surfaceArea());
        System.out.println("Volume of Cylinder "+" "+ cyl.volume());
    }

}

