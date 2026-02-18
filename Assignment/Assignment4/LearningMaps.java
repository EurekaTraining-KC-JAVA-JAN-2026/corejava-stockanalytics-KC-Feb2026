package Assignment.Assignment4;

import java.util.HashMap;
import java.util.Map;

public class LearningMaps {

    public static void main(String args[]) {

        Map<Integer, String> students = new HashMap<>();

        //Adding list of students
        students.put(1, "Vishwanath");
        students.put(2, "Nakul");
        students.put(3, "Venkat");
        students.put(4, "Ashwin");
        System.out.println(students);

        //Get a student by Key
        System.out.println("Student with the Roll no 2 is  : "+ students.get(2));

        //To check if a student with particular Key is present in the list or not
        //Returns True if exist or else false
        System.out.println(students.containsKey(3));

        //Same as containsKey
        System.out.println(students.containsValue("Venkat"));

        //Prints out all the keys
        System.out.println("All the keys in the list : " + students.keySet());

        //Using the keyset we can also get the values
        for(Integer rollNo : students.keySet()) {
            System.out.println("Name of the students with rollNo : "+rollNo + "is : " + students.get(rollNo));
        }

        //To remove a particular student
        System.out.println("Student removed was " + students.remove(4));

        //Removes by taking both key and value
        System.out.println(students.remove(2, "Nakul"));

        //Map after removing an element
        System.out.println("Updated Students Map : " + students);

        //To check the size
        System.out.println("Total number of Students in the Map : " + students.size());

        //To check if a list is empty
        System.out.println("Is the students Map empty ? " + students.isEmpty());

        //Creating other set of students
        Map<Integer, String> otherListOfStudents = new HashMap<>();
        otherListOfStudents.put(5, "Phani");
        otherListOfStudents.put(6, "venkat");

        //adding the otherStudentList to the main student list
        students.putAll(otherListOfStudents);
        System.out.println("Final Student List : " + students);

        //Returns true if both StudentList and otherStudentList is same.
       boolean equal =  students.equals(otherListOfStudents);
       System.out.println(equal);

       //Types of replacing a new value with the old one.
       students.replace(6, "Nakul");
       students.replace(1, "Vishwanath", "Vishwa");

       //PutInAbsent, it adds the key value pair only if the key is not presnt
        //here 1 is already in the list so it doesnt add.
       students.putIfAbsent(1, "Vishwanath");
       System.out.println(students);
       //Adds to the list as 2 is not in the list
       students.putIfAbsent(2, "ABC");
       System.out.println(students);

    }

}
