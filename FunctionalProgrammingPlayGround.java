import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {
        /*
        Predicate will take type T & returns Boolean
        Ex: Checking Even or odd
         */

        Integer num = 10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenORodd = integerNum -> {
            if (integerNum % 2 == 0) return true;
            else return false;
        };
        System.out.println("From Predicate:" + checkEvenORodd.test(num));

    /*
    BiPreditave will take 2 Input types T & returns Boolean
     */
        Integer len = 10;
        String str1 = "Eureka";
        checkStringLength(str1, len);
        BiPredicate<String,Integer> checkStringLengthF =(string,integer)->{
            if(string.length()> integer) return false;
            else return true;
        };
        System.out.println("From BiPredicate :String length >" +checkStringLengthF.test(str1,len));

//        /*
//        Function takes<T,R> returns R
//        Ex: Checking Length
//         */
//        String str2 ="Eureka";
//        Function<String,Integer> sampleFunctionF = str->str.length();
//        System.out.println("Checking length:"+sampleFunctionF.apply(str2));
//
//        Function<String,Integer> sampleFunctionF2 = sampleFunctionF.andThen(integer -> integer*integer);
//        System.out.println("From Chained FunctionsF:"+sampleFunctionF2.apply("Tech"));

        /*
        Consumer takes type T and return Void
         */
        Consumer<String> consumerFunction = System.out::println;//Syntax is Called MethodReferencing
        consumerFunction.accept("EurekaFromConsumer");

        /*
        Supplier takes Nothing & Returns type T
         */
        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());

        /*
        Unary takes Types T and return type T
         */

        UnaryOperator<Integer> unaryOperatorFunction = inputNum ->{
            return inputNum+inputNum;
        };

        /*

         */
        System.out.println("From Unary Operation::" +unaryOperatorFunction.apply(10));

        /*
        Binary Operator
         */

        BinaryOperator<Integer> binaryOperatorFunction =(integer,integer1)->{
            return integer+integer1;
        };
        System.out.println("from Binary::"+binaryOperatorFunction.apply(20,30));



        //====================
        /*
        Functions & BiFunctions
        takes input of T(String) and returns R(Integer)
         */
        Function<String,Integer> sampleFunction01 =str->str.length();
        System.out.println("String length from Sample Function01:"+sampleFunction01.apply("Eureka"));

        Function<String,Integer> sampleFunction02 = String::length;//Using Method Reference
        System.out.println("String's length from method referencing:" +sampleFunction02.apply("Eureka"));

        //Chaining
        Function<String,Integer> sampleFunction03 = sampleFunction02.andThen(integer -> integer*integer);
        System.out.println("Output from Chaining:" +sampleFunction02.apply("Eureka"));

        /*
        BiFunction
         */
        BiFunction<String,Integer,Integer> sampleBiFunction01 = (str,integer)->{
            return str.length()+integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02 = sampleBiFunction01.andThen(integer -> integer+integer);
        System.out.println("From BiFunction:Using Chain of Functions"+sampleBiFunction02.apply("Eureka",10));




    }

    private static void addStrings(String str2, String str3) {
        System.out.println("Addition of Strings:" +str2+str3);
    }

    //For BiPredicate
    private static void checkStringLength(String str1, Integer len) {

        if(str1.length()>len) System.out.println("String is >");
        else System.out.println("String is <");
    }

//For Predicate
    static void checkEvenOdd(int num) {
        if (num%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
