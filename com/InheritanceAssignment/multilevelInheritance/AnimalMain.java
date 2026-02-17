package com.InheritanceAssignment.multilevelInheritance;

public class AnimalMain {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.walk = 2;
        bear.name = "Sloth Bear";
        bear.minWeight = 4;
        bear.walk();
        bear.eat();
        bear.bearType();
        bear.sleep();
    }
}
