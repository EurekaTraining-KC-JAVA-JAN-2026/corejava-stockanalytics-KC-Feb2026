import com.eurekaAccounts.stocks.vo.SectorVO;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {

        /**
         * streams are used to do some operations on data
         */
        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9);
        System.out.println("List of int's " + integerList);

        // square each number
        List<Integer> collect = integerList.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Sq's of int's " + collect);

        // even numbers after doubling
        List<Integer> collect1 = integerList.stream()
                .map(num -> num + num)
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("EVEN numbers in int's " + collect1);

        /**
         * optional
         */
        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";

        System.out.println("=========FROM OPTIONAL========");

        Optional<String> sampleOptional = Optional.ofNullable(nullString);

        try {
            System.out.println(sampleOptional.get());
        } catch (Exception e) {
            System.out.println("there is nothing to print");
        }

        /**
         * filter even, reverse sort, map to string
         */
        List<Integer> integerList1 = List.of(1,2,3,4,5,6,7,8);

        List<String> collect2 = integerList1.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .map(x -> "test" + x)
                .collect(Collectors.toList());

        System.out.println(collect2);

    }
}