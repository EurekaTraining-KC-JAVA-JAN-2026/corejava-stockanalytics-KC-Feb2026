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
        /**
         * BiPrdicate takes 2 inputs of type T,U and return boolean
         *
         */
        //to check the length of a string
        Integer len = 10;
        String str1 = "Eureka";
        checkStringLength(str1,len);
        BiPredicate<String,Integer> checkStringLengthF =(String, integer) -> {
            if(String.length() > integer) return false;
            else return true;
        };
        System.out.println(" From BipredicateIs string's length is greater than len " +checkStringLengthF.test(str1,len));
       // /**
        // * Functions takes <T,R> and returns R
       //  * check the length
        // *
         //*/
       // String str2 ="Eureka";
       // Function<String,Integer> sampleFunctionF = str->str.length();
        //System.out.println("checking the length of string using function :: "+sampleFunctionF.apply(str2));
       //addition of strings
       // Function<String,Integer> sampleFunctionF2 = sampleFunctionF.andThen(integer -> integer*integer);
        //System.out.println("From chained functionsF::"+sampleFunctionF2.apply("tech"));
        /**
         * consumer takes type T and return void and print something
         *
         */
        Consumer<String> consumerFunction = System.out::println;//method refernecing
        consumerFunction.accept("EurekaFromConsumer");
        /**
         * Suplier takes nothing returns T
         * ***************************************
         */
        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());
        /**
         * Unary takes type T and return type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum-> {
            return inputNum+inputNum;
        };
        /**
         * int -> return int+int
         * int ->{
         *       if -else
         *       return int+int
         *     }
         *       integer::add
         */
        System.out.println("From unary Operator ::"+unaryOperatorFunction.apply(10));
        /**
         * BinaryOPerator  takes T and T returns T
         */
        BinaryOperator<Integer> binaryOperatorFunction = (integer, integer2) -> {
            return integer+integer2;

        };
        System.out.println("From binary operator ::"+binaryOperatorFunction.apply(12,35));
        /**
         * ===============================================
         * Function and BIfunctin
         * takes and input of T and returns another R//int
         * chainging of function
         */
        Function<String,Integer> sampleFunction01 = str->str.length();
        System.out.println("string length from sampleFunction01 :"+sampleFunction01.apply("netra"));
        Function<String,Integer> sampleFunction02 =String::length;//We are calling instance method on class using method reference
        System.out.println("string's length from method referencing :"+sampleFunction02.apply("netra"));
        //chaining
        Function<String,Integer> sampleFunction03 = sampleFunction02.andThen(integer -> integer*integer);
        System.out.println("The output from chaining Function:"+sampleFunction03.apply("netra"));

        /**
         * BIFUNCTION
         */
        BiFunction<String,Integer,Integer> sampleBiFunction01 = (str,integer)->{
            return str.length() +integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02 = sampleBiFunction01.andThen(integer -> integer);
        System.out.println("FromBifunction :: using chaining of function" +sampleBiFunction02.apply("netra",20));
    }

    private static void addString(String str2, String str3) {
        System.out.println("From req Function :: Addition of String" +str2+str3);
    }


    private static void checkStringLength(String str1, Integer len) {
        System.out.println("for regualr(bi predicate");
        if(str1.length() > len) System.out.println("string is  >than len");
        else System.out.println("string is < than len");
    }

    // for predicate
    private static void checkEvenOdd(int num) {
        System.out.println("for regular(predicate");
        if (num%2 == 0) System.out.println("It is even");
        else System.out.println("it is odd");
    }

}
