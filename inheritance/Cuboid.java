package inheritance;

import java.math.BigDecimal;

public abstract class Cuboid implements Shape {
    public BigDecimal length;
    public BigDecimal breadth;
    public BigDecimal height;

    public Cuboid(BigDecimal length, BigDecimal breadth, BigDecimal height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }



    @Override
    public BigDecimal CubiodTotalSurafaceArea() {
        return ((length.multiply(breadth)).add(breadth.multiply(height)).add(height.multiply(length))).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal CuboidVolume() {
        return (length.multiply(breadth)).multiply(height);
    }
}
