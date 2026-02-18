package com.assignment3;

import java.math.BigDecimal;
//single inheritance :- parent with 1 child
// extending here
public class Developer extends Employee {
    public String technology;
//overiding from parent class employee
    @Override
    public void printDetails() {
        System.out.println("Developer Details:");
        System.out.println("Technology:-" +technology);
        super.printDetails();
    }
//constructor
    public Developer(String name, String eId, BigDecimal salary, String technology) {
        super(name, eId, salary);
        this.technology = technology;
    }

}
