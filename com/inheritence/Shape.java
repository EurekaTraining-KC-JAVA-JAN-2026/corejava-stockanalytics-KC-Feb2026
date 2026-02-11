package com.inheritence;


import java.math.BigDecimal;
// we will do some operations on shapes
//circle,rectangle,square
//interfaces are only to hold abstract type of methods
//benifit:- it will provide default method(type
public interface Shape {
    BigDecimal calculateArea();
    BigDecimal calculateCircumference();
    BigDecimal calculatePerimeter();
    default  void geometry(){
        System.out.println("print geometry");
    }
}