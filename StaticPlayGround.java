public class StaticPlayGround {

        public static int types = 4; // static variable
        int values=3;
        // static method
        public static void move() {
            System.out.println("moving forward");
        }
        public static void main(String[] args) {
            System.out.println("Explaining static");
            move(); // calling static method
            System.out.println(StaticPlayGround.types);
            StaticPlayGround s1=new StaticPlayGround();
            System.out.println(s1.values);
        }
    }

