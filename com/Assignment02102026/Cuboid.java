package com.Assignment02102026;

import java.math.BigDecimal;

public class Cuboid implements ThreeDShapes{
    private BigDecimal length;
    private BigDecimal breadth;
    private BigDecimal height;

    public Cuboid(BigDecimal breadth, BigDecimal hight, BigDecimal length) {
        this.breadth = breadth;
        this.height = hight;
        this.length = length;
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
