package com.Assignment;

import java.math.BigDecimal;

public class Cuboid implements ThreeDShape {
    private BigDecimal length;
    private BigDecimal breadth;
    private BigDecimal height;

    public Cuboid(BigDecimal length, BigDecimal breadth, BigDecimal height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public BigDecimal volume() {
        return length.multiply(breadth).multiply(height);
    }

    @Override
    public BigDecimal surfaceArea() {
        return ((length.multiply(breadth)).add(breadth.multiply(height)).add(height.multiply(length))).multiply(new BigDecimal(2));
    }
}