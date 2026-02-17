package com.Assignment3;

import java.math.BigDecimal;

public class Cube extends Shape {
    BigDecimal side;

    public Cube(BigDecimal side) {
        super("Cube");
        this.side = side;
    }
    public BigDecimal calculateSurfaceArea(){
        return side.multiply(side).multiply(BigDecimal.valueOf(6));
    }
    public BigDecimal calculateVolume() {
        return side.multiply(side).multiply(side);
    }
}

