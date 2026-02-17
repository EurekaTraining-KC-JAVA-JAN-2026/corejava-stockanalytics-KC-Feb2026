package com.inheritanceAssignment;

import java.math.BigDecimal;

public class Cube implements Shape3D,Shape3d2 {
    public BigDecimal edge;

    public Cube(BigDecimal edge) {
        this.edge = edge;
    }


    public void setEdge(BigDecimal edge) {
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

    @Override
    public BigDecimal density() {
        return null;
    }

    public BigDecimal density(BigDecimal mass) {
        return mass.divide(volume());
    }
}
