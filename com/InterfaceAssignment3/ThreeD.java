package com.InterfaceAssignment3;

import java.math.BigDecimal;

public class ThreeD {
    public static void main(String[] args) {

        Cone cone1 = new Cone(new BigDecimal(1),new BigDecimal(1),new BigDecimal(1));

        Cube cube1 = new Cube(new BigDecimal(1));

        System.out.println(cone1.Volume());

        System.out.println(cone1.LateralSurfaceArea());
        System.out.println(cube1.Volume());

        System.out.println(cube1.SurfaceArea());
    }
}
