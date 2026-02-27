package PracticeJava.CollectionsPractice;

import java.util.HashSet;
import java.util.Set;

public class CollectionsPlayGround {
    public static void main(String[] args) {

        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(new Employee(1234,"Hari"));
        employeeSet.add(new Employee(1234,"Hari"));
        System.out.println(employeeSet);
    }
}
