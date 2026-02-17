package com.InheritanceAssignment.hierarchialInheritance;

public class AnimalMain {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.maxAge = 25;
        bear.name = "Grizzly Bear";
        bear.size = "Large";
        System.out.println("Printing Bear details");
        bear.displayInfo();
        bear.growl();


        Wolf wolf = new Wolf();
        wolf.maxAge = 15;
        wolf.name = "Snow Wolf";
        wolf.size = "Medium";
        System.out.println("Printing Wolf details");
        wolf.displayInfo();
        wolf.howl();
    }
}
