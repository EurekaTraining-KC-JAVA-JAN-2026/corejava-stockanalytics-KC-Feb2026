package com.inheritance;

import java.math.BigDecimal;
//Interface only holds abstract type of methods
public interface Shape {

BigDecimal calculateArea();
BigDecimal calculatePerimeter();
BigDecimal calculateCircumference();

default void geometry() {
    System.out.println("Printing Geometry");
}

}
