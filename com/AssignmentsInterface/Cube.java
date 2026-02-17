package com.AssignmentsInterface;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class Cube implements Shapes3D,Measurable{
    public BigDecimal side;


    public Cube(BigDecimal side) {
        this.side = side;
    }

     @Override
    public BigDecimal volume() {
        return side.multiply(side).multiply(side);
    }

    @Override
    public BigDecimal surfaceArea() {
        return side.multiply(side).multiply(new BigDecimal(6));
    }

    @Override
    public BigDecimal perimeter() {
        return side.multiply(new BigDecimal(12));
    }
}




