import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * Streams are used to do some operations on the data
         */

        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9);
        System.out.println("list of int's "+integerList);
        //operation of square of int's map the number to its square.
        //boiler plate code
        //i have list - streaming on it -mapping each number to its square in collecting
        List<Integer> collect= integerList.stream().map(num ->num*num).collect(Collectors.toList());
        System.out.println("square of int's"+collect);
        //even or odd
         List<Integer> collect1= integerList.stream().
                 map(num->num+num).
                 filter(num->num%2 ==0).
                 collect(Collectors.toList());
        System.out.println("Even nums is int's"+collect1);

        /**
         * Optional
         *
         */
        String string1 = "Eureka";
        String nullstring = null;
        String emptystring = "";
        System.out.println("=====================FROM OPTIONAL===========");
        Optional<String> sampleOptional = Optional.ofNullable(nullstring);
        try{
            System.out.println(sampleOptional.get());
        }catch (NullPointerException e){
            System.out.println("there is nothing to print");
        }
    }
}
