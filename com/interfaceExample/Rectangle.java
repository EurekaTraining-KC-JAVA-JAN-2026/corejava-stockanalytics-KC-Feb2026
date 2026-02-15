package com.interfaceExample;

import java.math.BigDecimal;

public class Rectangle implements Shape{

    public Rectangle(BigDecimal length, BigDecimal breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public BigDecimal length;
    public BigDecimal breadth;

    @Override
    public BigDecimal calculateArea() {
        return length.multiply(breadth);
    }

    @Override
    public BigDecimal calculateCircumference() {
        return null;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return (length.add(breadth)).multiply(new BigDecimal(2));
    }
}
