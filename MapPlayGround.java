import java.util.HashMap;
import java.util.Map;

public class MapPlayGround {
    public static void main(String[] args)  {
       Map<String, String> mapstocks =new HashMap<>();
       mapstocks.put("AMD", "Advanced micro decices");
       mapstocks.put("AAPL", "apple inc");
       mapstocks.put("MSFT","microsoft");
        mapstocks.put("MSFT","microsoft company");
        mapstocks.put("Goog", "goog organization");
        System.out.println(mapstocks);
        System.out.println(mapstocks.get("AMD"));
        System.out.println(mapstocks.size());
        System.out.println(mapstocks.get("AAPL"));
        mapstocks.remove("Goog");
        System.out.println(mapstocks);
        mapstocks.put("Goog", "google organization");
        System.out.println(mapstocks);
        System.out.println(mapstocks.values());
        System.out.println(mapstocks.keySet());
        System.out.println(mapstocks.get("MSFT"));
        System.out.println(mapstocks.entrySet());
        System.out.println(mapstocks.hashCode());
        System.out.println(mapstocks.containsKey("Goog"));
        System.out.println(mapstocks.containsKey("ABC"));
        System.out.println(mapstocks.containsValue("google organization"));
        mapstocks.replace("MSFT","micro");
        System.out.println(mapstocks);
        mapstocks.replaceAll((k, v) -> v.toUpperCase());
        System.out.println(mapstocks);
        mapstocks.replaceAll((k ,v ) -> v.toLowerCase());
        System.out.println(mapstocks);
       mapstocks.getOrDefault("TSLA","hello");
        System.out.println(mapstocks);

        Map<String,String> mapstocks1=new HashMap<>();
      mapstocks1.put("nvda","nvda organization");
      mapstocks1.put("AAPL", "aapl solutions");
      mapstocks.putAll(mapstocks1);
        System.out.println(mapstocks);


        Map<stocks,stocks> stockslist1=new HashMap<>();
        stockslist1.put(new stocks("AAPL",23),new stocks("0.25",33));
        System.out.println(stockslist1);
        stockslist1.keySet();
        System.out.println(stockslist1);
        stockslist1.put(
                new stocks("aapl", 450320608, 23),
                new stocks("msft", 123456789, 10)
        );
        System.out.println(stockslist1);
        stockslist1.put(new stocks("NVDA",43),new stocks("TSLA",22));
        System.out.println(stockslist1);
        Map<String ,stocks> stocklist2 =new HashMap<>();
        stocklist2.put(new String("nvda"),new stocks("aapl",23));
        System.out.println(stocklist2);


    }
}
