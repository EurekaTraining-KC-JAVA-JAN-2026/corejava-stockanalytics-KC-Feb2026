public class StaticPlayGround {
    private static int tyres = 4; //static variable - class level
    String color; //instance variable - object level
    public static void move(){ //instance method
        System.out.println("Moving Forward");

    }
    public static void main(String[] args) {
        System.out.println("Explaining Static");
        move();
    }
}
