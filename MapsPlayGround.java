import java.util.HashMap;
import java.util.Map;

public class MapsPlayGround {
    public static void main(String[] args) {
        Map<String ,String> mapStock=new HashMap<>();
        mapStock.put("AMD","Advanced Micro services");
        mapStock.put("GOOG","Google");
        mapStock.put("MSFT","Microsoft");
        System.out.println(mapStock);
        System.out.println(mapStock.get("AMD"));
        System.out.println(mapStock.containsKey("AMD"));



    }
}
