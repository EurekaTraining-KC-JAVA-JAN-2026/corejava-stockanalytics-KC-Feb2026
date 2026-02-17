package interfaces;

import java.math.BigDecimal;

public class Cuboid implements Shapes3D {

    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;

    public Cuboid(BigDecimal length,
                  BigDecimal width,
                  BigDecimal height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal volume() {
        return length.multiply(width)
                .multiply(height);
    }

    @Override
    public BigDecimal surfaceArea() {
        BigDecimal lw = length.multiply(width);
        BigDecimal wh = width.multiply(height);
        BigDecimal hl = height.multiply(length);

        return lw.add(wh).add(hl)
                .multiply(new BigDecimal("2"));
    }

    @Override
    public BigDecimal perimeter() {
        return length.add(width)
                .add(height)
                .multiply(new BigDecimal("4"));
    }
}
