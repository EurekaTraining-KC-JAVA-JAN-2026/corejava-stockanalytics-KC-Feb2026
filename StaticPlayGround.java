public class StaticPlayGround {
    public static int tyres = 4;        // Statics comes at class level    // Created static variable
    public static String move(){        // Static method at class level
        System.out.println("Moving Forward");
        return "";
    }

   public static void main(String[] args) {
       System.out.println("starting from main method");
       move();
   }
}

