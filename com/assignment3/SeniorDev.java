package com.assignment3;

import java.math.BigDecimal;
//multi level inheritance:- parent->child->subchild
//constructor
public class SeniorDev extends Developer{
    public SeniorDev(String name, String eId, BigDecimal salary,String technology,BigDecimal bonus) {
        super(name, eId, salary,technology);
        this.bonus =bonus;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
//
    public BigDecimal bonus;


//overriding
    @Override
    public void printDetails() {
        System.out.println("senior developer details");
        super.printDetails();
        System.out.println("Bonus:" +getBonus());
    }
}
