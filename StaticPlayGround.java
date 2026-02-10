public class StaticPlayGround {

        public static int types = 4; // static variable

        // static method
        public static void move() {
            System.out.println("moving forward");
        }

        public static void main(String[] args) {
            System.out.println("Explaining static");
            move(); // calling static method
        }
    }

