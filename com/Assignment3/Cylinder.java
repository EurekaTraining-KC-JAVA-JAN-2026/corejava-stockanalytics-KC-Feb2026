package com.Assignment3;

import java.math.BigDecimal;

public class Cylinder extends Shape {
    BigDecimal radius;
    BigDecimal height;

    public Cylinder(BigDecimal radius, BigDecimal height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public BigDecimal calculateSurfaceArea() {
        return radius.multiply(new BigDecimal(2)).multiply(new BigDecimal(Math.PI).multiply((radius.add(height))));
    }

    public BigDecimal calculateVolume() {
        return radius.multiply(new BigDecimal(Math.PI)).multiply(radius).multiply(height);
    }

}
