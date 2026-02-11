package com.inheritence;

import java.math.BigDecimal;

public class ShapesPlayGround {
    public static void main(String[] args) {
        Circle circle1= new Circle(new BigDecimal(5));
        Rectangle rectangle1= new Rectangle(new BigDecimal(10),new BigDecimal(20));

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(circle1.calculateCircumference());
        System.out.println(circle1.calculateArea());
    }
}
