import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    static void main(String[] args) {
        /**
         * Streams are used to do some operations on data
         */
        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9,2);
        System.out.println("List of int's " + integerList);
        // operation of squares of int's
        // boiler code
        // application of squares of int's map the number to its sq
        // i have a list - stream - mapping each number of its square and storing it in a list
        List<Integer> collect =  integerList.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(collect);
        // even number
        List<Integer> collect1 = integerList.stream()
                .map(num -> num + num)
                .filter((num) -> num % 2 == 0)
                .sorted().
                collect(Collectors.toList()); // terminal
        System.out.println("Even numbers in int's " + collect1);

        List<Integer> integerList1 = List.of(1,2,3,4,5,6,7,8);
        List<String> collect2 = integerList1.stream()
                .filter(x -> x % 2 == 0).sorted(Comparator.reverseOrder())
                .map(x -> "test " + x).collect(Collectors.toList());
        System.out.println(collect2);


        /**
         * Optional
         *
         */
        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";
        //Optional<String> sampleOptional = Optional.of(nullString);
        try
        {
            //System.out.println(sampleOptional.get());
        }
        catch (NullPointerException e)
        {
            System.out.println("there is nothing to print");

        }

    }
}
