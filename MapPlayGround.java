import java.util.HashMap;
import java.util.Map;

public class MapPlayGround {
    public static void main(String[] args) {
       Map<String, String> mapstocks =new HashMap<>();
       mapstocks("AMD", "Advanced micro decices");
       mapstocks.put("AAPL", "apple inc");
       mapstocks.put("MSFT","microsoft");
        System.out.println(mapstocks);
        System.out.println(mapstocks.get("AMD"));



    }

    private static void mapstocks(String amd, String advancedMicroDecices) {
    }
}
