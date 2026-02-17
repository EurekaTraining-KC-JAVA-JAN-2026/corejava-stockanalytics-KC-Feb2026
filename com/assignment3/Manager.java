package com.assignment3;

import java.math.BigDecimal;
//hierarchial :- one parent multiple childs==employe->developer,manager
public class Manager extends Employee{
    private int teamSize;

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
//constructor
    public Manager(String name, String eId, BigDecimal salary, int teamSize) {
        super(name, eId, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void printDetails() {
        System.out.println("Printing Manager class details");
        super.printDetails();
        System.out.println("TeamSize is "+teamSize);
    }

}
