package Assignment.Assignment3;

import java.math.BigDecimal;

public class Shapes3DPlayGround {

    public static void main(String args[]) {

        Cube cube = new Cube(new BigDecimal(5));
        Cylinder cylinder = new Cylinder(new BigDecimal(10), new BigDecimal(20));

        System.out.println(cube.surfaceArea());
        System.out.println(cube.volume());

        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());


    }

}
