package inheritance;

import java.math.BigDecimal;

public abstract class Cube implements Shape{
    public BigDecimal side;

    public Cube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal CubeTotalSurafaceArea() {
        return ((side.multiply(side)).multiply(BigDecimal.valueOf(6)));
    }

    @Override
    public BigDecimal CuboidVolume() {
        return (side.multiply(side)).multiply(side);
    }
}
