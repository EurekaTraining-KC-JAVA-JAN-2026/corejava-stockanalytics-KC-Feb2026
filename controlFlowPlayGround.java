import java.math.BigDecimal;

public class controlFlowPlayGround {
    public static void main(String[] args){
        int x=10;
        int y=20;
        boolean b= (x==y);
        //System.out.println("comparing the x and y using == is "+ b);


        if(b){
            System.out.println("X and Y are equal" +b);
        }
        else{
            System.out.println("X and Y are not equal "+ b);
        }


        int a=10;
        int c=20;
         int d=30;
         if((a+c)==d){
           System.out.println("from 1st if else statement");
         } else if ((a+c)>d) {
             System.out.println("from else-if statement");

         }
         else{
             System.out.println("else statement");
         }
        System.out.println("from ternary operater");
         double randomDouble=Math.random();
         if(randomDouble>0.5){
             System.out.println("random number is greater than 0.5:" +randomDouble);
         }
         else{
             System.out.println("random number is less than 0.5:" +randomDouble);
         }

         String something=randomDouble>0.5?"greater than 0.5":"lessthan 0.5";
        System.out.println(something);

        while(x>8){

            System.out.println("from while loop:" +x);
            x--;
        }


        //switch
      Stock sampleStock=new Stock(34,"AAPL");
        Stock samplestock2=new Stock(34,"AAPL");
        BigDecimal bd1 =new BigDecimal(345.9);
        BigDecimal bd2=new BigDecimal(345.9);

        System.out.println(bd1.equals(bd2));
        System.out.println(bd1==bd2);
        System.out.println(sampleStock==samplestock2);
        System.out.println(sampleStock.equals(samplestock2));
        randomStcokAdvice(sampleStock);
    }

    private static void randomStcokAdvice(Stock sampleStock) {
        switch(sampleStock.getTicker_symbol()){
            case "TLSA":
                System.out.println("SELL...IT");
                break;
            case "AMD":
                System.out.println("BUY... IT");
                break;
            case "AAPL":
                System.out.println("HOLD IT");
                break;
             default:
                 System.out.println("Market is not stable");

        }
    }
}
