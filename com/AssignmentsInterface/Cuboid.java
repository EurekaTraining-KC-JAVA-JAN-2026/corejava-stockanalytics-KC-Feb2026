package com.AssignmentsInterface;

import java.math.BigDecimal;

public class Cuboid implements Shapes3D, Measurable {

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
        return l.add(b).add(h).multiply(BigDecimal.valueOf(2));
    }

    @Override
    public BigDecimal perimeter() {
        return length.add(breadth).add(height)
                .multiply(BigDecimal.valueOf(4));
    }
}