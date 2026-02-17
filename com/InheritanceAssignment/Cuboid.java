package com.InheritanceAssignment;

import java.math.BigDecimal;

public class Cuboid implements Shape3d{
    private BigDecimal length;
    private BigDecimal breadth;

    public Cuboid(BigDecimal length, BigDecimal breadth, BigDecimal height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    private BigDecimal height;
    public BigDecimal calculateSurfaceArea()
    {
        BigDecimal lb = length.multiply(breadth);
        BigDecimal bh = breadth.multiply(height);
        BigDecimal hl = height.multiply(length);
        return lb.add(bh).add(hl).multiply(new BigDecimal(2));
    }

    public BigDecimal calculateVolume() {

        return length.multiply(breadth).multiply(height);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return length.add(breadth).add(height).multiply(new BigDecimal(4));
    }

}