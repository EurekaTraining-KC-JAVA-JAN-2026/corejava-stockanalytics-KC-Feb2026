package com.inheritanceAssignment;

public class child extends parent{
    public String id;
    public double hourlywage;

    public child(String name, int age, String location, String id, double hourlywage) {
        super(name, age, location);
        this.id = id;
        this.hourlywage = hourlywage;
    }

    public double weeklyPay(int hours)
    {
        return hourlywage*hours;
    }
}
