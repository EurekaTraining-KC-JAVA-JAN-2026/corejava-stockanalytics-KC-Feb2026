import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String,String> mapStock = new HashMap<>();
        //Map stores the key -value pair
        mapStock.put("AMD","Advanced micro Devices");
        mapStock.put("AAPL","Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA", "tesla INC");
        System.out.println(mapStock);

        System.out.println(mapStock.get("AMD"));

    }
}
