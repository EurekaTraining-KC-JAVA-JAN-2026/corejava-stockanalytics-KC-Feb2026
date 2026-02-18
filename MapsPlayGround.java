import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        //map stores key-value pair
        Map<String,String> mapStock = new HashMap<>();
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("AAPL", "Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tsla INC");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
    }
}
