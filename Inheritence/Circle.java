package Inheritence;

import java.math.BigDecimal;

public class Circle implements Shape{
    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calArea() {
        return radius.multiply(radius).multiply(new BigDecimal(3.14)).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal calPerimeter() {
        return null;
    }

    @Override
    public BigDecimal calCircumference() {
        return null;
    }
}
