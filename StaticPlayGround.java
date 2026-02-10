public class StaticPlayGround {
      private static int tyres=4;

    public static String move(){
          return "Moving Forward";
       }
    //instances are at object level whereas statics are at class level
    // In java numbers and allothers are treated as sequence of charcters so we use string arrray  arguments in main method
    public static void main(String[] args){
        System.out.println("Move Forward");
    }

}
