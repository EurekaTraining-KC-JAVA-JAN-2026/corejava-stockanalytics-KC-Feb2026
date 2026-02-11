package com.inheritance;

import java.math.BigDecimal;

public class shapePlayGround {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(new BigDecimal(10), new BigDecimal(20));
        Circle circle1 = new Circle(new BigDecimal(5));
        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(circle1.calArea());
    }
}
