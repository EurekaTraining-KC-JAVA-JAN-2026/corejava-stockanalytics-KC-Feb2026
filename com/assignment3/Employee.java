package com.assignment3;

import java.math.BigDecimal;
//parent class for the all classes
public class Employee {
    public String name;
    public String eId;
    public BigDecimal Salary;

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public BigDecimal getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String eId, BigDecimal salary) {
        this.name = name;
        this.eId = eId;
        Salary = salary;
    }
    public void printDetails(){
        System.out.println("Name is:" +getName());
        System.out.println("ID is:" +geteId());
        System.out.println("Salry of employee is:" +getSalary());
    }

}
