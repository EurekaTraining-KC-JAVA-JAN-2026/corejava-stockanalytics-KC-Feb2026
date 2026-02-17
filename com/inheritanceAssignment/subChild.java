package com.inheritanceAssignment;

public class subChild extends child{
    public int teamSize;
    public int extraHours;
    public double bonus;

    public subChild(String name, int age, String location, String id, double hourlywage, int teamSize, int extraHours, double bonus) {
        super(name, age, location, id, hourlywage);
        this.teamSize = teamSize;
        this.extraHours = extraHours;
        this.bonus = bonus;
    }

    public double totalPay(int hours){
        return (weeklyPay(hours) + extraHours*bonus);
    }

    @Override
    public String toString() {
        return "totalInfo" + '\n'+
                "name: " +name+ '\n'+
                "age: " +age+ '\n'+
                "location: " +location+ '\n'+
                "id: " +id+ '\n'+
                "hourly wage: " +hourlywage+ '\n'+
                "teamSize: " +teamSize+ '\n'+
                "extraHours: " +extraHours+ '\n'+
                "bonus: " +bonus;
    }
}
