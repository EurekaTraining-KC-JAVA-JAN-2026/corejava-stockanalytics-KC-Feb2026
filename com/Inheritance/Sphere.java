package com.Inheritance;


import java.math.BigDecimal;

public class Sphere implements Shape {
    private BigDecimal radius;

    public Sphere(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateArea() {
        return radius.multiply(radius.multiply(new BigDecimal(4)).multiply(new BigDecimal(Math.PI)));
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }

    @Override
    public void geometry() {
        Shape.super.geometry();
        System.out.println("This is the Sphere");
    }

    @Override
    public BigDecimal calculateCircumferenec() {
        return radius.multiply(new BigDecimal(2)).multiply(new BigDecimal(Math.PI));
    }

}
