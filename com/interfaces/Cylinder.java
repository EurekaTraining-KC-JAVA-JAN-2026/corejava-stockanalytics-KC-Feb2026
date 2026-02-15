package com.interfaces;

import java.math.BigDecimal;

public class Cylinder implements ThreeDimensionalShapes {
    private BigDecimal radius, height;

    Cylinder(BigDecimal radius, BigDecimal height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public BigDecimal surfaceArea() {
        // 2πr(h + r)
        return BigDecimal.valueOf(2).multiply(new BigDecimal(Math.PI)).multiply(radius).multiply(radius.add(height)) ;

    }
    @Override
    public BigDecimal volume() {
        // πr^2h
        return radius.multiply(new BigDecimal(Math.PI)).multiply(radius).multiply(height);
    }

}