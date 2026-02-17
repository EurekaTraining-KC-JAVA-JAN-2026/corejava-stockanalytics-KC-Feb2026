package inheritence.MultiLevel;

public abstract class Vehicle {
        //Commons methods
        public  void start() {
            System.out.println("Moves only when started.");
        }

        public void stop() {
            System.out.println("Slows down/stops when we brake.");
        }

        public void numberOfWheels() {
            System.out.println("Every car has 4 wheels.");
        }

        //common between Vehicle and Car
        public abstract void doors();


    }

