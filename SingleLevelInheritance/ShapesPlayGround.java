package SingleLevelInheritance;

import java.math.BigDecimal;

public class ShapesPlayGround {

    public static void main(String[] args) {

        Sphere sphere = new Sphere(BigDecimal.valueOf(5));
        System.out.println("Surface Area: " + sphere.surfaceArea());
        System.out.println("Volume: " + sphere.volume());
    }
}

