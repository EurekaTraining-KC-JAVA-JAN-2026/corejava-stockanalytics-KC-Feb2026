public class ArraysPlayGround {
    public static void main(String[] args) {
      int i = 10;
      String s1 = "Eureka";
     // arrays on primitives and non primitives
        // dynamic size
      int[] numArray =  new int[]{10,20,40,60};
      System.out.println(numArray);
      int[] numArray2 = {1,2,3,4,5};
      System.out.println(numArray2);
      System.out.println(numArray2.length);
      for(int a = 0; a < numArray2.length; a = a+2)
      {
          System.out.println(numArray2[a]);
      }
      System.out.println(numArray2[0]);
      System.out.println(numArray2[1]);
      System.out.println(numArray2[2]);
      System.out.println(numArray2[3]);
      System.out.println(numArray2[4]);
      System.out.println("For each");
      for(int k : numArray2)
        {
            System.out.println(k);
        }







    }
}
