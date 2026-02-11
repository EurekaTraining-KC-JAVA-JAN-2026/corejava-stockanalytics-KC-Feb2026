package com.Assignment02102026;

import java.math.BigDecimal;

public class Cube implements ThreeDShapes{
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
