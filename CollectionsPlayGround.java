import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        // Syntax for creating new array list
        ArrayList<String> tickersList = new ArrayList<>();
        // Another way to create (we are calling the Interface of the List)
        // This is the famous way to create(List Interface)
        List<String> tickersList1 = new ArrayList<>();
//        String s1 = "ABC";
//        String s2 = new String("ABC");
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("AAPL");
        tickersList1.add("TSLA");
        System.out.println("Items in List: "+tickersList1);

        // Because in somewhere in hirer we are getting from collections(it was overriding in between them) -> For Above Result
        // It has their own string method.

        String s = tickersList1.get(1);
        System.out.println("Value at the index 1 is : "+s);
        tickersList1.remove("MSFT");
        System.out.println("After removing MSFT : "+tickersList1);
        tickersList1.add("MSFT"); // It means LIST follows - INSERTION Order
        System.out.println(tickersList1);
        System.out.println("Size of an tickerList1 after adding MSFT : "+tickersList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickersList1.addAll(anotherList); // AnotherList is appended to the list
        System.out.println("After adding another collection : "+tickersList1);
        tickersList1.addFirst("3MCARE");
        tickersList1.addLast("ILLY");
        System.out.println("After adding at 1st and Nth pos. : "+tickersList1);
        boolean amex = tickersList1.contains("AMEX");
        System.out.println("Does tickerList1 contains AMEX : "+amex);
        List<String> anotherList1 = new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean amd = tickersList1.equals(anotherList1);
        System.out.println("Does tickerList1 contains AMD : "+amd);
        tickersList1.removeAll(anotherList);
        System.out.println("After removing the anotherList : "+tickersList1);
        Collections.sort(tickersList1);   // Sort is an static method
        System.out.println("After sorting : "+tickersList1);


        /**
         * Now lets create custom list objects
         */
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("APPL", 34));
        stockList.add(new Stock("AMD", 23));
        stockList.add(new Stock("TSLA", 43));
        stockList.add(new Stock("3MCARE", 34));
        stockList.add(new Stock("MSFT", 51));
        System.out.println(stockList);

        for (int i =0;i< stockList.size();i++){
            // System.out.println(stockList.get(i));
        }
        for (Stock stock : stockList){
            // System.out.println(stock);

        }
        // wrapper class
        int i = 47; // Primitive
        Integer objInt1 = (Integer) i;           // typical typecasting from Integer to Int
        Integer objInt =34; // Non-primitive
        List<Integer> integers = List.of(2,3,4); // Integers are noting but wrapper classes
        Integer j;
        boolean k;
        Boolean k1;
        char c;
        Character c1;
        double d;
        Double d1;
        byte b;
        Byte b1;
        // boolean add = integers.add(7);
        // System.out.println(add);
        System.out.println(integers);

        List<Integer> integers1 = new ArrayList<>();
        boolean contains = integers.contains(43);
        System.out.println(contains);
    }
}
