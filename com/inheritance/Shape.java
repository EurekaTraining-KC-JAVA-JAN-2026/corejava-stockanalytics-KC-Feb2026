package com.inheritance;

import java.math.BigDecimal;

public interface Shape {

    // Abstract methods (no body)
    BigDecimal calculateArea();
    BigDecimal calculatePerimeter();
    // Default method with body
    default void geometry() {
        System.out.println("This is a generic shape geometry");
    }
}