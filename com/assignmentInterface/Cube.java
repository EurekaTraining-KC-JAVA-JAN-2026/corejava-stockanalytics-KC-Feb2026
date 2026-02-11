package com.assignmentInterface;

import java.math.BigDecimal;

public class Cube implements Shape3d{
    BigDecimal length;

    public Cube(BigDecimal length) {
        this.length = length;
    }

    @Override
    public BigDecimal calculateSurfaceArea() {
        return length.multiply(length).multiply(new BigDecimal(6));
    }

    @Override
    public BigDecimal calculateVolume() {
        return length.multiply(length).multiply(length);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return length.multiply(new BigDecimal(12));
    }
}
