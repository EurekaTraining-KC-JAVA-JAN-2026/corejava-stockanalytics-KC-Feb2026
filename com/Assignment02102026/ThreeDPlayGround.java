package com.Assignment02102026;

import java.math.BigDecimal;

public class ThreeDPlayGround {
    public static void main(String[] args) {
        Cube cube1=new Cube(new BigDecimal(4));
        Cuboid cuboid1=new Cuboid(new BigDecimal(2),new BigDecimal(3),new BigDecimal(5));

        System.out.println("Volume of Cube: "+cube1.volume());
        System.out.println("Surface Area of Cube: "+cube1.surfaceArea());
        System.out.println("Volume of Cuboid: "+cuboid1.volume());
        System.out.println("Surface Area of Cuboid: "+cuboid1.surfaceArea());
        
    }
}
