package com.interfaceAssignment;

import java.math.BigDecimal;

public class Cube implements Shape3D{
    public BigDecimal edge;

    public Cube(BigDecimal edge) {
        this.edge = edge;
    }


    @Override
    public BigDecimal volume() {
        return edge.multiply(edge).multiply(edge);
    }

    @Override
    public BigDecimal surfaceArea() {
        return edge.multiply(edge).multiply(new BigDecimal(6));
    }
}
