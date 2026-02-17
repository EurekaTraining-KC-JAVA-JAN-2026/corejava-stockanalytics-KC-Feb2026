package com.MultipleInheritance;

import java.math.BigDecimal;

public class Shapes3DPlayGround {
    public static void main(String[] args){
        Cuboid cuboid1 = new Cuboid(new BigDecimal(5),new BigDecimal(10),new BigDecimal(5));
        System.out.println("Volume of cuboid is " +cuboid1.calculateVolume());
        System.out.println("Measurements for cuboid" +cuboid1.getDetails());
        Sphere sphere1 = new Sphere(new BigDecimal(5));
        System.out.println("Circumference of Sphere is " +sphere1.calculateCircumference());
        System.out.println("Measurements for Sphere" +sphere1.getDetails());

    }
}
