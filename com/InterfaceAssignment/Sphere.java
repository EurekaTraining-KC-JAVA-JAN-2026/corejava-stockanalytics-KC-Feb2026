package com.InterfaceAssignment;

import java.math.BigDecimal;

public class Sphere implements Shape3d {

    private BigDecimal radius;

    public Sphere(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateSurfaceArea() {
        // 4 pie r sq
        BigDecimal pi = new BigDecimal("3.1415926");
        return pi.multiply(radius.multiply(radius))
                .multiply(new BigDecimal(4));
    }

    @Override
    public BigDecimal calculateVolume() {
        // (4/3) pie r cube
        BigDecimal pi = new BigDecimal("3.1415926");
        BigDecimal fourByThree = new BigDecimal(4.0 / 3.0);

        return pi.multiply(radius.multiply(radius).multiply(radius))
                .multiply(fourByThree);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        // 2 pir r (perimeter of circle)
        BigDecimal pi = new BigDecimal("3.1415926");
        return pi.multiply(radius)
                .multiply(new BigDecimal(2));
    }
}
