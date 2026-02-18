import java.util.HashMap;
import java.util.Map;

public class AssignmentMap {
    public static void main(String[] args) {

        Map<Integer,String> mapPnt = new HashMap<>();
        // map stores key-value pair structure
        mapPnt.put(25, "Mcdonalds");
        mapPnt.put(20, "KFC");
        mapPnt.put(16, "Tacobell");
        mapPnt.put(12, "Texas Road House");
        mapPnt.put(51, "Chipotle");
        System.out.println(mapPnt);
        // To retrive the value
        System.out.println(mapPnt.get(20));

        System.out.println("Size of the mapPnt: "+mapPnt.size());
        System.out.println(mapPnt.remove(12));
        System.out.println(mapPnt);
        System.out.println(mapPnt.isEmpty());
        System.out.println(mapPnt.containsKey(25));
        System.out.println(mapPnt.containsValue("KFC"));
        System.out.println(mapPnt.containsValue("BBW"));

        System.out.println(mapPnt.replace(16,"Dave's Chicken"));
        System.out.println(mapPnt);

        System.out.println(mapPnt.keySet());
        for(int k:mapPnt.keySet()){
            System.out.println(mapPnt.get(k));
        }

    }
}
