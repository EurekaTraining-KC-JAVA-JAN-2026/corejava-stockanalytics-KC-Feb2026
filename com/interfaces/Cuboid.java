package com.interfaces;

import java.math.BigDecimal;

public class Cuboid implements ThreeDShape{
    public BigDecimal length;
    public BigDecimal width;
    public BigDecimal height;

    public Cuboid(BigDecimal length, BigDecimal width, BigDecimal height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal calculateVolume() {
        return length.multiply(width).multiply(height);
    }

    @Override
    public BigDecimal calculateSurfaceArea() {
        BigDecimal lw = length.multiply(width);
        BigDecimal lh = length.multiply(height);
        BigDecimal wh = width.multiply(height);

        return (lw.add(lh).add(wh)).multiply(new BigDecimal("2"));
    }
}
