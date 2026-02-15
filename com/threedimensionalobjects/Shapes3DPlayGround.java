package com.threedimensionalobjects;

import java.math.BigDecimal;

public class Shapes3DPlayGround {
    public static void main(String[] args){
        Cuboid cuboid1 = new Cuboid(new BigDecimal(5),new BigDecimal(10),new BigDecimal(5));
        System.out.println("Volume of cuboid is " +cuboid1.calculateVolume());
        Sphere sphere1 = new Sphere(new BigDecimal(5));
        System.out.println("Cicumference of Sphere is " +sphere1.calculateCircumference());


    }
}
