package com.InterfaceAssignment3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cone implements Models3D {
    public BigDecimal radius;
    public BigDecimal height;
    public BigDecimal length;

    public Cone(BigDecimal length, BigDecimal height, BigDecimal radius) {
        this.length = length;
        this.height = height;
        this.radius = radius;
    }

    @Override
    public BigDecimal LateralSurfaceArea() {
        return radius.multiply(length).multiply(new BigDecimal(Math.PI)) ;
    }

    @Override
    public BigDecimal Volume() {
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI)).multiply(height).divide(new BigDecimal(3),2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal SurfaceArea() {
        return null;
    }
}
