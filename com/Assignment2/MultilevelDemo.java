package com.Assignment2;
import com.inheritance.Square;

import java.math.BigDecimal;

public class MultilevelDemo {
    public static void main(String[] args) {

        Square mySquare = new Square(new BigDecimal("10"));


        mySquare.displayType();


        System.out.println("Calculated Area: " + mySquare.calculateArea());
    }
}