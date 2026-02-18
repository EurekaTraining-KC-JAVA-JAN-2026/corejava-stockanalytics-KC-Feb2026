package com.Assignment;

import java.math.BigDecimal;

public class Cube implements ThreeDShape{
    private BigDecimal side;

    public Cube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal volume() {
        return side.multiply(side).multiply(side);
    }

    @Override
    public BigDecimal surfaceArea() {
        return side.multiply(side).multiply(new BigDecimal(6));
    }
}