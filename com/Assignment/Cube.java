package com.Assignment;

import java.math.BigDecimal;

public class Cube implements Shape3D{
    BigDecimal side;

    public Cube(BigDecimal side) {
        this.side = side;
    }
    @Override
    public BigDecimal calculateSurfaceArea() {
        return side.multiply(side).multiply(new BigDecimal(6));
    }

    @Override
    public BigDecimal calculateVolume() {
        return side.multiply(side).multiply(side);
    }
}