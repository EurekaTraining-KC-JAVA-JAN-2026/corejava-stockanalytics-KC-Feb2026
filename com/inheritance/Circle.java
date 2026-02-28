package com.inheritance;

import java.math.BigDecimal;

public class Circle implements Shape {
    private BigDecimal radius;
    public Circle(BigDecimal radius) {

        this.radius=radius;
    }
    public static boolean CalculateCircumference() {

        return false;
    }
    @Override
    public BigDecimal calArea(){

        return radius.multiply(radius).multiply(new BigDecimal(Math.PI));
    }


    @Override
    public BigDecimal calculatePerimeter() {

        return null;
    }

    @Override
    public BigDecimal calCircumference() {

        return null;
    }
}
