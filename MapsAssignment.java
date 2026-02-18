import java.util.HashMap;
import java.util.Map;

public class MapsAssignment {
    static void main(String[] args) {
        Map<String,String> mapAnimal = new HashMap<>();
        mapAnimal.put("Elephant","Herbivore");
        mapAnimal.put("Rhino", "Herbivore");
        mapAnimal.put("Lion", "Carnivore");
        mapAnimal.put("Bear", "Omnivore");
        mapAnimal.put("Dog", "Omnivore");
        mapAnimal.put("Cat", "Omnivore");
        mapAnimal.put("Tiger", "Carnivore");
        mapAnimal.put("Deer", "Herbivore");
        System.out.println(mapAnimal);
        System.out.println("Rhino Value " +mapAnimal.get("Rhino"));
        System.out.println("Size of Animal Map " + mapAnimal.size());
        System.out.println("Does the Animal Map contain Dog "+ mapAnimal.containsKey("Dog"));
        System.out.println("Does the Animal Map contain Omnivores " + mapAnimal.containsValue("Omnivore"));
        System.out.println("Is the Animal map empty " +mapAnimal.isEmpty());
        System.out.println("Display all keys " +mapAnimal.keySet());
        System.out.println("Display all values " + mapAnimal.values());
        Map<String,String> mapAnimal2 = new HashMap<>();
        mapAnimal2.put("Giraffe","Herbivore");
        mapAnimal2.put("Snake", "Omnivore");
        mapAnimal2.put("Koala", "Herbivore");
        mapAnimal2.put("Monkey", "Omnivore");
        System.out.println("Are both animal maps equal " +mapAnimal.equals(mapAnimal2));
        mapAnimal2.remove("Snake");
        mapAnimal.remove("Deer","Herbivore");
        System.out.println("Map Animal2 " + mapAnimal2);
        mapAnimal.replace("Lion","Omnivore");
        System.out.println("The lion value after replace "+ mapAnimal.get("Lion"));
        System.out.println("--------MapAnimal--------");
        for (String key : mapAnimal.keySet()) {
            System.out.println("Key: " + key + ", Value: " + mapAnimal.get(key));
        }
        System.out.println("--------MapAnimal2  Values--------");
        for (String value : mapAnimal2.values()) {
            System.out.println("Value: " + value);
        }
        mapAnimal2.put("","Herbivore"); // one null key allowed
        mapAnimal2.put("Otter",""); // multiple null values
        mapAnimal2.put("Hippo","");
        System.out.println(mapAnimal2);




    }
}
