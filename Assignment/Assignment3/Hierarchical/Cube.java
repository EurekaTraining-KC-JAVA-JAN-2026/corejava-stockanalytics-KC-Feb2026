package Assignment.Assignment3.Hierarchical;

import java.math.BigDecimal;

public class Cube implements Shape3D {
   private BigDecimal side;
   private BigDecimal sides = BigDecimal.valueOf(6);

    public Cube(BigDecimal side) {
        this.side = side;
    }

    @Override
    public BigDecimal volume() {
        return side.multiply(side).multiply(side);
    }

    @Override
    public BigDecimal surfaceArea() {
        return new BigDecimal(6).multiply(side).multiply(side);
    }
}
