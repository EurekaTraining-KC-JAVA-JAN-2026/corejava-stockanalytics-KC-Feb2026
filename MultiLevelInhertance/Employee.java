package MultiLevelInhertance;

import java.math.BigDecimal;

public class Employee {
    public String name;
    public BigDecimal emp_id;

    public Employee(String name, BigDecimal emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }


    public void displayEmployeeDetails() {
        System.out.println("Employee Name : " +name);
        System.out.println("Employee ID : " +emp_id);
    }
}
