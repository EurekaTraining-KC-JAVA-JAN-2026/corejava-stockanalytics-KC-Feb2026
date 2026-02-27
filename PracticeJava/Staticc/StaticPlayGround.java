package PracticeJava.Staticc;

public class StaticPlayGround {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee.companyId = 1002;
        System.out.println(employee.companyId);
        System.out.println(employee1.companyId);
        System.out.println(employee2.companyId);
    }
}
