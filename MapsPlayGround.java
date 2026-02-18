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
    }
}
