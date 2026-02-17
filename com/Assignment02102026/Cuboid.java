package com.Assignment02102026;

import com.Assignment02162026.Shape;

import java.math.BigDecimal;

//Here Cuboid extends to Shape and threedshapes so it is a multiple  inheritance

public class Cuboid implements ThreeDShapes, Shape {
    private BigDecimal length;
    private BigDecimal breadth;
    private BigDecimal height;

    public Cuboid(BigDecimal breadth, BigDecimal hight, BigDecimal length) {
        this.breadth = breadth;
        this.height = hight;
        this.length = length;
    }

    public Cuboid() {
    }

    @Override
    public BigDecimal volume() {
        return length.multiply(breadth).multiply(height);
    }

    @Override
    public BigDecimal surfaceArea() {
        return ((length.multiply(breadth)).add(breadth.multiply(height)).add(height.multiply(length))).multiply(new BigDecimal(2));
    }

    @Override
    public String shape(){return "Cuboid";}
}
