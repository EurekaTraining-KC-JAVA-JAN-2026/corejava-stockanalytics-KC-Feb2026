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
        System.out.println(mapStock.put("JPM","JPMORGAN CHASE $CO"));
        Map<String,String> mapStock1 = new HashMap<>();
        mapStock1.put("GOOG","GOOGLE INC");
        mapStock1.put("KSS","KHOLS CRP");
        mapStock1.put("M","Macy's Inc");
        System.out.println(mapStock.equals(mapStock1));
        System.out.println(mapStock);
        System.out.println(mapStock1);
        System.out.println(mapStock1.get("M"));
        System.out.println(mapStock.size());
        System.out.println(mapStock1.entrySet());
        mapStock1.clear();
        System.out.println(mapStock1);
        mapStock1.put("NKE","NIKE");
        mapStock1.put("NVR","NVR INC");
        mapStock1.put("OLO","OLO INC");
        Map<String,Integer> mapStock2 = new HashMap<>();
        mapStock2.put("one",1);
        mapStock2.put("thirty",30);
        System.out.println(mapStock2);
        mapStock1.putAll(mapStock);
        System.out.println(mapStock1);
        mapStock2.clear();
        System.out.println(mapStock2);



    }
}
