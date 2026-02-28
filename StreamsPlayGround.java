import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    static void main(String[] args) {
        /**
         * streams are used to do some operations on data
         */
        List<Integer> integerList=List.of(3,4,5,6,7,8,9,2);
        System.out.println("list of int's"+integerList);
        //operation of Squares of int's map the number to its square
        //boiler code
        // i have list - stream - mapping each number to its sq- in collecting them storing in alist
        List<Integer> collect=integerList.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println("sq's of int's"+collect);
        //even or odd
       List<Integer> collect1= integerList.stream()
                .map(num->num+num) //intermediate
                .filter(num->num%2==0) //intermediate
                .sorted()
                .collect(Collectors.toList());// terminal
        System.out.println("Even numbers in int arr"+collect);

        /**
         * optional
         */
        String string1="Eureka";
        String nullString=null;
        String emptyString="";
        System.out.println("===========FROM OPTIONAL=======");
        Optional<String> sampleOptional=Optional.ofNullable(nullString);
        try{
            System.out.println(sampleOptional.get());
        }catch(NullPointerException e){
            System.out.println("there is nothing to print");
        }

        List<Integer> integerList1=List.of(1,2,3,4,5,6,7,8);
        List<String> collect2=integerList1.stream()
                .filter(x->x%2==0)
                .sorted(Comparator.reverseOrder())
                .map(x->"test"+x)
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}
