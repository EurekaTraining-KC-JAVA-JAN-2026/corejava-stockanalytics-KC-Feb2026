package com.Assignment02162026;

import com.Assignment02102026.ThreeDShapes;

import java.math.BigDecimal;

//here cylinder is only inherted from threedshapes so it is single inheritance

public class Cylinder implements ThreeDShapes {
    private BigDecimal radius;
    private BigDecimal height;

    public Cylinder(BigDecimal height, BigDecimal radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public BigDecimal volume() {
        return radius.multiply(radius).multiply(height).multiply(new BigDecimal(Math.PI));
    }

    @Override
    public BigDecimal surfaceArea() {
        return (radius.multiply(radius).multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(2)))
                .add(height.multiply(radius).multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(2)));
    }
}
