package com.inheritence;

import java.math.BigDecimal;
// abstract is tight coupling so for the purpose of loose coupling we have interfaces
//interface we use implements
//inheritence we use extends
// abstract method should be declared in body
public class Rectangle implements Shape{
    public BigDecimal length;
    public BigDecimal breadth;

    public Rectangle(BigDecimal length, BigDecimal breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public BigDecimal calculateArea() {
        return length.multiply(breadth);
    }

    @Override
    public BigDecimal calculateCircumference() {
        return null;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return length.add(breadth).multiply(new BigDecimal(2));
}
}
