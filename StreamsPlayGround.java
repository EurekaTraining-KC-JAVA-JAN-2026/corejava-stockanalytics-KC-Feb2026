import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args){
        /**
         * streams are used to do some operations on data
         */

        List<Integer> integerList= List.of(3,4,5,6,7,8,9,2);
        System.out.println("List of int's" +integerList);

        //operation of square of int's map the number to its square
        //boilerplate code
        // i have a list - streaming - mapping each  number to its square,
        //so im collecting them storing in a

        List<Integer> collect = integerList.stream().map(num -> num * num).collect(Collectors.toList());
        //process, like collection of data
        System.out.println("Sqs of int's" +collect);
        //map will take something and perform the same operation

        // even or odd
        List<Integer> collect1 = integerList.stream()
                .map(num->num+num)
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Even nums in int's" + collect1);
   // first map and then sort and collect it to a list
        String string1="Eureka";
        String nullString =null;
        String emptyString= "";
        System.out.println("=============From Optional==========");
        Optional<String > sampleOptional= Optional.ofNullable(nullString);
        //
        try{
            System.out.println(sampleOptional.get());
        }catch(NullPointerException e){
            System.out.println("there is nothing to print");
        }

     //benifit of optional is to handle unexpected data,or catching errors
        // we dont know if its really a null or has any value
     }

     //functional interfaces is used to minimize the creation of class files

     // map is taking input and returning another input
     //filter takes and checks if true of false


}
