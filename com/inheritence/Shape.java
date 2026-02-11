package com.inheritence;

import java.math.BigDecimal;

//here we will do some operation on shapes
//circle, rectangle,square
//interface are only hold abstract type of method, for our benifit it will have default method (type regular)
public interface Shape {
    BigDecimal calculateArea();
    BigDecimal calculatePerimeter();
    BigDecimal calculateCircumference();

     default void geometry(){
         System.out.println("Printing Geometry");
     }
}
