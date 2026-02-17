package interfaces;

import java.math.BigDecimal;

public class Cylinder implements Shapes3D {

    private BigDecimal radius;
    private BigDecimal height;

    private static final BigDecimal PI =
            new BigDecimal("3.141592653589793");

    public Cylinder(BigDecimal radius,
                    BigDecimal height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public BigDecimal volume() {
        return PI.multiply(radius.multiply(radius))
                .multiply(height);
    }

    @Override
    public BigDecimal surfaceArea() {
        return PI.multiply(radius)
                .multiply(radius.add(height))
                .multiply(new BigDecimal("2"));
    }

    @Override
    public BigDecimal perimeter() {
        return PI.multiply(radius)
                .multiply(new BigDecimal("2"));
    }
}
