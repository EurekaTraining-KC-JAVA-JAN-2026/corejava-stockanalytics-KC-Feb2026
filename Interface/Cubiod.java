package Interface;

import java.math.BigDecimal;

public class Cubiod implements Shapes3D {
    BigDecimal length;
    BigDecimal width;
    BigDecimal height;

    public Cubiod(BigDecimal height, BigDecimal length, BigDecimal width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public BigDecimal calVolume( ) {
        return length.multiply(width).multiply(height);
    }

    @Override
    public BigDecimal calSurfaceArea() {
        return (length.multiply(width).add(width.multiply(height)).add(height.multiply(length))).multiply( new BigDecimal(2));
    }
}
