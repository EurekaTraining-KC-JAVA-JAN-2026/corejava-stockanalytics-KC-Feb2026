package com.Assignment4;
import com.interfaces.Cube;
import com.interfaces.Cuboid;

import java.math.BigDecimal;

public class ShapesplayGround {
    public static void main(String[] args) {

        Cube cube1 = new Cube(new BigDecimal(20));
        Cuboid cuboid1 = new Cuboid(new BigDecimal(4),new BigDecimal(5),new BigDecimal(6));

        System.out.println(cube1.calculateVolume());
        System.out.println(cube1.calculateSurfaceArea());


        System.out.println(cuboid1.calculateVolume());
        System.out.println(cuboid1.calculateSurfaceArea());


    }

}
