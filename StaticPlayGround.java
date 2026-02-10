public class StaticPlayGround {
    public static int tyres = 4; //only class level
    public static String move(){
        return "Moving Forward";
    }
    public static void main(String[] args){
        System.out.println("Starting from main method");
        move();
       // System.out.println(tyres);

    }

}
