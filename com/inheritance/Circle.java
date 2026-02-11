package com.inheritance;

import java.math.BigDecimal;

public class Circle implements Shape{

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    private BigDecimal radius;
    @Override
    public BigDecimal calculateArea() {
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI));
    }

    @Override
    public BigDecimal calculateCircumference() {
        return ;
    }
}
