public class StaticPlayGround {
    public static int tyres = 4; //static variable
    public static void move(){ // Static method at class level
        System.out.println("Moving Forward");
    }

    public static void main(String[] args) {
        System.out.println("starting from main method");
        move();
    }

}
