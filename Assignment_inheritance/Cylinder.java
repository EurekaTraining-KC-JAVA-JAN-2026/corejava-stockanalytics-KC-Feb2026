package Assignment_inheritance;

import java.math.BigDecimal;

public class Cylinder extends Shape {
    private BigDecimal radius;
    private BigDecimal height;

    public Cylinder(BigDecimal radius, BigDecimal height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public BigDecimal surfaceArea() {
        return BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(Math.PI)).multiply(radius).multiply(radius.add(height));
    }
    @Override
    public BigDecimal volume(){
        return BigDecimal.valueOf(Math.PI).multiply(radius.pow(2)).multiply(height);
    }
}
