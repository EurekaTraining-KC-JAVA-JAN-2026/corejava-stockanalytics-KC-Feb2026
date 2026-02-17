package com.Assignment2;
import java.math.BigDecimal;

public class Rectangle implements Shape {
    public BigDecimal length;
    public BigDecimal breadth;

    public Rectangle(BigDecimal length, BigDecimal breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void displayType() {
        System.out.println("This is a Rectangle Level 2");
    }

    @Override
    public BigDecimal calculateArea() {
        return length.multiply(breadth);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return length.add(breadth).multiply(new BigDecimal("2"));
    }
}