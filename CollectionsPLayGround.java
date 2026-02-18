import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPLayGround {
    public static void main (String[] args){

        ArrayList<String> tickerList = new ArrayList<>();  // one way to create Array list
        List<String> tickerList1 =new ArrayList<>();        // another way to create Array list (mainly used)

        tickerList1.add("MIFT");
        tickerList1.add("AMD");
        tickerList1.add("AAPL");
        tickerList1.add("TSLA");
        System.out.println("items in list: " + tickerList1);
        String s = tickerList1.get(1);
        System.out.println("value of the index1 is: " +s);
        tickerList1.remove("TSLA");
        System.out.println("items in list: " + tickerList1);
        tickerList1.add("MIFT");
        System.out.println(tickerList1);
        System.out.println("size of an tickerlist after adding MSFT: " + tickerList1.size());
        List<String> anotherList = new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickerList1.addAll(anotherList);
        System.out.println("After adding another collection: "+tickerList1);
        tickerList1.addFirst("3MCARE");
        tickerList1.addLast("IYLLY");
        System.out.println("After adding at 1st nd Nth pos: " + tickerList1);
        boolean amex = tickerList1.contains("amex");
        System.out.println("Does tickerList1 contains AMEX: " +amex);
        List<String> anotherList1 = new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean and = anotherList1.equals(anotherList1);
        System.out.println("Does tickerList1 equals to anotherList: " +and);
        tickerList1.removeAll(anotherList);
        System.out.println("After removing the anotherList: " +tickerList1);
        Collections.sort(tickerList1);
        System.out.println("After sorting: "+ tickerList1);

        // custom list

        List<Day2> stockList = new ArrayList<>();
        stockList.add(new Day2("AAPL",34));
        stockList.add(new Day2("AMD",23));
        stockList.add(new Day2("TSLA",43));
        stockList.add(new Day2("3MCARE",34));
        System.out.println(stockList);

        // wrapper class

        int i =47; //primitive
        Integer objInt1 = (Integer) i; //typical typecasting from integer to int
        Integer objInt =34; // non-primitive
        List<Integer> integers = List.of (2,3,4);
            int i1;
            Integer j;
            boolean k;
            Boolean k2;
            double d;
            Double d1;
            byte c;
            Byte c1;
            char e;
            Character e1;
//        boolean add = integers.add(7);
//        System.out.println(add);
        System.out.println(integers);
        List<Integer> integers1 = new ArrayList<>();
        boolean contains = integers1.contains(43);
        System.out.println(contains);










    }
}
