package com.assignment3;

import java.math.BigDecimal;

public class EmployeePlayGround {
    public static void main(String[] args) {
        //creating objects of classes
        Developer developer1 = new Developer("Sneha","A1",new BigDecimal("500"),"Java");
        SeniorDev seniorDeveloper1 = new SeniorDev("Neha","A2",new BigDecimal("10000"),"Java FullStack Developer",new BigDecimal("5000"));
        Manager manager1 = new Manager("Anu","A3",new BigDecimal("150000"),10);
        Hr hr1= new Hr("Sam","A4",new BigDecimal("20000"),15);

        System.out.println("printing Developer details:");
        developer1.printDetails();

        //senior dev deails print
        System.out.println("printing Senior Dev:");
        seniorDeveloper1.printDetails();

        //Manager details
        System.out.println("printing manager details" );
        manager1.printDetails();

        //hr details
        System.out.println("print hr details");
        hr1.printDetails();
        //calvlate tax
        System.out.println("Bonus:"+hr1.calculateBonus());
        System.out.println("Taxes:"+hr1.calculateTax());
    }
}
