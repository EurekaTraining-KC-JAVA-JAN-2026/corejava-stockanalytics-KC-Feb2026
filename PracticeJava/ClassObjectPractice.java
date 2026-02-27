package PracticeJava;

import java.sql.SQLOutput;

class Car{
   private String brand;
   private int speed;

    public Car() {
        this("Toyota",10);
        System.out.println("Car Object Created");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int speed) {
        System.out.println("This is called from no parameter constructor");
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}

public class ClassObjectPractice {

    public static void main(String[] args) {
        Car car1 = new Car();
        //Car car = new Car("Toyota", 50);
        System.out.println(car1);
        //System.out.println(car);
    }
}