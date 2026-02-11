package com.assignmentInterface;

import java.math.BigDecimal;

import static java.lang.Math.PI;

public class Cylinder implements Shape3d{
    BigDecimal radius;
    BigDecimal height;

    public Cylinder(BigDecimal radius, BigDecimal height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public BigDecimal calculateSurfaceArea() {
        return radius.multiply(new BigDecimal(PI))
                .multiply(radius.add(height))
                .multiply(new BigDecimal(2));    }

    @Override
    public BigDecimal calculateVolume() {
        return radius.multiply(radius).multiply(height).multiply(new BigDecimal(PI));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return BigDecimal.ZERO;
    }
}
