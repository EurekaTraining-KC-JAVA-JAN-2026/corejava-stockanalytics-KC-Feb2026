package SingleLevelInheritance;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sphere extends Shape {

    private BigDecimal radius;

    public Sphere(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal surfaceArea() {
        return BigDecimal.valueOf(4)
                .multiply(BigDecimal.valueOf(Math.PI))
                .multiply(radius.pow(2));
    }

    @Override
    public BigDecimal volume() {
        return BigDecimal.valueOf(4)
                .divide(BigDecimal.valueOf(3), 6, RoundingMode.HALF_UP)
                .multiply(BigDecimal.valueOf(Math.PI))
                .multiply(radius.pow(3));
    }

}
