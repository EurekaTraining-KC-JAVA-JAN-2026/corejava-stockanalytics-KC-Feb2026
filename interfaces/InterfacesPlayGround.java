package interfaces;

import java.math.BigDecimal;

public class InterfacesPlayGround {

    public static void main(String[] args) {

        Shapes3D shapeOne = new Cube(new BigDecimal("8"));

        Shapes3D shapeTwo = new Cuboid(
                new BigDecimal("3"),
                new BigDecimal("9"),
                new BigDecimal("2")
        );

        Shapes3D shapeThree = new Cylinder(
                new BigDecimal("5"),
                new BigDecimal("11")
        );

        System.out.println("---- Cube ----");
        printDetails(shapeOne);

        System.out.println("---- Cuboid ----");
        printDetails(shapeTwo);

        System.out.println("---- Cylinder ----");
        printDetails(shapeThree);
    }

    public static void printDetails(Shapes3D shape) {
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Surface Area: " + shape.surfaceArea());
        System.out.println("Volume: " + shape.volume());
        System.out.println();
    }
}
