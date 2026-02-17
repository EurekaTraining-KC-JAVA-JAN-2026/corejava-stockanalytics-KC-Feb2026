package com.assignment3;

import java.math.BigDecimal;
// multiple inheritance:- is not supported in java
//due to ambiguity (2 parent classes have same method )java will not understand which method it should take so it gives ambiguity
//we are going wwith interfaces so that method declaration is diff and child class ovverrides parebt class
public class Hr extends Manager implements Bonus, Taxes  {

    public Hr(String name, String eId, BigDecimal salary, int teamSize) {
        super(name, eId, salary, teamSize);
    }

    @Override
    public BigDecimal calculateBonus() {
        return getSalary().multiply(new BigDecimal(0.10));//it is 10%
    }

    @Override
    public BigDecimal calculateTax() {
        return getSalary().multiply(new BigDecimal("0.30"));//30% tax
    }

    @Override
    public void printDetails() {
        System.out.println("printing hr details");
        super.printDetails();
    }
}
