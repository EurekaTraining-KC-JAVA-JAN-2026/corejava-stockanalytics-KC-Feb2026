package Assignment_inheritance;

import java.math.BigDecimal;

public class ShapesPlayGround {
    static void main(String[] args) {
        Cylinder cylinder1= new Cylinder(BigDecimal.valueOf(2), BigDecimal.valueOf(5));
        System.out.println("surface area of cylinder:"+ cylinder1.surfaceArea());
        System.out.println("volume of a cylinder:"+cylinder1.volume());
    }
}
