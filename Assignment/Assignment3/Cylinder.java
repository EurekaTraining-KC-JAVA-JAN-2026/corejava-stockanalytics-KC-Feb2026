package Assignment.Assignment3;

import java.math.BigDecimal;

public class Cylinder implements Shape3D{

    private BigDecimal radius;
    private BigDecimal height;
    private BigDecimal PI = BigDecimal.valueOf(Math.PI);

    public Cylinder(BigDecimal radius, BigDecimal height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public BigDecimal volume() {
        return PI.multiply(radius.multiply(radius)).multiply(height);
    }

    @Override
    public BigDecimal surfaceArea() {
        return new BigDecimal(2).multiply(PI).multiply(radius).multiply(radius.add(height));
    }
}
