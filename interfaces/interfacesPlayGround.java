package interfaces;
import java.math.BigDecimal;

public class interfacesPlayGround {
    public static void main(String[] args) {

        Cube cube = new Cube(new BigDecimal(10));
        Cuboid cuboid = new Cuboid(new BigDecimal(5),new BigDecimal(6), new BigDecimal(7));
        Cylinder cylinder = new Cylinder(new BigDecimal(4), new BigDecimal(9));


        System.out.println("Printing Value of Cube");
        System.out.println("Perimeter of cube is" +" "+ cube.perimeter());
        System.out.println("Surface Area of cube is "+" "+ cube.surfaceArea());
        System.out.println("Volume of cube is"+" "+ cube.volume());

        System.out.println("Printing Value of Cuboid");
        System.out.println("Perimeter of Cuboid is" +" "+ cuboid.perimeter());
        System.out.println("Surface Area of Cuboid is "+" "+ cuboid.surfaceArea());
        System.out.println("Volume of Cuboid is "+" "+ cuboid.volume());


        System.out.println("Printing Value of Cylinder");
        System.out.println("Perimeter of Cylinder is: " +" "+ cylinder.perimeter());
        System.out.println("Surface Area of Cylinder"+" "+ cylinder.surfaceArea());
        System.out.println("Volume of Cylinder "+" "+ cylinder.volume());
    }
}
