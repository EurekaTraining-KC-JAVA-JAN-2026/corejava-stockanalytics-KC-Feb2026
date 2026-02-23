import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * Streams are used to do some operations on data
         */

        List<Integer> integerList = List.of(3,4,5,6,7,8,9,2);
        System.out.println("List of integers " +integerList);
        //operation of squares of int - map the number to its square
        //boiler code
        //stream is a process - collection of data
        //here we have a list - stream - mapping each number to its square
        //here we are coll
        List<Integer> collect = integerList.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("Squares of ints" +collect);
        //even or odd
        List<Integer> collect1 = integerList.stream()
                .map(num->num+num)
                .filter(num -> num % 2 == 0)
                .sorted().
                collect(Collectors.toList());
        System.out.println("Even numbers in integers" +collect1);
        /**
         * Optional
         */
        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";
        System.out.println("From OPTIONAL");
        Optional<String> sampleOptional = Optional.ofNullable(nullString);
        try {
            System.out.println(sampleOptional.get());
        }catch(NullPointerException e){
            System.out.println("there is nothing to print");
        }

    }
}
