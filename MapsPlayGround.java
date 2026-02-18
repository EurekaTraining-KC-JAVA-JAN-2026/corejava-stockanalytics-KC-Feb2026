import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {

   public static void main(String[] args) {
       Map<String,String> mapStock = new HashMap<>();
       //Map stores the Key value pair
       mapStock.put("AMD","Advance Micro Devices");
       mapStock.put("AAPL","Apple INC");
       mapStock.put("MSFT","Microsoft");
       mapStock.put("TSLA","Tesla INC");
       System.out.println(mapStock);
       System.out.println(mapStock.get("AMD"));


    }
}
