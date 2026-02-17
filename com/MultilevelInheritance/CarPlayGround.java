package com.MultilevelInheritance;

public class CarPlayGround {
    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar();

        tesla.start();   // From Vehicle
        tesla.drive();   // From Car
        tesla.charge();  // From ElectricCar
    }
}
