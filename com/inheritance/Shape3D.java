package com.inheritance;

public interface Shape3D  {
    double volume();
    double surfaceArea();

    default void geometry(){
        System.out.println("printing geometry");
    }

}
