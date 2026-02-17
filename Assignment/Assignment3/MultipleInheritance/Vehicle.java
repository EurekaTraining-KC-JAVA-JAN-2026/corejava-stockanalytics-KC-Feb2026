package Assignment.Assignment3.MultipleInheritance;

public class Vehicle implements Car, Bike{
    @Override
    public void kickStart() {
        System.out.println("Bike starts using kick rod");
    }

    @Override
    public void gear() {
        System.out.println("Bike speeds up only when we kick in the gear");
    }

    @Override
    public void startEngine() {
        System.out.println("We have turn on the Engine first to use.");
    }

    @Override
    public void lockDoors() {
        System.out.println("We have to lock the doors to move forward");
    }
}
