package com.inheritanceAssignment;

public class parent {
    public String name;
    public int age;
    public String location;

    public parent(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void work()
    {
        System.out.println("I work at " + location + " manufacturing plant");
    }

    public void ageInfo(){
        System.out.println("The name of the worker is:" +name);
        System.out.println("The current age is:" +age);
    }


}
