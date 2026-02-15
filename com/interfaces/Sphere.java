package com.interfaces;

import java.math.BigDecimal;


public class Sphere implements ThreeDimensionalShapes {
     private BigDecimal radius;

     Sphere(BigDecimal r) {
         this.radius = r;
     }

     public BigDecimal surfaceArea() {
         return radius.multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(4)).multiply(radius);

     }

     public BigDecimal volume() {
         return radius
                 .multiply(radius)
                 .multiply(new BigDecimal(3.14))
                 .multiply(new BigDecimal(1.33));
     }
 }

