package com.interfaces;

import java.math.BigDecimal;

public class Cube implements ThreeDimensionalShapes{
    public BigDecimal side;

    public Cube(BigDecimal side) {
        this.side = side;
    }

    public BigDecimal volume() {
        return side.multiply(side).multiply(side);
    }
    public BigDecimal surfaceArea() {
        return side.multiply(side).multiply(new BigDecimal(6));
    }

}