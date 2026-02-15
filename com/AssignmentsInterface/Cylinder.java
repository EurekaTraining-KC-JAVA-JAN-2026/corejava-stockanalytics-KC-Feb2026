package com.AssignmentsInterface;

import java.math.BigDecimal;

import static java.lang.Math.PI;

public class Cylinder implements Shapes3D {
    public  BigDecimal height;
    public BigDecimal radius;

    public Cylinder(BigDecimal height, BigDecimal radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public BigDecimal volume() {
        return radius.multiply(new BigDecimal(PI)).multiply(radius).multiply(height);
    }

    @Override
    public BigDecimal surfaceArea() {
        return BigDecimal.valueOf(2).multiply(new BigDecimal(PI)).multiply(radius).multiply(radius.add(height)) ;

    }

    @Override
    public BigDecimal perimeter() {
        return BigDecimal.valueOf(2).multiply(new BigDecimal(PI)).multiply(radius);
    }
}







