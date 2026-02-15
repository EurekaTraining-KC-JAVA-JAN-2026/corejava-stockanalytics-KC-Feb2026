package com.interfaceExample;

import java.math.BigDecimal;

public interface Shape {
    BigDecimal calculateArea();
    BigDecimal calculatePerimeter();
    BigDecimal calculateCircumference();

    default void geometry(){
        System.out.println("printing geometry");
    }
}
