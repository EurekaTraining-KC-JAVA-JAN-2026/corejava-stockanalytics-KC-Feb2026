import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {
        /*
        predicate , will take a type of T and return Boolean
         */
        // to check number even or odd number
        int num =10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenOROdd = integerNum -> {
            if(integerNum%2 ==0) return true;
            else return false;
        };
        System.out.println("From predicate if num is even or odd"+checkEvenOROdd.test(num));
        /*
        BiPredicate takes 2 inputs of type T<u and return boolean
         */
        //to check the length of a string
        Integer len = 10;
        String str1 = "Eureka";
        checkStringlength(str1,len);
        BiPredicate<String,Integer> checkStringLengthF = (string, integer) ->{
            if (string.length() > integer) return false;
            else return true;
        };
        System.out.println("FROM BiPredicate,Is String's length is greater than Len "+checkStringLengthF.test(str1,len));
        /**
         * consumer takes type T and return void, and print something
         */
        Consumer<String> consumerFunction = System.out::println;// method referencing
        consumerFunction.accept("EurekaFromConsumer");
        /**
         * suplier takes nothing Returns T
         * **************************************
         */
        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());
        /**
         * unary takes type T and return type T

         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum->{
            return inputNum+inputNum;
        };
        /**
         * int -> return int+int
         * int ->{
         *     if-else
         *     return int+int
         * }
         * Integer::add
         */
        System.out.println("FROM Unary Operator ::"+unaryOperatorFunction.apply(10));
        /**
         * Binary operator takes T and Treturns T
         */
        BinaryOperator<Integer> binaryOperatorFunction = (integer,integer1)->{
            return integer+integer1;
        };
        System.out.println("FROM binaryOperator::" + binaryOperatorFunction.apply(12,35));
        /**
         * FUNCTION AND BIFUNCTION
         * takes and input of T//string and returns another R//int
         * chaining of functions
         */
        Function<String,Integer> sampleFunction01 = str->str.length();
        System.out.println("String length from sampleFunction01 checking Eureka's length:"+sampleFunction01.apply("EUREKA"));
        Function<String,Integer> sampleFunction02 = String::length;// we are calling instance method on class using method referencing
        System.out.println("String's length from method referencing :"+sampleFunction02.apply("EUREKA"));
        //chaining
        Function<String,Integer> sampleFunction03 = sampleFunction02.andThen(integer -> integer*integer);
        System.out.println("The output from chaining Functions :"+sampleFunction03.apply("EUREKA"));


        /**
         * BIFUNCTION
         */
        BiFunction<String,Integer,Integer> sampleBiFunction01 = (str,integer)->{
            return  str.length() + integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02 = sampleBiFunction01.andThen(integer -> integer+integer);
        System.out.println("FROM Bifunction :: using chaining of functions :" +sampleBiFunction02.apply("EUREKA",10));
    }

    //for BiPredicate
    private static void checkStringlength(String str1, Integer len) {
        System.out.println("For Regular(Predicate)");
        if(str1.length() > len) System.out.println("String is > than len");
        else System.out.println("String is <than len");
    }

    // for predicate
    private static void checkEvenOdd(int num) {
        System.out.println("For Regular(BiPredicate");
        if (num%2 == 0) System.out.println("It is even");
        else System.out.println("it is odd");
    }
}