package com.interfaceAssignment;

import com.interfaceExample.Shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sphere implements Shape3D {
    public BigDecimal radius;

    public Sphere(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal volume() {
        return radius.multiply(radius).multiply(radius).multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(4)).divide(new BigDecimal(3), 2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal surfaceArea() {
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(4));
    }
}
