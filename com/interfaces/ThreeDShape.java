package com.interfaces;

import java.math.BigDecimal;

public interface ThreeDShape {
    BigDecimal calculateVolume();
    BigDecimal calculateSurfaceArea();

    default void showDetails() {
        System.out.println("This shape has three dimensions.");
    }
}
