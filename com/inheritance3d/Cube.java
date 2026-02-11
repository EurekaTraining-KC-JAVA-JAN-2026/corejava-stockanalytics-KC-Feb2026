package com.inheritance3d;

import java.math.BigDecimal;

public class Cube implements ThreeDShape {
    private BigDecimal a;

    public Cube(BigDecimal side) {
        this.a = side;
    }
    @Override
    public BigDecimal calculateVolume() {
        return a.pow(3);
    }
    @Override
    public BigDecimal calculateSurfaceArea() {
        return a.pow(2).multiply(new BigDecimal(6));
    }
}