package com.inheritance;
import java.math.BigDecimal;
public class Rectangle implements Shape {
    public BigDecimal length;
    public BigDecimal breath;

    public Rectangle(BigDecimal length, BigDecimal breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public BigDecimal calArea() {
        return (new BigDecimal(String.valueOf(length))).multiply(breath);
    }

    @Override
    public BigDecimal calculatePerimeter() {

        return length.add(breath).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal calCircumference() {
        return null;
    }
}
