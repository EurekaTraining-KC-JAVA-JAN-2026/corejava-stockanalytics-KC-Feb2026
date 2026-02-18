import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionsPLayGround {
    public static void main(String[] args) {
        ArrayList<String> tickersList = new ArrayList<>();
        // abv is one way to create the arraylist
        List<String> tickersList1 = new ArrayList<>();
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("APPL");
        tickersList1.add("TSLA");
        System.out.println("items in list : "+tickersList1);

        String s = tickersList1.get(0);
        System.out.println("Value at the index 0 is : "+s);
        tickersList1.remove(0);
        System.out.println("items in list : "+tickersList1);
        tickersList1.add("MSFT");
        System.out.println("items in list : "+tickersList1);
        System.out.println(tickersList1.size());

        List<String> tickersList2 = new ArrayList<>();
        tickersList2.add("GOOG");
        tickersList2.add("nvda");
        tickersList1.addAll(tickersList2);
        System.out.println("items in list after adding another list  : "+tickersList1);
         System.out.println(tickersList1.size());

         List<String> tickersList3 = new ArrayList<>();
         tickersList3.add("GOOG");
         tickersList3.add("nvda");
         boolean amd = tickersList3.equals(tickersList2);
         System.out.println("Does another list equals to anotherlist: "+amd);
         tickersList1.removeAll(tickersList3);
         System.out.println("items in list after removing another list  : "+tickersList1);
         Collections.sort(tickersList1);
         System.out.println("After sorting : "+tickersList1);

        /**
         * Now lets
         */
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("appl", 34));
        stockList.add(new Stock("nvda", 34));
        stockList.add(new Stock("MSFT", 34));
        stockList.add(new Stock("GOOG", 34));

        System.out.println(stockList);
        for( Stock stock : stockList ){

            System.out.println(stock);
        }

        //wrapper class
        int i = 47;
        Integer objInt = 36;
        System.out.println(objInt);
        List<Integer> integers = List.of(1, 2, 3);
        System.out.println(integers);




    }
}
