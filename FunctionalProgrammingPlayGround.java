import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class FunctionalProgrammingPlayGround {

    public static void main(String[] args) {

        /*
        predicate will take type t, and return boolean
         */

        // to check even or odd number
        Integer num = 10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenOROdd = integerNum -> {
            if (integerNum % 2 == 0) return true;
            else return false;

        };
        System.out.println("From predicate if num is even or odd," + checkEvenOROdd.test(num));

        //bipredicate takes 2 inputs of type t,u


        //to check the length  of a string
        Integer len = 10;
        String str1 = "Eureka";
        checkStringLength(str1, len);
        BiPredicate<String, Integer> checkStringLengthF = (string, integer) -> {
            if (string.length() > integer) return true;
            else return false;


        };
        System.out.println("From Bipredicate,Is string's len is greater tha len" + checkStringLengthF.test(str1, len));


        /**
         * consumer takes type T and return void , and print something
         */
        Consumer<String> consumerFunction= System.out::println; // method reference
        consumerFunction.accept("EurekaFromConsumer");
        /**
         * supplier takes nothing returns type T
         */

        Supplier<Double> supplierFunction = Math:: random;
         System.out.print(supplierFunction.get());
        /**
         * unary takes type T and returns type T
         */
        UnaryOperator<Integer> unaryOperatorFunction= inputNum ->{
            return inputNum+inputNum;
        };
        /**
         * int -> return int+int
         * int -> {
         * if-else
         * return int+int
         * }
         * Integer :: add
         */



        System.out.println("From unary operator ::" +unaryOperatorFunction.apply(10));
        /**
         * binaryoperator takes T and T returns T
         */

        BinaryOperator<Integer> binaryOperatorFunction= (integer,integer1) ->{
            return integer+integer1;
        };
        System.out.println("From binary operator ::" + binaryOperatorFunction.apply(10,20));
        /**
         * Function and Bifunc ,takes input of type T string and returns another R//int
         * chaining of functions
         */
        //str is an object of string
        Function<String, Integer> sampleFunction01= str-> str.length(); // calling on object of string type
        System.out.println("String len from sampleFunction01  checking Eureka's length:" +sampleFunction01.apply("Eureka"));
        Function<String, Integer> sampleFunction02= String::length;  // we are calling instance method on class
        System.out.println("String's len from method referencing :" +sampleFunction02.apply("Eureka"));
        //chaining
        Function<String, Integer> sampleFunction03= sampleFunction02.andThen(integer ->integer*integer);
        System.out.println("the output from chaining function:" +sampleFunction03.apply("Eureka"));


        /**
         * Bifunction
         */
        BiFunction<String,Integer,Integer> sampleBiFunction01= (str,integer) ->{
            return str.length() + integer;
        };

        BiFunction<String,Integer,Integer> sampleBiFunction02=sampleBiFunction01.andThen(integer -> integer+integer);
        System.out.println("From BiFunc :: using chaining of functions:" +sampleBiFunction02.apply("Eureka",10));
    }





    // for Bipredicate
    private static void checkStringLength(String str1, Integer len) {
        System.out.println("For regular(Predicate)");
        if(str1.length() > len) System.out.println("string is >than len");
        else System.out.println("string is <than len");
    }
    //for Predicate

    static void  checkEvenOdd(int num) {
        System.out.println("For regular(Bipredicate)");
        if(num%2 ==0) System.out.println("it is even");
        else System.out.println("it is odd");

    }

}



