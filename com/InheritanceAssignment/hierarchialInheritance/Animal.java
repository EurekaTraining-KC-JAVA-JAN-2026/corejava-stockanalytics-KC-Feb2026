package com.InheritanceAssignment.hierarchialInheritance;

public class Animal {
    String name;
    String size;
    int maxAge;

    public Animal(String name, String size, int maxAge) {
        this.name = name;
        this.size = size;
        this.maxAge = maxAge;
    }

    public Animal() {
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Max Age: " + maxAge + " years");
    }

}
