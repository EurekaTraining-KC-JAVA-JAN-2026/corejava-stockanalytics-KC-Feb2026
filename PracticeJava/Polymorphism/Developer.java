package PracticeJava.Polymorphism;

public class Developer  extends Employee{
    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("From Developer clas");
    }
}
