import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
   public static void main(String[] args) {
       /**
        * Streams are used to do some operations on data
        */
       List<Integer> integerList=List.of(2,3,4,1,8,6,7);
       System.out.println("list of ints :"+integerList);
       //operator of squares
       List<Integer> collect = integerList.stream().
                             map(num->num*num).
                              collect(Collectors.toList());
       System.out.println("Squares of integerList :"+collect);

       List<Integer> collect1 = integerList.stream().
               map(num->num+num).
               filter(num -> num % 2 == 0).
               sorted().collect(Collectors.toList());
       System.out.println("Even num of ints :"+collect1);

       /**
        * Optional
        */
       String string="Eureka";
       String nullstring=null;
       String emptyString="";
       Optional<String> sampleOptional=Optional.of(nullstring);
       try{
           System.out.println(sampleOptional.get());

       }catch (NullPointerException e){
           System.out.println("There is nothing");
       }





   }
}
