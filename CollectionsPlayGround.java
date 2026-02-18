import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {

    public static void main(String args[]) {
        ArrayList<String> tickerList = new ArrayList<>();
        //above is one way to create the arrayList.
        //this is not mostly used


        //Another way of creating an arrayList.
        //This is the syntax which is mostly used.
        List<String> tickerList1 = new ArrayList<>();

        tickerList1.add("AAPL");
        tickerList1.add("AMD");
        tickerList1.add("TSLA");
        tickerList1.add("MSFT");

        System.out.println("Items in the list: " + tickerList1);
        System.out.println("Value of index 1 is : " + tickerList1.get(1));
        System.out.println("Removing value MSFT " + tickerList1.remove("MSFT"));
        System.out.println("After removing : " +tickerList1);
        tickerList1.add("MSFT"); //List follows Insertion order.

       System.out.println("Size of the list is : " + tickerList1.size());

       List<String> anotherList = new ArrayList<>();
       anotherList.add("Goog");
       anotherList.add("AMEX");

       tickerList1.addAll(anotherList);
       System.out.println("After adding another collections : " + tickerList1);

       tickerList1.addFirst("JMCARE");
       tickerList1.addLast("IYLLY");
       System.out.println("After adding ar 1st and nth pos :  " +tickerList1);

       System.out.println("Does the list contain AMEX ? : " + tickerList1.contains("AMEX"));

       System.out.println("Does tickerList1 equals to AMD ? : " + tickerList1.equals("AMD"));

       System.out.println(tickerList1.equals(tickerList));

       System.out.println(tickerList1.removeAll(anotherList));
       System.out.println("After removing the anotherList: " +tickerList1);

        Collections.sort(tickerList1); //sort is an static method


        /**
         * now lets create custom list object
         */

        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL", 34));
        stockList.add(new Stock("AMD", 23));
        stockList.add(new Stock("TSLA", 43));
        stockList.add(new Stock("JMCARE", 25));

        System.out.println(stockList);

        for (int i = 0; i < stockList.size(); i++) {
            System.out.println(stockList.get(i));
        }
        for(Stock stock : stockList) {
            System.out.println(stock);
        }

        int a = 23;
        Integer obj = (Integer)a; //Traditional way of doing the typeCast

        Integer obj1 = 34; //non-primitive

        List<Integer> integers = List.of(2,3,4);
        //integers.add(7);
        System.out.println(integers);

        List<Integer> integers1 = new ArrayList<>();

        boolean contain = integers1.contains(43);
        System.out.println(contain);
    }

}
