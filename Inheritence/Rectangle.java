package Inheritence;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Rectangle implements Shape{
    public Rectangle(BigDecimal breadth, BigDecimal length) {
        this.breadth = breadth;
        this.length = length;
    }

    public BigDecimal length;
    public BigDecimal breadth;
    @Override
    public BigDecimal calPerimeter() {
        return length.multiply(breadth).multiply(new BigDecimal(2));}

    @Override
    public BigDecimal calCircumference() {
        return null;
    }

    @Override
    public BigDecimal calArea() {
        return (new BigDecimal(String.valueOf(length)).multiply(breadth));

    }

}
