import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickerslist = new ArrayList<>();
       //
        //above is one way to create the arrayList
        List<String> tickersList1 = new ArrayList<>();
        //this is the famous way to create
        //Another way of creating an array list
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("AAPL");
        tickersList1.add("TSLA");
        System.out.println("items in list : " +tickersList1);
        String s = tickersList1.get(1);
        System.out.println("Value at the index 1 is :" +s);
        tickersList1.remove("MSFY");
        System.out.println("After removing MSFT :" +tickersList1);
        tickersList1.add("MSFT");
        System.out.println(tickersList1);
        System.out.println("Size of an tickerlist1 after adding MSFT : "+tickersList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("'AMEX");
        tickersList1.addAll(anotherList);
        System.out.println("After adding another collection : "+tickersList1);
        tickersList1.addFirst("3MCARE");
        tickersList1.addLast("IYLLY");

        System.out.println("After adding the 1st and nth pos :" +tickersList1);
        boolean amex = tickersList1.contains("amex");
        System.out.println("Does tickerlist1 cointain AMEX :" +amex);
        boolean amd = tickerslist.equals("AMD");
        System.out.println("Does tickerList1 contains AMEX :" +amex);
        tickersList1.removeAll(anotherList);System.out.println("After removing the anotherList :" +tickersList1);
        Collections.sort(tickersList1);
        System.out.println("After sorting : "+tickersList1);

        /**
         * Now lets create a custom list objects
         */
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",43));
        stockList.add(new Stock("3MCARE",34));
        stockList.add(new Stock("NVDA", 56));
        stockList.add(new Stock("ILLY",34 ));
        //System.out.println(stockList);
        for(int i = 0;i< stockList.size();i++)
        {
            //System.out.println(stockList.get(i));
        }
        for (Stock stock : stockList) {
            //System.out.println(stock);
        }
        //System.out.println(stockList);
        // wrapper class
        List<Integer> integers= List.of(2,3,4); // immutable list
        Integer objInt = 34; // primitive
        int i = 45;
        Integer objInt1 = (Integer) i; // typical forecasting from Integer to int
        //integers.add(5); -- will throw an error
        //boolean add = integers.add(7);
        //System.out.println(add);
        boolean k;
        Boolean k1;
        char c;
        Character c2;
        double d;
        Double d2;
        byte b;
        Byte b1;
        List<Integer> integers1 = new ArrayList<>();
        System.out.println(integers1.contains(43));
        }

}
