public class StaticPlayGround {
    public static int tyres = 4;
    public static void move(){
        System.out.println("Moving Forward");
    }
    static{
        System.out.println("this is a static code block");
    }

    static void main(String[] args) {
        System.out.println("starting from main method");
        move();
    }
}