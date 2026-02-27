import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * streams are used to do some operations on data
         */
        List<Integer> integerList1 = List.of(2,3,4,4,5,7,8);
        System.out.println("List of int's "+integerList1);
        //operation of squares of int's map the number to its sq
        //boiler code
        //i have list - stream - mapping each number to its sq-i am collecting them and store them
       List<Integer> collect =  integerList1.stream().map(num -> num+num).collect(Collectors.toList());
        System.out.println("Sq's of ints "+collect);
       List<Integer> collect1 =  integerList1.stream()
               .map(num -> num+num)
               .filter(num -> num%2==0)
               .collect(Collectors.toList());

        System.out.println("Even num is "+collect1);
        /**
         * optional
         */

        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";
//        Optional<String> sampleOptional = Optional.of(nullString);
//        try{
//            System.out.println(sampleOptional.get());
//
//        }catch(NullPointerException e){
//            System.out.println("there is nothing to print");
//        }


        List<Integer> integersList = List.of(1,2,3,4,5,6,7,8);
        List<String> collect2 = integersList.stream()
                .filter(x -> x % 2 == 0) //intermediate checking isEven and return stream
                .sorted(Comparator.reverseOrder())//sorting in reverse order and return a stream
                .map(x ->"Test"+x)
                .collect(Collectors.toList());//terminal collecting a stream to a list
        System.out.println(collect2);


    }
}
