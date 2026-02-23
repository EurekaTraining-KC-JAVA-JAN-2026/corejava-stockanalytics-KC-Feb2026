import org.postgresql.gss.GSSOutputStream;
import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {

        // predicate will take a type of T and return Boolean
        // to check a number even or odd

        Integer num = 10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenOROdd = integerNum -> {
            if (integerNum % 2 == 0) return true;
            else return false;
        };
        System.out.println( checkEvenOROdd.test(num));


        Integer len =10;
        String str1 = "Eureka";
        checkStringLength(str1,len);

        BiPredicate<String,Integer> checkStringLengthF = (string,integer) -> {
        if (string.length() > integer) return true;
        else return false;
        };
        System.out.println( checkStringLengthF.test(str1,len));

        //==== consumer

        Consumer<String> consumerFunction = System.out::println;
        consumerFunction.accept("EurekaFromConsumer");

        // ===== supplier takes running returns T

        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());

        // unary takes type T and returns type T

        UnaryOperator<Integer> unaryOperatorFunction = inputNum ->{
            return inputNum+inputNum;
        };
        /**
         * int -> return int + int
         * int ->{
         *      if-else
         *      return int+int
         *      }
         * integer::add
         *
         */

        System.out.println(unaryOperatorFunction.apply(10));

       // BinaryOperator takes T returns T

        BinaryOperator<Integer> binaryOperatorFunction = (integer,integer1) -> {
            return integer+integer1;
        };
        System.out.println(binaryOperatorFunction.apply(10,20));

        // function and bifunction
        // takes input T //string  and returns R//int
        // chaining of functions

        Function<String,Integer> sampleFunction01 = str ->str.length();
        System.out.println(sampleFunction01.apply("Eureka"));
        Function<String,Integer> sampleFunction02 = String::length; // we r calling instance method on  class using method referencing
        System.out.println(sampleFunction02.apply("Eureka"));

        //chaining

        Function<String,Integer> sampleFunction03 = sampleFunction02.andThen(integer -> integer*integer);
        System.out.println(sampleFunction03.apply("Eureka"));

        // Bifunction
        BiFunction<String,Integer,Integer> sampleBiFunction01 = (str,integer)->{
            return str.length() + integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02 =sampleBiFunction01.andThen(integer -> integer+ integer);
        System.out.println(sampleBiFunction02.apply("Eureka", 10));
    }
    // for Bi-predicate
    private static void addStrings(String str2, String str3) {
        System.out.println(str2+str3);
    }

    private static void checkStringLength(String str1, Integer len) {
        if (str1.length() > len) System.out.println("String is > len");
        else System.out.println("String is < len");
    }

    // for predicate
    static void checkEvenOdd(int num) {
    if (num%2 == 0) System.out.println("it is even");
    else System.out.println("it is odd");

    }
}