import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPlayGround {
   public static void main(String[] args) {
       ArrayList<String> tickerList=new ArrayList<>();
       //above is one way to creat the arraylist//class
       List<String> tickerList1 =new ArrayList<>();
       //this is famous way to create// abstract collection will print values bcz  arraylist have their own tostring method() whic is overriding
       //another way of creating an arraylist //interface
    tickerList1.add("MSFT");
    tickerList1.add("AMD");
    tickerList1.add("APPL");
    tickerList1.add("TSLA");
    System.out.println("items in list: "+tickerList1);
    String s =tickerList1.get(1);
    System.out.println("values at the 1st index is :"  +s);
   tickerList1.remove("MSFT");
       System.out.println("after removing the msft: " +tickerList1);
   tickerList1.add("MSFT");
       System.out.println("size of tickerlistq after adding msft: " +tickerList1.size());
List<String> anotherList=new ArrayList<>();
       anotherList.add("GOOG");
       anotherList.add("AMEX");
       tickerList1.addAll(anotherList);
       System.out.println("after adding ticker list these are the values"+tickerList1);
       tickerList1.addFirst("3MCARE");
       tickerList1.addLast("IYLLY");
       System.out.println("after adding 1st and last" +tickerList1);
       boolean amex=tickerList1.contains("AMEX");
       System.out.println("does tickerlist1 contain amex:"+amex);
          boolean amd=tickerList1.equals("AMD");
       System.out.println("does tickerlist eqauls to amd"+amd);
     tickerList1.removeAll(anotherList);
     System.out.println("after removing anotherlist"+tickerList1);
       Collections.sort(tickerList1);
       System.out.println("after sorting:"+tickerList1);
   //now lets custom list object
   List<stocks> stockList=new ArrayList<>();
       stockList.add(new stocks("APPL", 34));
       stockList.add(new stocks("TSLA",43));
       stockList.add(new stocks("AMD",23));
       stockList.add(new stocks("3MCARE", 32));
       System.out.println(stockList);
        stockList.add(new stocks("IYLLY",32));
/// /
//       for(int i=0;i< stockList.size();i++){
//           System.out.println(stockList.get(i));
//       }
//       for(stocks stock ){
//           System.out.println(stocks);
//       }
       int i=40;
       Integer objint1=(Integer)i;
       Integer onjint=30;
       List<Integer> integers=  List.of(2,3,4);
       int i1;
       Integer j;
       boolean k;
       Boolean k1;
       char c;
       Character c11;
       double d;
       Double dd;

       System.out.println(integers);
       //integers.add(6);
       System.out.println(integers);
       List<Integer> integers1 =new ArrayList<>();
//       boolean b1= integers1.contains(43);
//       System.out.println(contains);

   }
}
