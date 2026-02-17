package com.InterfaceAssignment3;

import java.math.BigDecimal;

public class Cube implements Models3D{
    public BigDecimal edge;

    // Constructor
    public Cube(BigDecimal edge) {
        this.edge = edge;
    }

    @Override
    public BigDecimal LateralSurfaceArea() {
        return null;
    }

    @Override
    public BigDecimal Volume() {
        return edge.multiply(edge).multiply(edge);
    }

    @Override
    public BigDecimal SurfaceArea() {
        return edge.multiply(edge).multiply(new BigDecimal(6));
    }
}
