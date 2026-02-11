package com.inheritance3d;

import java.math.BigDecimal;
import java.math.MathContext;

public class Sphere implements ThreeDShape {
    private BigDecimal r;
    private static BigDecimal PI = new BigDecimal(Math.PI);
    public Sphere(BigDecimal radius) {
        this.r = radius;
    }
    @Override
    public BigDecimal calculateVolume() {
        return PI.multiply(r.pow(3))
                .multiply(new BigDecimal(4))
                .divide(new BigDecimal(3), MathContext.DECIMAL64);
    }
    @Override
    public BigDecimal calculateSurfaceArea() {
        return PI.multiply(r.pow(2)).multiply(new BigDecimal(4));
    }
}