package inheritence;

import  java.math.BigDecimal;

//here we will do some operations on shapes
//circle,rectangle,square
//
public interface Shape {
    BigDecimal calculateArea();
    BigDecimal calculatePerimeter();
    BigDecimal calculateCircumference();

    default void geometry(){
        System.out.println("Printing Geometry");
    }
}
