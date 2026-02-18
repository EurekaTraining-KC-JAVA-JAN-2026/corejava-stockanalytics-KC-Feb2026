import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    static void main(String[] args) {
        Map<String,String> mapstock=new HashMap<>();
        mapstock.put("AMD","advanced Micro Devices");
        mapstock.put("AAPL","Apple Inc");
        mapstock.put("MSFT","Microsoft");
        mapstock.put("TSLA","Tesla stock");
        System.out.println(mapstock);
        System.out.println(mapstock.get("AMD"));
        // assignment explore methods

        System.out.println(mapstock.containsKey("AAPL"));
        System.out.println(mapstock.keySet());
        System.out.println(mapstock.size());
        System.out.println(mapstock.containsValue("Tesla stock"));
        System.out.println(mapstock.isEmpty());
        mapstock.put("ASD","new stock");
        
        //when we add the key->value pair through put it is automatically arranges it in the assending order.
        System.out.println(mapstock);
    }
}
