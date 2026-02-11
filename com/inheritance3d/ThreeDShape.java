package com.inheritance3d;

import java.math.BigDecimal;

public interface ThreeDShape {
    BigDecimal calculateVolume();
    BigDecimal calculateSurfaceArea();

    default void displayInfo() {
        System.out.println("This is a 3D shape.");
    }
}