import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * Streams are  used to do some operations on data
         */

        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9);
        System.out.println("list of ints"+ integerList);

        List<Integer> collect = integerList.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println("list of ints"+ collect);

        String str = "Eureka";
        String nullString;
        nullString = null;
        String emptyString = "";

//        Optional<String> so1 = Optional.ofNullable(nullString);
//        try{
//            System.out.println(so1.get());
//        }catch(NullPointerException e){
//            System.out.println(e.getStackTrace());
//        }

        System.out.println("printing this");


        List<Integer> integerList2 = List.of(1,2,3,4,5,6);
        List<String> collect1 = integerList2.stream().filter(num -> num % 2 == 0).sorted(Comparator.reverseOrder()).map(x->"test"+x).collect(Collectors.toList());;
        System.out.println(collect1);

    }
}
