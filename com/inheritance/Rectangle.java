package com.inheritance;

import java.math.BigDecimal;

public class Rectangle implements Shape{
    public BigDecimal length;
    public BigDecimal breadth;

    public Rectangle(BigDecimal length, BigDecimal breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public BigDecimal calculateArea() {
        return length.multiply(breadth);
    }

    @Override
    public BigDecimal calculateCircumference() {
        return length.add(breadth).multiply(new BigDecimal("2"));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }
}
