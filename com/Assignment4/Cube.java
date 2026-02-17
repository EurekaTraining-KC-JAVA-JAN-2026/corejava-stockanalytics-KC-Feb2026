package com.Assignment4;

import java.math.BigDecimal;

public class Cube extends Shape{
    public BigDecimal side;

    public Cube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculateVolume() {
        return side.multiply(side).multiply(side);
    }

    @Override
    public BigDecimal calculateSurfaceArea() {
        return side.multiply(side).multiply(new BigDecimal(6));
    }
}

