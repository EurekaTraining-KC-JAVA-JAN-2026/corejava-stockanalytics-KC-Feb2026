package com.inheritance;

import java.math.BigDecimal;

public class Rectangle implements Shape {

    public BigDecimal length;
    public BigDecimal breadth;
    // constructor
    public Rectangle(BigDecimal length, BigDecimal breadth) {
        this.length = length;
        this.breadth = breadth;
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
    public void geometry() {
        System.out.println("This is a rectangle with length " + length + " and breadth " + breadth);
    }
}