import java.math.BigDecimal;

public class ControlFlowPlayGround {
    public static void main(String[] args){
        int x=10; /// assigning value
        int y=20; //assigning valur
        //if equals return tru if not equal return false
         boolean b = (x==y);
        System.out.println("comparing x and y using =="+b);
   //if-else
        if(!b) {
            System.out.println("x and y are equal"+b);
        }
        else{
            System.out.println("x and y are not equal" +b);
        }
        System.out.println("from else if blokck");
        int a=20;
        int c=20;
        int d=30;
        if((a+c)==d){
            System.out.println("from 1st if statement");
        }
        else if((a+c)>d){
            System.out.println("from 2nd elseif");
        }
        else{
            System.out.println("from the defaulti block");
        }
        //ternaray operators
        double randomDouble = Math.random();
        if(randomDouble> 0.5){
           // System.out.println("random number is greate that 0.5" +randomDouble);
        }
        else{
           // System.out.println("random number i sless than 0.5" +randomDouble);
        }
        String somestring = (randomDouble>0.5) ? "greater than 0.5" : "less than 0.5";
        System.out.println(somestring);
   //while loop it a infitinite loop
        //if you how how long to run the loop use for or for each
        //if not then go for while
        while(x>8){
            System.out.println("true will always be true : " +x);
            x--;
        }
        //switch blocks
        stocks sampleStock= new stocks("APPL", 34);
        stocks sampleStock2= new stocks("APPL", 34);
        BigDecimal bd1 = new BigDecimal(30.5);
        BigDecimal bd12= new BigDecimal(30.5);

//        randomStockAdvice(sampleStock);
        int num1=10;
        int num2=20;
        //primitives
        //non primitives we have .equals
        System.out.println(num1==num2);
        System.out.println(sampleStock.equals(sampleStock2));
        System.out.println(bd1.equals(bd12));
    }
 private static void  randomStockAdvice(stocks samplestock){
        switch(samplestock.getTickersymbol()){
            case "TSLA":
                System.out.println("sell ..it");
                break;
            case "NVDA" :
                System.out.println("buy it");
                break;
            case "APPL":
                System.out.println("hold it");
                break;
            default:
                System.out.println("market is not stable");
        }

 }
}
