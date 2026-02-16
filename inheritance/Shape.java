package inheritance;

import java.math.BigDecimal;

//here we will do  some operations on shapes
//circle, rectangle, square
// show the constracts
// interfaces are only to hold abstarct type of methods, for our benefit it will have a default method (type regular

public interface Shape {
    BigDecimal calculateArea();
    BigDecimal calculatePerimeter();
    BigDecimal calculateCircumference();

    default void geometry(){
        System.out.println("printing Geometry");
    }

    BigDecimal CubiodTotalSurafaceArea();
    BigDecimal CuboidVolume();
}
