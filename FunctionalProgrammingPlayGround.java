import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {
        /**
         * Predicate will take a type of T and return Boolean
         */
        //to check a number even or odd
        int num = 10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenorOdd = integerNum -> {
            if (integerNum % 2 == 0) return true;
            else return false;
        };
        System.out.println("From Predicate if num is even or odd" + checkEvenorOdd.test(num));
        /**
         * BiPredicate takes 2 inputs of type T, U and return
         */
        Integer len =10;
        String str1 = "Eureka";
        checkStringLength(str1,len);
        BiPredicate<String,Integer> checkStringLengthF = (string,integer) ->{
            if(string.length()>integer) return true;
            else return false;
        };
        System.out.println("From BiPredicateIs String's Length is grether than Len"+ checkStringLengthF.test(str1,len));
        /**
         * Function take <BiFunction
         * Takes and input of T and return another R
         */

        String str2 ="Eureka";
        Function<String,Integer> sampleFunctionF = str-> str.length();
        System.out.println("Checking the length of string using Function:: "+sampleFunctionF.apply(str2));
        //addition of two str
        Function<String,Integer> sampleFunctionF2 = sampleFunctionF.andThen(integer -> integer*integer);
        System.out.println("From Chained FunctionF ::" +sampleFunctionF2.apply("Tech"));
        /**
         * Consumer takes type T and return void, and print something
          */
        Consumer<String> consumerFunction = System.out::println; //method Reference
        consumerFunction.accept("EurekaFromConsumer");
        /**
         * Suppliers takes nothing Returns T
         */
        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());
        /**
         * Unary takes type T and return type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum ->{
            return inputNum+inputNum;

        };
        /**
         * there are three ways to write this functional interface
         * int -> return int+int
         * int -> {
         *       if-else
         *       return int+int
         *       }
         * Integer:: add(method referencing)
         */
        System.out.println("From unary Operator:: "+unaryOperatorFunction.apply(10));
        /**
         * BinaryOperator take 2 inputs of type T and Return Type T
         */
        BinaryOperator<Integer> binaryOperatorFunction = (integer,integer1) ->{
            return integer +integer1;
        };
        System.out.println("From BinaryOperator::" +binaryOperatorFunction.apply(10,20));

        /**
         * Function take <BiFunction
         * Takes and input of T/string and return another R/int
         * chaining of function
         */
        Function<String,Integer> sampleFunction1= str -> str.length();//calling it on a object level
        System.out.println("String length from sampleFunction1:: "+sampleFunction1.apply("Eureka"));
        Function<String,Integer> sampleFunction2 = String::length; //Using method reference we can call instance method on class
        System.out.println("String length from sampleFunction2:: " +sampleFunction2.apply("Eureka"));
        //chaining
        Function<String,Integer> sampleFunction3= sampleFunction2.andThen(integer -> integer*integer);
        System.out.println("the output from chaining Function::"+sampleFunction3.apply("Eureka"));
        /**
         * BiFunction takes T U R
         */
        BiFunction<String,Integer,Integer> sampleBiFunction1 =(str,integer)-> {
            return str.length()+integer;

        };
        BiFunction<String,Integer,Integer> sampleBiFunction2 = sampleBiFunction1.andThen(integer -> integer+integer);
        System.out.println("From BiFunction ::"+ sampleBiFunction2.apply("Eureka", 10));
    }




    private static void addStrings(String str2, String str3) {
        System.out.println("From req Function:: Addition of Strings(str2+str3");

    }

    private static void checkStringLength(String str1, Integer len) {
        System.out.println("From Regular BiPredicate");
        if (str1.length() > len) System.out.println("String is >than len: ");
        else System.out.println("String is <than length: ");
    }

    static void checkEvenOdd(int num) {
        System.out.println("From Regular Predicate");
         if (num % 2 == 0) System.out.println("Number is Even: ");
         else System.out.println("Number is Odd: ");
     }

}
