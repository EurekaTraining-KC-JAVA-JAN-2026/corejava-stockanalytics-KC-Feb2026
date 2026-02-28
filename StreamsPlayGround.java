import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {

    public static void main(String[] args) {
        /**
         * streams used to do some operations on data
         */
        List<Integer> integerList = List.of(2,3,4,5,6,7,8,9);
        System.out.println("List of int's:"+integerList);
        //operation of square of int's.we need to map number to its sqrt
        //boiler plate
        // i have list -stream - mapping each num to its sq colecting them string in list
        List<Integer> collectingList=integerList.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println("Sqrt of int's:"+collectingList);
        //even or odd
        List<Integer> collectingListList1=integerList.stream()
                .map(num->num+num)//intermediate oprtn
                .filter(num->num%2 == 0)//intermediate
                .collect(Collectors.toList());//terminal
        System.out.println("even number in int's"+collectingListList1);

        /**
         * Optional
         * if we r accessing data base like in stocks current ratio values so there will be some null values soo
         * by using optional we can avoid null values
         */
//        String string1 = "Eureka";
//        String nullString = null;
//      //  String emptyString = "";
//        Optional<String> sampleOptional = Optional.ofNullable(nullString);
//        try{
//            System.out.println(sampleOptional.get());
//        }catch(NullPointerException e){
//            System.out.println("there is nothing to print ");
//        }

        List<Integer> integerList2 = List.of(1,2,3,4,5,6,7,8,9);
        List<String> collect2= integerList2.stream()
                .filter(x->x%2==0)
                .sorted(Comparable::compareTo)//ascending order
                //.sorted(Comparator.reverseOrder())//sorting in rev order descending
                .map(x->"test"+x)//(mapping) each value
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}
