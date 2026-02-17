package com.interfaces;

import java.math.BigDecimal;

public class Cuboid implements Shapes3D {
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
        BigDecimal l = length.multiply(breadth);
        BigDecimal b = breadth.multiply(height);
        BigDecimal h = height.multiply(length);
        return l.add(b).add(h).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal perimeter() {
        return length.add(breadth).add(height).multiply(new BigDecimal(4));
    }
}
