package com.inheritence;

import java.math.BigDecimal;

public class Rectangle implements com.inheritence.Shape {
    public BigDecimal length;
    public BigDecimal breadth;

    public Rectangle(BigDecimal breadth, BigDecimal length) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public BigDecimal calculateArea() {
        return length.multiply(breadth);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return length.add(breadth).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal calculateCircumferenec() {
        return null;
    }
}