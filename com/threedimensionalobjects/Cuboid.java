package com.threedimensionalobjects;

import java.math.BigDecimal;

public class Cuboid implements Shapes, ThreeDimensionalObjectsNames{
    public BigDecimal length;
    public BigDecimal breadth;
    public BigDecimal height;

    public Cuboid(BigDecimal length, BigDecimal breadth, BigDecimal height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public BigDecimal calculateVolume() {
        return length.multiply(breadth).multiply(height);
    }

    @Override
    public BigDecimal calculateCircumference() {
        return null;
    }

    @Override
    public String Name() {
        return "Cuboid";
    }
}
