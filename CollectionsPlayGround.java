import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args) {
        ArrayList<String> tickersList = new ArrayList<>();
        //this not famous way to use
        //above is one way to create the arrayList
        List<String> tickersList1 = new ArrayList<>();
        //this is the famous way to create
        //another way of creating am ArrayList
        //String s1 = "ABC";
        //String s2= new String("ABC");
        tickersList1.add("MSFT");
        tickersList1.add("AMD");
        tickersList1.add("APPL");
        tickersList1.add("TSLA");
        System.out.println("items in List : "+tickersList1);
        String s = tickersList1.get(1);
        System.out.println("Value at the index 1 is :"+s);
        tickersList1.remove("MSFT");
        System.out.println("After removing MSFT :"+tickersList1);
        tickersList1.add("MSFT");//it means LIST follows -INSERTION order
        System.out.println(tickersList1);
        System.out.println("Size of an tickerList1 after adding MSFT : "+tickersList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickersList1.addAll(anotherList);
        System.out.println("After adding another collection : "+tickersList1);
        tickersList1.addFirst("3MCARE");
        tickersList1.addLast("IYLLY");
        System.out.println("After adding at 1st and Nth pos. :"+ tickersList1);
        boolean amex = tickersList1.contains("amex");
        System.out.println("Does tickerList1 contains AMEX :" +amex);
        List<String> anotherList1 = new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean amd = anotherList.equals(anotherList1);
        System.out.println("Does anotherList equals to anotherList1:"+amd);
        tickersList1.removeAll(anotherList);
        System.out.println("After removing the anotherList :"+tickersList1);
        Collections.sort(tickersList1);//sort is an static method
        System.out.println("After sorting : "+tickersList1);

        /**
         * Now lets create custom list objects
         */
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("APPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",43));
        stockList.add(new Stock("3MCARE",34));
        stockList.add(new Stock("IYLLY",34,2.8));

       // System.out.println(stockList);

        for (int i = 0; i < stockList.size(); i++) {
           // System.out.println(stockList.get(i));
        }
        for (Stock stock : stockList) {
            //System.out.println(stock);
        }
//wrapper class
        int i = 47; //primitve
        Integer objInt1 = (Integer) i; //typical typecasting from Integer to Int
        Integer objInt = 34;//non-primitive
        List<Integer> integers = List.of(2, 3, 4);
        int i1;
        Integer j;
        boolean k;
        Boolean k1;
        char c;
        Character c1;
        double d;
        Double d1;
        byte b;
        Byte b1;
        //boolean add = integers.add(7);
        //System.out.println(add);
        System.out.println(integers);
        List<Integer> integers1 = new ArrayList<>();
        boolean contains = integers1.contains(43);
        System.out.println(contains);


    }
}
