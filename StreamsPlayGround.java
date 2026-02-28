import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * Stream are used to do some operations on data
         */
        List<Integer> integerList = List.of(3,4,5,6,7,8,9,2);
        System.out.println("List of int's " + integerList);
        //Operation of Squares of int' - map the number to it's square
        //boiler code
        //I have list and doing streaming on the list and take map, mapping each num to it's square
        List<Integer> collect = integerList.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("Sq's of int's " +collect);
        //even or odd
        List<Integer> collect1 = integerList.stream().map(num -> num+num).filter(num -> num % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println("EVEN nums in int's " +collect1);
        /*
        * Optional
        */
        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";
        System.out.println("=========FROM OPTIONAL========");
        Optional<String> sampleOptional = Optional.ofNullable(nullString);
        try {
            System.out.println(sampleOptional.get());
        } catch(NullPointerException e){
            System.out.println("There is nothing to print");
        }
        List<Integer> integerList1 = List.of(1,2,3,4,5,6,7,8);
        List<String> collect2 = integerList1.stream()
                .filter(x->x%2==0) //intermediate checking isEven and return stream
                .sorted(Comparator.reverseOrder()) //sorting in reverse order and return a stream
                .map(x->"test " +x)
                .collect(Collectors.toList()); //terminal collecting a stream to a List
        System.out.println(collect2);

    }
}
