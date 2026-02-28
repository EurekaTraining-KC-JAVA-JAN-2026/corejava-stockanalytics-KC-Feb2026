//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//public class streamsplayground {
//    public static void main(String[] args){
//        List<Integer> integerlist =  List.of(2,3,4,5,5,6);
//        System.out.println("list of ints"+integerlist);
//        //operations of square of int's map the number to its sq
//        //boiler plate code
//        //i have list-stream-mappinf each number to its square then sorting in a list
//      List<Integer> collect=  integerlist.stream().map(num ->num*num).collect(Collectors.toList());
//        System.out.println("sq of ints "+ collect); ///collect size=8
//
//    //even or odd
//        List<Integer> collect1=integerlist.stream().map(num->num*num).filter(num-> num%2==0).sorted().collect(Collectors.toList());
//        System.out.println("even or odd"+collect1);
//    String string1="eureka";
//    String nullstring=null;
//    String emptystring="";
////        System.out.println("from option");
////        Optional<String> sampleoutput = Optional.of(nullstring);
////        try{
////            System.out.println(sampleoutput.get());
////        }catch(NullPointerException e){
////            System.out.println("there is nothing to print");
////        }
//List<Integer> integerList1= List.of(1,2,3,4,5);
//        List<Integer> collect2= integerList1.stream()
//                .filter(x->x%2==0)
//                .sorted(Comparator.reverseOrder())
//           .map(x->"test"+x)
//                .collect(Collectors.toList()).reversed();
//        System.out.println( collect2);
//    }
//
//}
