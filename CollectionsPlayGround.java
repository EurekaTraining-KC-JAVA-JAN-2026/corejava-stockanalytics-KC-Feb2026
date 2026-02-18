import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickersList = new ArrayList<>();
        // this is not famous way to use
        //above is one way to create the arraylist
        List<String> tickerslist1 = new ArrayList<>();
        //this is the famous way to create
        //another way of creating an arrayList
        tickerslist1.add("MSFT");
        tickerslist1.add("AMD");
        tickerslist1.add("AAPL");
        tickerslist1.add("TSLA");
        System.out.println("items in List : "+tickerslist1);
        String s = tickerslist1.get(1);
        System.out.println("Value at the index 1 is : "+s);
        tickerslist1.remove("MSFT");
        System.out.println("After removing MSFT :"+tickerslist1);
        tickerslist1.add("MSFT");//it means LIST follows INSERTION order
        System.out.println("Size of an tickerList1 after adding MSFT : "+tickerslist1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickerslist1.addAll(anotherList);
        System.out.println("After adding another collection :"+tickerslist1);
        tickerslist1.addFirst("3MCARE");
        tickerslist1.addLast("IYLLY");
        System.out.println("After adding at !st and Nth pos :"+tickerslist1);
        boolean amex = tickerslist1.contains("AMEX");
        System.out.println("Does tickerList1 contains AMEX :" +amex);
        boolean amd = tickerslist1.equals("AMD");
        System.out.println("Does tickerList1 equals to AMD :" +amd);
        tickerslist1.removeAll(anotherList);
        System.out.println("After removing the anotherList :"+tickerslist1);
        Collections.sort(tickerslist1);//sort is an static method
        System.out.println("After sorting : "+tickerslist1);

        /**
         * Now lets create custom list objects
         */
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",43));
        stockList.add(new Stock("3MCARE",34));


        //System.out.println(stockList);

       //wrapper classes
        int i = 47; //primitive
        Integer objInt1 = (Integer) i; // typical tyecasting from integer to Int
        Integer objInt = 34;//non-primitive
        List<Integer> integers =  List.of(2,3,4);
        //int ;
        Integer j;
        boolean k;
        Boolean k1;
        char c;
        Character c1;
        double d;
        Double d1;
        byte b;
        Byte b1;
       // integers.add(7);
        System.out.println(integers);
        List<Integer> integers1 = new ArrayList<>();
        boolean contains = integers1.contains(43);
        System.out.println(contains);




    }
}
