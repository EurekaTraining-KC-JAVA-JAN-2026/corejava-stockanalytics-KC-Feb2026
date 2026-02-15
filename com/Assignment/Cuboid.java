package com.Assignment;

import java.math.BigDecimal;

public class Cuboid implements Shape3D{
    BigDecimal length;
    BigDecimal breadth;
    BigDecimal height;
    public Cuboid(BigDecimal length, BigDecimal breadth, BigDecimal height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public BigDecimal calculateSurfaceArea() {
        BigDecimal face1 = length.multiply(breadth);
        BigDecimal face2 = breadth.multiply(height);
        BigDecimal face3 = height.multiply(length);
        return face1.add(face2).add(face3).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal calculateVolume() {
        return length.multiply(breadth).multiply(height);
    }
}
