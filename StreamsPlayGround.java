import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * streams are used to do some operations on data
         */
        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9);
        System.out.println("List of int's"+integerList);
        //operations of squares of int's map the number to its square
        //boiler code
        // i have list - stream on it and mapping each no to its square
        List<Integer> collect = integerList.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println("Sq's of int's"+collect);
        //even or odd
        List<Integer> collect1 =integerList.stream()
                .map(num->num+num).
                filter(num-> num%2 ==0)
                .sorted().
                collect(Collectors.toList());
        System.out.println("EVEN numbers in int's"+collect1);

        /**
         * optional
         */
        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";
        System.out.println("=========FROM OPTIONAL========");
        Optional<String> sampleOptional = Optional.ofNullable(nullString);
        try{
            System.out.println(sampleOptional.get());

        }catch (NullPointerException e){
            System.out.println("there is nothing to print");
        }


    }
}
