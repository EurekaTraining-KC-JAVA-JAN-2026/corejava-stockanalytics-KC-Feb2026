package interfaces;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sphere implements ShapesAssignment{
    private BigDecimal radius;
    public Sphere(BigDecimal radius, BigDecimal bigDecimal) {

        this.radius = radius;
    }
    @Override
    public BigDecimal calvol() {    /// 4/3PIr3
        return radius.multiply(radius).multiply(radius).multiply(new BigDecimal(Math.PI).multiply(new BigDecimal(4).divide(new BigDecimal(3), 10, RoundingMode.HALF_UP)));
    }

    @Override
    public BigDecimal calsurface() { //4PIr2
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI).multiply(new BigDecimal(4)));
    }
}
