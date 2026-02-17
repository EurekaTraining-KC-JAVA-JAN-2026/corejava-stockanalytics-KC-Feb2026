package com.Assignment2;
import java.math.BigDecimal;

public class Square extends Rectangle {

    public Square(BigDecimal side) {
        super(side, side);
    }

    @Override
    public void displayType() {
        System.out.println("This is a Square Level 3  Multilevel Inheritance)");
    }
}

