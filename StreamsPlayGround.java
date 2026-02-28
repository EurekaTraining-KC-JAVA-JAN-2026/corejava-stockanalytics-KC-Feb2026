import java.util.Comparator;
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
//        String string1 = "eureka";
//        String nullString = null;
//        String emptyString = "";
//        System.out.println("=============From Optional==============");
//        Optional<String> sampleOptional = Optional.of(nullString);
//        try{
//            System.out.println(sampleOptional.get());
//        }
//        catch(NullPointerException e){
//            System.out.println("there is nothing to print");
//        }

        List<Integer> integerList2 = List.of(1,2,3,4,5,6);
        List<Integer> collect1 = integerList2.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Comparable::compareTo)
                .collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> collect2 = integerList2.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect2);

        List<String> collect3 = integerList2.stream()
                .filter(x -> x % 2 == 0)
                .map(x-> "test " + x)
                .collect(Collectors.toList());
        System.out.println(collect3);
    }

}
