package com.Assignment02102026;

import java.math.BigDecimal;

//here cube is child class and cuboid is parent class and shape is grandparent class which shows us mutilevel inheritance

public class Cube extends Cuboid {
    private BigDecimal side;

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
    public String shape(){return "Cube";}
}
