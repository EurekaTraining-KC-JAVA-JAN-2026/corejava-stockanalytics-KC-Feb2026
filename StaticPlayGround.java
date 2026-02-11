public class StaticPlayGround {
    public static int tyres = 4; //static variable
    public static void move(){ //static method at class level
        System.out.println("Moving forward");
    }

    public static void main(String[] args) {
        System.out.println("starting from main method");
        move();
    }
}
