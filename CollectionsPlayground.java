import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class CollectionsPlayground {
    public static void main(String[] args) {
        ArrayList<String> tickerList=new ArrayList<>();
        //this is not famous
        //above is one way to create the array list
        List<String> tickerList1=new ArrayList<>();
        //this is the famous way to create
        //another way of creating an Arraylist
        tickerList1.add("MSFT");
        tickerList1.add("AMD");
        tickerList1.add("APPL");
        tickerList1.add("TSLA");
        System.out.println("items in list : "+tickerList1);
        String s=tickerList1.get(1);
        System.out.println("Value at  the index 1 is :"+s);
        tickerList1.remove("MSFT");
        System.out.println("after removing MSFT: "+tickerList1);
        tickerList1.add("MSFT");
        System.out.println("size of a tickerlist after adding MSFT: "+tickerList1.size());
        List<String> anotherList=new ArrayList<>();
        anotherList.add("GOOG");
        anotherList.add("AMEX");
        tickerList1.addAll(anotherList);
        System.out.println("after adding another collection : " +tickerList1);
        tickerList1.addFirst("AUDI");
        tickerList1.addLast("HONA");
        System.out.println("after adding 1st and last pos: "+tickerList1);
        boolean amex= tickerList1.contains("amex");
        System.out.println( "dOES TICKERlIST1 CONTAINS AMEX: " +amex);
        List<String> anotherList1=new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean and=anotherList1.equals(anotherList);
        System.out.println("does anotherlist1 and anotherlist match: "+and);
        System.out.println("Before Removing :"+tickerList1);
        tickerList1.removeAll(anotherList);
        System.out.println("After removing :"+tickerList1);


          //
        List<Stock> stockList=new ArrayList<>();
        stockList.add(new Stock("APPL",34));
        stockList.add(new Stock("AMD",23));
        stockList.add(new Stock("TSLA",43));
        stockList.add(new Stock("3MCARE",34));
        stockList.add(new Stock("IYLLY",34,2.8));
        //System.out.println(stockList);
        for(int i=0;i<stockList.size();i++){
            System.out.println(stockList.get(i));
        }
        for(Stock stock: stockList){
            System.out.println(stock);
        }
        //wrapper class
        List<Integer> integers=List.of(2,3,4); //immutable
        int i;
        Integer j;
        boolean k;
        Boolean k1;
        char c;
        Character c1;
        double d;
        Double d1;
        byte b;
        Byte b1;
        //boolean add=integers.add(7);
        System.out.println(integers);
        List<Integer> integers1=new ArrayList<>();



    }
}
