import java.util.function.*;

public class FunctionalProgrammingPlayGround {

    public static void main(String args[]) {
        /*
        predicate will take a type of T and return boolean
         */

        //To check a number even or odd
        int num = 10;
        checkEvenAdd(num);
        Predicate<Integer> checkEvenOROdd = integerNum -> {
            if(integerNum%2==0) return true;
            else return false;
        };
        System.out.println("From Predicate If num is even or add" + checkEvenOROdd.test(num));

        /**
         * BiPredicate takes 2 inputs of type T,U and return boolean.
         */
        Integer len = 10;
        String str1 = "Eureka";
        CheckStringLength(str1, len);
        BiPredicate<String, Integer> checkStringLengthF = (string, integer)-> {
            if(string.length() > integer) return false;
            else return true;
        };
        System.out.println("From BiPredicate Is strings length is greater than len" + checkStringLengthF.test(str1, len));

        /**
         * Consumer takes type T and return void, and print something
         */

        Consumer<String> consumerFunction = System.out::println; //method reference
        consumerFunction.accept("EurekaFromConsumer");

        /**
         * Supplier takes nothing return T
         */
        Supplier<Double> supplierFuntion = Math::random;
        System.out.println(supplierFuntion.get());

        /**
         * Unary takes type T and returns type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum -> {
            return inputNum+inputNum;
        };

        System.out.println("From Unary operator ::" +unaryOperatorFunction.apply(10));

        /**
         *int -> return int+int
         * int -> {
         * if-else
         * return int + int
         * }
         * Integer::add
         */

        /**
         * BinaryOperator takes T and T returns T
         */
        BinaryOperator<Integer> binaryOperatorFunction = (integer, integer1) -> {
            return integer+integer1;
        };
        System.out.println("From binaryOperator :: " + binaryOperatorFunction.apply(10, 20));

        /**
         * FUNCTION AND BIFUNCTION
         * takes an input of T//String and return another R//int
         * Chaining of Functions
         */
        Function<String, Integer> sampleFunction01 = str -> str.length();
        System.out.println("String length from sampleFunction01 is : " + sampleFunction01.apply("Eureka"));

        Function<String, Integer> sampleFunction2 = String::length;//We are calling instane method on class using method reference.
        System.out.println("Strings length from method referencing : " +sampleFunction2.apply("Eureka"));

        //Chaining
        Function<String, Integer> sampleFunction03 = sampleFunction2.andThen(integer -> integer*integer);
        System.out.println("The output from chaining functions : " +sampleFunction03.apply("Eureka"));

        /**
         * BIFUNCTION
         */
        BiFunction<String, Integer, Integer> sampleBiFunction01 = (str, integer) -> {
            return str.length() + integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02 = sampleBiFunction01.andThen(integer -> integer+integer);
        System.out.println("From BiFunction :: using chaining of functions" +sampleBiFunction02.apply("Eureka", 10));

//        /**
//         * Function takes <T,R> and returns R
//         * Check the length
//         */
//
//        String str2 = "Eureka";
//        Function<String, Integer> sampleFunctionF = str-> str.length();
//        System.out.println("Checking the lenght of string using function :: "+sampleFunctionF.apply(str2));
//        //Addition of Strings
//        Function<String, Integer> sampleFunction2 = sampleFunctionF.andThen(integer -> integer*integer);
//        System.out.println("From Chained functionF ::" +sampleFunction2.apply("Tech"));
    }

    private static void addStrings(String str2, String str3) {
        System.out.println("From Req Function :: Addition of strings" + str2+str3);
    }

    //For Bipredicate
    private static void CheckStringLength(String str1, Integer len) {
        System.out.println("For Regular(Predicate)");
        if(str1.length() > len) System.out.println("String is > then len");
        else System.out.println("String is < then length");
    }

    //for predicate
    private static void checkEvenAdd(int num) {
        System.out.println("For regular(BiPredicate)");
        if(num%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }


}
