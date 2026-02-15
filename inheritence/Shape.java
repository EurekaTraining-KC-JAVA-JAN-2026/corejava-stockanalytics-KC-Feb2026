package inheritence;

import java.math.BigDecimal;

//here we will don some operations on shapes
//show the contracts
//circle,rectangle,square
//interface are only to hold abstract type of methods, for our benefit it will have a default method(type regular)
public interface Shape {
    BigDecimal calculateArea();
    BigDecimal calculatePerimeter();
    BigDecimal calculateCircumference();

    default void geometry(){
        System.out.println("Printing Geometry");
    }
}