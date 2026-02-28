import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {
        /**
         * streams are used to do some operations on date
         */
        List<Integer> integerList=List.of(2,3,4,5,6,7,8,9);
        System.out.println("List of ints's "+integerList);
        //operation of Squares of int's map the number to ots sq
        //boiler code
        //i have list -stream - mapping each number to its sq
        List<Integer>collect= integerList.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println("sqs of int's: "+collect);
        //even or odd
        List<Integer>collect1=integerList.stream()
                .map(num->num+num) //intermediate
                .filter(num->num%2==0) //intermediate
                .sorted() //intermediate
                .collect(Collectors.toList()); //termianl
        System.out.println("even nums in int's "+collect1);

        /**
         * Optional1
         */
        String string1= "Eureka";
        String nullstring=null;
        String emptyString ="";
        System.out.println("======FROM OPTIONAL=====");
        /**Optional<String> sampleOptional=Optional.ofNullable(nullstring);
        try{
            System.out.println(sampleOptional.get());
        }catch (NullPointerException e){
            System.out.println("there is nothing to print");
        }**/

        List<Integer> integerList1 =List.of(1,2,3,4,5,6,7,8);
        List<String> collect2 = integerList1.stream()
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .map(x->"test "+x)
                .collect(Collectors.toList()); //termianl collecting a stream to a list
        System.out.println((collect2));

    }

}