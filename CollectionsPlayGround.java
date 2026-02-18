import java.util.ArrayList;
import java.util.List;

    public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickersList = new ArrayList<>();
        //this is not a famous way to use
        //above is one way to create a arrayList
        List<String> tickersList1 = new ArrayList<>();
        //this is the famous way to create
        //another way of creating an ArrayList
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("AAPL");
        tickersList1.add("TSLA");
        System.out.println("Items in List : " +tickersList1);
        //this out comes in [a,b,c] because it already has the toString over-ridden
        String s = tickersList1.get(1);
        System.out.println("Value of the index at 1 is : " +s);
        tickersList1.remove("MSFT");
        System.out.println("After removing MSFT" +tickersList1);
        tickersList1.add("MSFT");//it mean LIST follows INSERTION order
        System.out.println(tickersList1);
        System.out.println("Size of a tickerList1 after adding MSFT : " +tickersList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickersList1.addAll(anotherList);
        System.out.println("After adding another collection : " +tickersList1);
        tickersList1.addFirst("3MCARE");
        tickersList1.addLast("IYLLY");
        System.out.println("After adding 1st and nth pos : " +tickersList1);
        boolean amex = tickersList1.contains("AMEX");
        System.out.println("Does tickerList1 have AMEX: " +amex);
        tickersList1.equals("AMD");
        boolean amd = anotherList.equals(anotherList);
        System.out.println("Does tickerList1 equals to AMD : " +amd);
        tickersList1.removeAll(anotherList);
        System.out.println("After removing the anotherList : " +tickersList1);


        /**
         * now create custom list objects below
         *
         */


        List<Stock> stockList= new ArrayList<>(); //stock objects
        stockList.add(new Stock("AAPL",34)); //we are adding them
        stockList.add(new Stock("AMD", 23));
        stockList.add(new Stock("TSLA", 43));
        stockList.add(new Stock("3MCARE", 34));
        stockList.add(new Stock("IYLLY",34,2.8));

           List<Stock> stockList2= new ArrayList<>();
           stockList.add(new Stock("APPL,", 35));
        // System.out.println(stockList);

        for(int i = 0; i < stockList.size(); i++) {
            //System.out.println(stockList.get(i));

        }
        for(Stock stock: stockList){
           // System.out.println(stock);

        }
        //wrapper class
          int i=47; //primitive


          Integer objInt1=(Integer) i; //typecasting from integer to Int,
          Integer objInt= 34;  // non primitive

         List<Integer> integers =List.of(2,3,4);
         // we don't have to use new keyword like previous

        Integer j;//wrapper
        boolean k;
        Boolean k1;//wrapper class
        char c;
        Character c1;// wrappper class
        byte b;
        Byte b1;//

         boolean add = integers.add(7);
        System.out.println(add);  //if we are trying to create using listof, we get false ,no additions, they are immutable
        System.out.println(integers);
        List<Integer> integers1= new ArrayList<>();
        boolean contains =integers1.contains(43);












    }
}


















