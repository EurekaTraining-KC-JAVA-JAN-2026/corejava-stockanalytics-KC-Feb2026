package com.inheritance;

import java.math.BigDecimal;

public class Square implements Shape,Test{
    BigDecimal area = new BigDecimal(4);
    @Override
    public BigDecimal calculateArea() {

        return area.multiply(area);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }

    @Override
    public BigDecimal calculateCircumference() {
        return null;
    }

    @Override
    public BigDecimal calculateCircumferenec() {
        return null;
    }

    @Override
    public void geometry() {
        Shape.super.geometry();
    }

    @Override
    public boolean draw() {
        return false;
    }
}
