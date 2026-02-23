import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String args[]) {
        /**
         * Streams are used to do some operations on data
         */
        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9, 2);
        System.out.println("list of int's" + integerList);

        //operation of Squares of int's map the number to its square
        //boiler plate code
        //I have List - stream - mapping each number to its square collecting them storing in a list
       List<Integer> collect = integerList.stream().map( num -> num*num).collect(Collectors.toList());
       System.out.println("Square root of int's : " + collect);

       //even or odd

       List<Integer> collect1 =  integerList.stream()
               .map(num -> num + num)
               .filter(num -> num % 2 == 0)
               .sorted()
               .collect(Collectors.toList());
       System.out.println("Even of ints : " + collect1);

        /**
         * Optional
         */

        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";
        System.out.println("=============From Optional==============");
        Optional<String> sampleOptional = Optional.ofNullable(nullString);
        try {
            System.out.println(sampleOptional.get());
        } catch (NullPointerException e) {
            System.out.println("There is nothing to print");
        }
    }
}
