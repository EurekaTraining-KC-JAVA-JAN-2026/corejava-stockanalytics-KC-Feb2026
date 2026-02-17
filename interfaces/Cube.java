package interfaces;

import java.math.BigDecimal;

public class Cube implements Shapes3D {

    private BigDecimal edge;

    public Cube(BigDecimal edge) {
        this.edge = edge;
    }

    @Override
    public BigDecimal volume() {
        return edge.multiply(edge).multiply(edge);
    }

    @Override
    public BigDecimal surfaceArea() {
        return edge.multiply(edge)
                .multiply(new BigDecimal("6"));
    }

    @Override
    public BigDecimal perimeter() {
        return edge.multiply(new BigDecimal("12"));
    }
}
