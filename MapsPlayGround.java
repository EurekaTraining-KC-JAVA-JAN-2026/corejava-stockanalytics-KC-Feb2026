import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args)
    {
        Map<String,String> mapStock = new HashMap<>();
        mapStock.put("AMD","Advanced micro devices");
        mapStock.put("AAPL","Apple Inc");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tesla Inc");

        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));

    }
}
