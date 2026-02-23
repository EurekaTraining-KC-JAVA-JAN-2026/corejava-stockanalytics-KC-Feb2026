import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        // Streams are used to do some operations on data

        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9);
        System.out.println(integerList);

        // operation of squares of int's which map the number to its square
        // boiler code
        // i have list - stream  -mappimg each num to its square iam collecting them storing it in a list

        List<Integer> collect = integerList.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println(collect);
      // even or odd
        List<Integer> collect1 = integerList.stream()
                .map(num-> num+num)
                .filter(num-> num%2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect1);
        //optional
        String string1 = "Eureka";
        String nullString  = null;
        String emptyString = "";
        System.out.println("===========from optional=========");
        Optional<String> sampleOptional = Optional.of(nullString);
        try{
            System.out.println(sampleOptional.get());
        }catch (NullPointerException e){
            System.out.println("there is nothing to print");
        }
    }
}
