import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * Streams are used to do some operations on data
         */
        List<Integer> integerList = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("List of int's: " + integerList);
        //operations of squares of int's
        List<Integer> collect = integerList.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("sq's of int's: " + collect);

        //even or odd
        List<Integer> list = integerList.stream().map(num -> num + num).filter(num -> num % 2 == 0).toList();
        System.out.println("Even num's list is: " + list);

        /**
         *
         */
        String string1 = "eureka";
        String nullString = null;
        String emptyString = "";
        System.out.println("=============From Optional==============");
        Optional<String> sampleOptional = Optional.of(nullString);
        try{
            System.out.println(sampleOptional.get());
        }
        catch(NullPointerException e){
            System.out.println("there is nothing to print");
        }
    }
}
