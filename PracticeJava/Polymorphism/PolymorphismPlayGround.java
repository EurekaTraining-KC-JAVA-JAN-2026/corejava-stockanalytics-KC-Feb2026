package PracticeJava.Polymorphism;

public class PolymorphismPlayGround {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
        Employee e = new Developer();
        e.calculateSalary();
    }
}
