package Interface;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class Cylinder implements Shapes3D {
    BigDecimal radius;
    BigDecimal height;

    public Cylinder(BigDecimal height, BigDecimal radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public BigDecimal calVolume() {
        return radius.multiply(radius).multiply(new BigDecimal(3.14) .multiply(height));
    }

    @Override
    public BigDecimal calSurfaceArea() {
        return (radius.add(height)).multiply(new BigDecimal(3.14)).multiply(new BigDecimal(2)).multiply(radius);
    }
}
