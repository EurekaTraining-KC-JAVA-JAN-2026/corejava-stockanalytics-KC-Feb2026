package com.Inheritance;

import java.awt.*;
import java.math.BigDecimal;

public class ShapesPlayGround {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(new BigDecimal(10), new BigDecimal(20));
        Circle circle1 = new Circle(new BigDecimal(5));
        circle1.geometry();
        System.out.println(rectangle1.calculateArea());
        System.out.println(circle1.calculateCircumferenec());
        Sphere sphere1 = new Sphere(new BigDecimal(4));
        sphere1.geometry();
        System.out.println(sphere1.calculateArea());
        System.out.println(sphere1.calculateCircumferenec());
        Cuboid cuboid1 = new Cuboid(new BigDecimal(4), new BigDecimal(5), new BigDecimal(3));
        cuboid1.geometry();
        System.out.println(cuboid1.calculateArea());
        System.out.println(cuboid1.calculateCircumferenec());

    }
}