package Assignment;

import java.math.BigDecimal;

public class ThreeDPlayGround {
    static void main() {
        Cube cube1 = new Cube(new BigDecimal(6));
        Cuboid cuboid1 = new Cuboid(new BigDecimal(6),new BigDecimal(3),new BigDecimal(9));

        System.out.println(cube1.volume());
        System.out.println(cuboid1.volume());
        System.out.println(cube1.surfaceArea());
        System.out.println(cuboid1.surfaceArea());
    }

}