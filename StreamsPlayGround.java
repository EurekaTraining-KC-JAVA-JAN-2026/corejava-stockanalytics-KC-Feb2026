import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * Strema are used to do some operations on data
         */
        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9);
        System.out.println("list of int's "+integerList);
        //operations of Square's of int's map to number to its square
        // Boiler code
        //We have the list and maping each number to its sqare to get the squares of the Numbers in List
        List<Integer> collect = integerList.stream().map(num->num*num).collect(Collectors.toList());
        //List<Integer> collect1 = integerList.stream().map(num->num*num).toList();
        System.out.println("sq's of int's"+collect);
        //System.out.println(collect1);
        //even or odd
        List<Integer> collect1 = integerList.stream().
                map(num-> num+num). //intermedite operations
                filter(num -> num % 2 == 0).
                sorted().
                collect(Collectors.toList());//termial
        System.out.println("Even number of int's" + collect1);

        /**
         * Optional
         */
        String string1 = "Eureka";
        String nullstring = null;
        String emptystring = " ";
        System.out.println("From Optional");
        Optional<String> sampleOperational = Optional.ofNullable(nullstring);
        try {

            System.out.println(sampleOperational.orElse("There is nothing to print"));
        }catch(NullPointerException e){
            System.out.println("There is nothing to print");

            List<Integer> integerList1 = List.of(1,2,3,4,5,6);
            List<String> collect2 = integerList1.stream().
                    filter(x -> x % 2 == 0)//intermediate checking isEven and return stream
                    .sorted(Comparator.reverseOrder())//sorting in reverse oirder and return a stream
                    .map(x->"test"+x)
                    .collect(Collectors.toList());
            System.out.println(collect2);
        }
    }
}
