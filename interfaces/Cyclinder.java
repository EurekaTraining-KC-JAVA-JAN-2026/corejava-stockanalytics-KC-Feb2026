package interfaces;

import java.math.BigDecimal;

public class Cyclinder implements ShapesAssignment{
    private BigDecimal radius;
    private BigDecimal height ;
    public Cyclinder(BigDecimal radius, BigDecimal height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    public BigDecimal calsurface() { //2PIrh
        return radius.multiply(height).multiply(new BigDecimal(Math.PI).multiply(new BigDecimal(2)));
    }

    @Override
    public BigDecimal calvol() {//PIr2h
        return radius.multiply(radius).multiply(height).multiply(new BigDecimal(Math.PI).multiply(new BigDecimal(2)));
    }
}
