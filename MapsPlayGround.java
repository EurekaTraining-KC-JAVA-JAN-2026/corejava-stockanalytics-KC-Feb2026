import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String,String> mapStock =new HashMap<>();
        Map<String,String> mapStock1 =new HashMap<>();
        //map stores key-value pair
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("APPL","Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tsla INC");
        mapStock1.put("NVDA","Nvidia");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
        System.out.println(mapStock.get("APPL"));
        System.out.println(mapStock.size());
        System.out.println(mapStock.containsKey("TSLA"));
        System.out.println(mapStock.isEmpty());
        System.out.println(mapStock.values());
        System.out.println(mapStock.equals(mapStock1));
        System.out.println(mapStock.remove("MSFT"));
        System.out.println(mapStock);
        mapStock.clear();
        System.out.println(mapStock);
        mapStock.put("APPL","Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tsla INC");
        System.out.println(mapStock.getOrDefault("TSLA","Tsla INC"));
        System.out.println(mapStock);
    }
}
