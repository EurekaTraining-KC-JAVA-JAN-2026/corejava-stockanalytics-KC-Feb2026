package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonsPlayGround {
    public static void main(String[] args) {
        Map<Integer, String> personMap = new HashMap<>();

        //(PersonId-->PersonName)
        personMap.put(101, "Akshay");
        personMap.put(102, "Praneeth");
        personMap.put(103, "Rajan");
        personMap.put(104, "Vishwanath");
        System.out.println(personMap);

        //Checking ValueBy Key
        System.out.println(personMap.get(101));

        //Checking if Key Exists
        boolean hashkey =personMap.containsKey(101);
        System.out.println(hashkey);

        //Checking if Value Exists
        boolean hashValue =personMap.containsValue(101);
        System.out.println("has value:" +hashValue);

        //Removing a Person
        personMap.remove(104);
        System.out.println("After Removing 104 :" +personMap);

        //ReplacingPersons
        personMap.replace(103,"Pavan");
        System.out.println("After Replacing :" +personMap);

        //Getting All Persons
        Collection<String>values = personMap.values();
        System.out.println("Values:" + values);

        //KeySet Iteration

        System.out.println("KeySet:");
        for (Integer key : personMap.keySet()){
            System.out.println(key);
        }

        //Value Iteration

        System.out.println("Values:");
        for (Integer value : personMap.keySet()){
            System.out.println(value);
        }

        //Checking if Map is Empty
        System.out.println("Is Map is Empty"+ personMap.isEmpty());



    }
}
