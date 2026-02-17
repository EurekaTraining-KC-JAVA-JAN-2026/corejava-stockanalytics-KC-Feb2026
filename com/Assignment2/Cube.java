package com.Assignment2;

import java.math.BigDecimal;

public class Cube implements TwoDimension{
    BigDecimal side;
    public Cube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal calculateArea() {
        return side.multiply(side);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return side.multiply(BigDecimal.valueOf(4));
    }

    /*@Override
    public BigDecimal calculateSurfaceArea() {
        return side.multiply(side).multiply(BigDecimal.valueOf(6));
    }

    @Override
    public BigDecimal calculateVolume() {
        return side.multiply(side).multiply(side);
    }*/
}
