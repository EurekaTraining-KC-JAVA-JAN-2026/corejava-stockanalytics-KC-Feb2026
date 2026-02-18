import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String args[]) {
        Map<String,String> mapStock= new HashMap<>();
        Map<String,String> mapStock2= new HashMap<>();
        mapStock.put("AMD", "Advanced micro Devices");
        mapStock.put("APPL", "Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tsla INC");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD")); //retriveing element at a key
        mapStock.remove("TSLA");
        System.out.println("after removing TSLA :"+mapStock);
        System.out.println("size of the mapstock: "+mapStock.size());
        mapStock.put("TSLA","Tsla INC MGMT");
        System.out.println(mapStock);
        System.out.println("size of the mapstock: "+mapStock.size());

        mapStock2.put("EUR","Eureka INC");
        mapStock2.put("VET","VetraTEK inc");
        System.out.println(mapStock2);
        mapStock.putAll(mapStock2);
        System.out.println(mapStock + "  size is :"+mapStock.size());
        boolean and=mapStock.equals(mapStock2);
        System.out.println(and);
        boolean key= mapStock.containsKey("VET");
        boolean value= mapStock.containsValue("VetraTEK inc");
        System.out.println("does the key VET exist? : " +key);
        System.out.println("does the key VetraTEK inc exist? : " +value);
        mapStock2.put("VET","VetraTEK");
        System.out.println(mapStock2);
        mapStock.putAll(mapStock2);
        System.out.println(mapStock + "  size is :"+mapStock.size());
        mapStock.remove("VET");
        System.out.println(mapStock + "  size is :"+mapStock.size());
        mapStock.keySet().removeAll(mapStock2.keySet());
        System.out.println(mapStock + "  size is :"+mapStock.size()); //removes all elements in mapStock with keys in mapStock2
        //we have removekey options aswell to explore.

        Map<String,Stock> stockHashMap  = new HashMap<>();
        stockHashMap.put("APPL", new Stock("APPL", 1000, 2.5));
        stockHashMap.put("AMD", new Stock("AMD", 8000, 1.8));
        stockHashMap.put("TSLA", new Stock("TSLA", 1500, 3.1));
        stockHashMap.put("MSFT", new Stock("MSFT", 2000, 2.9));

        //only values
        System.out.println("only values:");
        for (Stock stock : stockHashMap.values()) {
            System.out.println(stock);
        }
        //both key and values
        System.out.println("only key and values:");
        for (String key1: stockHashMap.keySet()) {
            System.out.println("Key: " + key1 +
                    " Value: " + stockHashMap.get(key1));
        }
        //sum of marketCap
        long totalMarketCap = 0;

        for (Stock stock : stockHashMap.values()) {
            totalMarketCap += stock.getMarketCap();
        }

        System.out.println("Total Market Cap: " + totalMarketCap);


    }
}
