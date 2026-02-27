package PracticeJava.Comparable_Tor;

import java.math.BigDecimal;

public class Employee implements Comparable<Employee>{
    private BigDecimal id;
    private String name;
    private double salary;

    public Employee() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(BigDecimal id, String name, double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
