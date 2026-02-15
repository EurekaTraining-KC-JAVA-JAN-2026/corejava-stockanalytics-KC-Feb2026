package com.threedimensionalobjects;

import java.math.BigDecimal;

public class Sphere implements Shapes{
    public BigDecimal radius;

    public Sphere(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateCircumference() {
        return radius.multiply(new BigDecimal(2)).multiply(new BigDecimal(Math.PI));
    }
    @Override
    public BigDecimal calculateVolume() {
        return null;
    }
}
