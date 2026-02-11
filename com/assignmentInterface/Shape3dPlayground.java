package com.assignmentInterface;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class Shape3dPlayground {
    public static void main(String[] args) {
        Cube cube = new Cube(new BigDecimal(5));
        Cuboid cuboid = new Cuboid(new BigDecimal(10),new BigDecimal(15), new BigDecimal(20));
        Cylinder cylinder = new Cylinder(new BigDecimal(5), new BigDecimal(10));
        System.out.println("Cube");
        System.out.println("Perimeter " + cube.calculatePerimeter());
        System.out.println("Surface Area "+ cube.calculateSurfaceArea());
        System.out.println("Volume "+ cube.calculateVolume());

        System.out.println("Cuboid");
        System.out.println("Perimeter " + cuboid.calculatePerimeter());
        System.out.println("Surface Area "+ cuboid.calculateSurfaceArea());
        System.out.println("Volume "+ cuboid.calculateVolume());


        System.out.println("Cylinder");
        System.out.println("Perimeter " + cylinder.calculatePerimeter());
        System.out.println("Surface Area "+ cylinder.calculateSurfaceArea());
        System.out.println("Volume "+ cylinder.calculateVolume());
    }




}
