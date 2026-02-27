package com.inheritance;

import java.math.BigDecimal;

public class Circle implements Shape {

    private BigDecimal radius;


    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateArea() {
        return radius.multiply(radius).multiply(BigDecimal.valueOf(Math.PI));

    }

    @Override
    public BigDecimal calculateCircumference() {
        return radius.multiply(BigDecimal.valueOf(2)).multiply(BigDecimal.valueOf(Math.PI));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }

}
