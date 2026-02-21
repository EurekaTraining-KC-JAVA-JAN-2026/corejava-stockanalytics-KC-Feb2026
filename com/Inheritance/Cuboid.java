package com.Inheritance;

import java.math.BigDecimal;

public class Cuboid implements Shape {
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;

    public Cuboid(BigDecimal length, BigDecimal width, BigDecimal height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal calculateArea() {
        return height.multiply(new BigDecimal(2)).multiply(length.multiply(width));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }

    @Override
    public void geometry() {
        Shape.super.geometry();
        System.out.println("This is the Cuboid");
    }

    @Override
    public BigDecimal calculateCircumferenec() {
        return (new BigDecimal(4)).multiply(length.add(width).add(height));
    }
}
