package com.InheritanceAssignment.multilevelInheritance;

public class Mammal extends Animal{
    public int walk;
    public int minWeight;
    public void walk()
    {
        System.out.println("A mammal can weigh atleast "+ minWeight + " lbs");
    }

}
