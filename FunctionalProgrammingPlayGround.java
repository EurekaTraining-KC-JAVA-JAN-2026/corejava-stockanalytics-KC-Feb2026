import org.postgresql.gss.GSSOutputStream;

import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {
        /**
         Predicate will take a type of T and returns Boolean
         */
        //to check a number is even or odd number
        Integer num = 10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenOROdd = integerNum -> {
            if (integerNum % 2 == 0) return true;
            else return false;
        };
        System.out.println("FROM predicate If num is even or odd" + checkEvenOROdd.test(num));
        /**
         * BiPredicate takes 2 inputs of type T,U and returns boolean
         */
        //to check the length of a string
        Integer len = 10;
        String str1 = "Eureka";
        checkStringLength(str1, len);
        BiPredicate<String, Integer> checkStringLengthF = (string, integer) -> {
            if (string.length() > integer) return true;
            else return false;
        };
        System.out.println("FROM BiPredicate, Is String's length is greater than Len " + checkStringLengthF.test(str1, len));
        /**
         * Consumer takes type T and returns void, and print  something
         */
        Consumer<String> consumerFunction = System.out::println; //Method referencing
        consumerFunction.accept("EurekaFromConsumer");
        /**
         * Supplier takes nothing returns T
         * ******************
         */
        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());
        /**
         * Unary takes type T and returns type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum -> {
            return inputNum + inputNum;
        };
        /**
         * int -> return int + int
         * int -> {
         *     if-else
         *     return int + int
         * }
         * Integer :: add
         */
        System.out.println("FROM Unary Operator ::" + unaryOperatorFunction.apply(10));
        /**
         * BinaryOperator takes T and T returns T
         */
        BinaryOperator<Integer> binaryOperatorFunction = (integer, integer1) -> {
            return integer + integer1;
        };
        System.out.println("FROM binaryOperator :: " + binaryOperatorFunction.apply(10, 20));
        /**
         * ===============================
         * FUNCTION and BIFUNCTION
         * Function takes an input type of T(String) and returns another type of R(Integer)
         * Chaining of Functions
         */
        Function<String, Integer> sampleFunction01 = str -> str.length();
        System.out.println("String length from sampleFunction01 checking Eureka's length: " + sampleFunction01.apply("Eureka"));
        Function<String, Integer> sampleFunction02 = String::length; //we are calling instance method on Class using method referencing
        System.out.println("String's length from method referencing " + sampleFunction02.apply("Eureka"));
        //Chaining
        Function<String, Integer> sampleFunction03 = sampleFunction02.andThen(integer -> integer * integer);
        System.out.println("The output from chaining Functions :" + sampleFunction03.apply("Eureka"));


        /**
         * BiFunction
         */
        BiFunction<String,Integer,Integer> sampleBiFunction01 = (str, integer) -> {
            return str.length() + integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02 = sampleBiFunction01.andThen(integer -> integer+integer);
        System.out.println("FROM BiFunction :: using chaining of functions :" + sampleBiFunction02.apply("Eureka", 10));
    }

    //for biPredicate
    private static void checkStringLength(String str1, Integer len) {
        System.out.println("For Regular(Predicate)");
        if(str1.length() > len) System.out.println("Strin is > than len");
        else System.out.println("String is < than len");

    }
    //for predicate
    static void checkEvenOdd(int num) {
        System.out.println("For Regular(BiPredicate)");
        if(num%2 == 0)
            System.out.println("it is Even");
        else System.out.println("it is Odd");
    }

}

