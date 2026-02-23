import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPlayGround {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(2,3,4,5,6,7,8);
        System.out.println("List of Int's"+integerList);

        //Operation of Squares

        List<Integer> collect =integerList.stream()
                .map(num->num*num)
                .collect(Collectors.toList());

        System.out.println("Squares"+collect);

        //EvenorOdd

        List<Integer> collect1 = integerList
                .stream()
                .filter(num-> num%2==0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers:" +collect1);

        //Optional
        String string1 = "Eureka";
        String nullString = null;
        String emptyString = "";
        System.out.println("=========Optional");
//        Optional<String>sampleOptional= Optional.ofNullable(nullString);
//        try{
//        System.out.println(sampleOptional.get());}
//        catch (NullPointerException e){
//            System.out.println("Nothing to print");
//        }

    }
}
