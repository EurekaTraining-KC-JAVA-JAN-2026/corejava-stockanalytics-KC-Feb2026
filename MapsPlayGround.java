import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String,String> mapStock =new HashMap<>();
        //map stores key-value pair
        mapStock.put("AMD","Advanced Micro Devices");
        mapStock.put("APPL","Apple INC");
        mapStock.put("MSFT","Microsoft");
        mapStock.put("TSLA","Tsla INC");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));

    }
}
