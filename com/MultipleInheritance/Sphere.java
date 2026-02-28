package com.MultipleInheritance;

import java.math.BigDecimal;

public class Sphere implements Shapes3D, Displayable {
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

    @Override
    public String getDetails() {
        return "Sphere radius is " + radius;
    }

}
