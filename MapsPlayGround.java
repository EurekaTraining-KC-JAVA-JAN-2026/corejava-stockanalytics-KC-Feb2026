import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {

   public static void main(String[] args) {
       Map<String,String> mapStock = new HashMap<>();
       Map<String,String> mapStock1 = new HashMap<>();
       //Map stores the Key value pair
       mapStock.put("AMD","Advance Micro Devices");
       mapStock.put("AAPL","Apple INC");
       mapStock.put("MSFT","Microsoft");
       mapStock.put("TSLA","Tesla INC");
       mapStock1.put("GOOG","Google");
       System.out.println(mapStock);
       System.out.println(mapStock.get("AMD"));
       System.out.println(mapStock.get("MSFT"));
       System.out.println(mapStock.isEmpty());
       System.out.println(mapStock.values());
       System.out.println(mapStock.containsKey("AAPL"));
       System.out.println(mapStock.size());
       System.out.println(mapStock.remove("AMD"));
       System.out.println(mapStock.equals(mapStock1));
       System.out.println(mapStock1);
       mapStock1.clear();
       mapStock.putAll(mapStock1);
       System.out.println(mapStock);
       System.out.println(mapStock1);
       System.out.println(mapStock.hashCode());
       System.out.println(mapStock1);
       System.out.println(mapStock.getClass());
       System.out.println(mapStock.getOrDefault("APPL","Apple"));





    }
}
