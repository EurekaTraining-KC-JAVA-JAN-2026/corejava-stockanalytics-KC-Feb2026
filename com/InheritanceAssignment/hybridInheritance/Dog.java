package com.InheritanceAssignment.hybridInheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);   // Call parent constructor
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}
