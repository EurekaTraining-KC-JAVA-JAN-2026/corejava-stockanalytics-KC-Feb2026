package com.InheritanceAssignment.multipleInheritance;

public class Bear implements Animal, WildAnimal{
    String name;

    public Bear(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("The "+ name + " is an omnivore");
    }

    @Override
    public void sleep() {
        System.out.println("The "+ name+ " sleeps for more than 8 hours");
    }

    @Override
    public void hunt() {
        System.out.println("The "+ name + " hunts prey in the forest");
    }
}
