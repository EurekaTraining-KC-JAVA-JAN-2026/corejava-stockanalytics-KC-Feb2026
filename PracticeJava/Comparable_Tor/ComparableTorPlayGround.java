package PracticeJava.Comparable_Tor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTorPlayGround {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(new BigDecimal(1234567),"Hari",26012.00));
        employeeList.add(new Employee(new BigDecimal(123456),"Harish",26000.00));
        //Collections.sort(employeeList);
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println(employeeList);
    }
}
