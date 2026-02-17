package com.AssignmentsInterface;

import java.math.BigDecimal;

public class Cylinder implements Shapes3D, Measurable {

    private BigDecimal height;
    private BigDecimal radius;

    private static final BigDecimal PI = BigDecimal.valueOf(Math.PI);

    public Cylinder(BigDecimal height, BigDecimal radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public BigDecimal volume() {
        return PI.multiply(radius)
                .multiply(radius)
                .multiply(height);
    }

    @Override
    public BigDecimal surfaceArea() {
        return BigDecimal.valueOf(2).multiply(PI).multiply(radius).multiply(radius.add(height));
    }

    @Override
    public BigDecimal perimeter() {
        return BigDecimal.valueOf(2).multiply(PI).multiply(radius);
    }
}