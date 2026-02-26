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

        Map<Integer,String> mapInt = new HashMap<>();
        mapInt.put(1 , "one");
        mapInt.put(2 , "two");
        mapInt.put(3 , "three");
        mapInt.put(4 , "four");
        mapInt.put(5 , "five");
        mapInt.put(6 , "six");
        System.out.println(mapInt);

        System.out.println( mapInt.get(5));

//        mapInt.clear();
//        System.out.println(mapInt);
        System.out.println(mapInt.containsKey(4));
        System.out.println(mapInt.containsValue("four"));

        System.out.println(mapInt.remove(4,"four"));
        System.out.println(mapInt);
        System.out.println(mapInt.remove(5));
//        System.out.println(mapInt);
//        System.out.println(mapInt.containsKey(4));
//        System.out.println(mapInt.size());
//
//        System.out.println(mapInt.keySet());
//        mapInt.replace(1,"oneone");
//        System.out.println(mapInt);
//        mapInt.putIfAbsent(4,"four");
//        System.out.println(mapInt);
//
//        System.out.println(mapInt.containsKey(4));


    }
}
