package com.inheritance;

import java.math.BigDecimal;

public interface Shape {
       BigDecimal calArea();
        BigDecimal calculatePerimeter();
        BigDecimal calCircumference();
        default void geometry(){

            System.out.println("primating geometry");
        }

    }

