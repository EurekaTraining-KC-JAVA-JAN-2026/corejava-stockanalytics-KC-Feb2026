import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayGround {
    public static void main(String[] args){
        ArrayList<String> tickerList=new ArrayList<>();
        List<String> tickerList1=new ArrayList<>();
        tickerList1.add("AAPL");
        tickerList1.add("AMD");
        tickerList1.add("GOOG");
        tickerList1.add("TSLA");
        System.out.println("items in List :" +tickerList1);
        String s=tickerList1.get(1);
        System.out.println("value at index 1 is  :" +s);
        tickerList1.remove(2);
        tickerList1.add(2,"MSFT");
        System.out.println("items in list after updtaing is :" +tickerList1);
        System.out.println("items in list after adding MSFT is :" +tickerList1.size());
        List<String> anotherList=new ArrayList<>();
        anotherList.add("AMEX");
        anotherList.add("GOOG");
        tickerList1.addAll(anotherList);
        System.out.println("The list after adding another List :" +tickerList1);
        tickerList1.addFirst("MCARE");
        tickerList1.addLast("IYYLL");
        System.out.println("List after adding at fast and last :" +tickerList1);
        boolean aapl=tickerList1.contains("AAPL");
        System.out.println("Does TickerList contains aapl:"+aapl);
        List<String> anotherList1=new ArrayList<>();
        anotherList1.add("GOOG");
        anotherList1.add("AMEX");
        boolean amd=anotherList1.equals(anotherList);
        System.out.println("does anotherList equals to anotherlsit1 : " +amd);
        tickerList1.removeAll(anotherList);
        System.out.println("List after removing anotherList :" +tickerList1);
        Collections.sort(tickerList1);
        System.out.println("After sorting : " +tickerList1);



        List<Stock> stocksList=new ArrayList<>();
        stocksList.add(new Stock(34,"AAPL"));
        stocksList.add(new Stock(56,"GOOG"));
        stocksList.add(new Stock(38,"AMD"));
        stocksList.add(new Stock(48,"MSFT"));
        stocksList.add(new Stock(25,7,78));

        System.out.println("List of stocks :" +stocksList);


        for(int i =0;i<stocksList.size();i++){
            System.out.println(stocksList.get(i));
        }
//wrapper class

        int i =10;
        Integer j;
        boolean a;
        Boolean a1;
        char c;
        Character c1;
        Integer obj1=(Integer) i;//typeCasting
        Integer obj2=56;
        List<Integer> integers=List.of(2,5,7);//immutable
        System.out.println(integers);

        List<Integer> integers1=new ArrayList<>();


    }
}
