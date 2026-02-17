package com.Assignment02162026;

import com.Assignment02102026.ThreeDShapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
//here sphere and cuboid both are inheritance of shape class which gives us hierarchical inheritance
public class Sphere implements ThreeDShapes,Shape {
    private BigDecimal radius;

    public Sphere(BigDecimal radius) {
        this.radius = radius;
    }



    @Override
    public BigDecimal surfaceArea() {
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI).multiply(new BigDecimal(4)));
    }

    @Override
    public BigDecimal volume() {
        return radius.multiply(radius)
                .multiply(radius)
                .multiply(new BigDecimal(Math.PI))
                .multiply(new BigDecimal(4)
                .divide(new BigDecimal(3),2, RoundingMode.HALF_UP));
    }

    @Override
    public String shape(){return "Sphere";}
}
