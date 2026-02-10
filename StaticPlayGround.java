public class StaticPlayGround {
     public static int tyres = 4;
     public static void move(){
         System.out.println("Moving Forward");

         return ;
     }

    public static void main(String[] args) {
        System.out.println("Starting from main method");
        move();
    }
//    public static void main(String[] args) {
//     //   static int tyres = 4; // here it is getting error boz static comes at class level not object
//        System.out.println("Explaining Static");
//        System.out.println(tyres);
//    }


}
