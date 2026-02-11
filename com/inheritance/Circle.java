package com.inheritance;

import java.math.BigDecimal;

public class Circle implements Shape {

    public BigDecimal radius;

    // Constructor
    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateArea() {
        BigDecimal pi = new BigDecimal("3.14159");
        return pi.multiply(radius.multiply(radius));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        BigDecimal pi = new BigDecimal("3.14159");
        return pi.multiply(radius).multiply(new BigDecimal(2));
    }

    @Override
    public void geometry() {
        System.out.println("This is a circle with radius " + radius);
    }
}