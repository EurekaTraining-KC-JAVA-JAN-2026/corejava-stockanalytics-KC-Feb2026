package com.Assignment2;

import java.math.BigDecimal;

public class Cylinder implements Shape2D,Shape3D{

    BigDecimal radius;
    BigDecimal height;
    public Cylinder(BigDecimal radius, BigDecimal height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public BigDecimal calculateArea() {
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return radius.multiply(new BigDecimal(2)).multiply(new BigDecimal(Math.PI));
    }

    @Override
    public BigDecimal calculateSurfaceArea() {
        return radius.multiply(new BigDecimal(2)).multiply(new BigDecimal(Math.PI).multiply((radius.add(height))));
    }

    @Override
    public BigDecimal calculateVolume() {
        return radius.multiply(new BigDecimal(Math.PI)).multiply(radius).multiply(height);
    }
}
