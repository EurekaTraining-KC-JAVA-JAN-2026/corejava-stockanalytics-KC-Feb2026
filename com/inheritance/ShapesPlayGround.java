package com.inheritance;

import java.math.BigDecimal;

public class ShapesPlayGround {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(new BigDecimal(10),new BigDecimal(20));
        System.out.println(rectangle1.calculateArea());

        Circle circle1 = new Circle(new BigDecimal(5));
        System.out.println(circle1.calculateCircumferenec());

        circle1.draw();
        System.out.println("Draw the Cube");

        Square c= new Square();
        System.out.println(c.calculateArea());
        System.out.println(c.draw());


    }
}


