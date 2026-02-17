package com.InheritanceAssignment.hybridInheritance;

class Bear extends Mammal implements WildAnimal, Carnivore {

    Bear(String name, int maxAge) {
        this.name = name;
        this.maxAge = maxAge;
    }

    public void hunt() {
        System.out.println(name + " is hunting in the water");
    }

    public void eatMeat() {
        System.out.println(name + " eats meat");
    }
}
