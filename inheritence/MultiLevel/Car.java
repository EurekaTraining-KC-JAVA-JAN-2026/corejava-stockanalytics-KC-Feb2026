package inheritence.MultiLevel;

import inheritence.SingleInheritance.Vehicle;

public class Car extends Vehicle {

    public void doors() {
        System.out.println("Every common car has 4 doors");
    }

    public  void sunroof() {
        System.out.println("Most of the cars and sportscar have sunroof");
    }
}
