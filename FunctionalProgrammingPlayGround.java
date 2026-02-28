import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {
        Integer num = 10;

        // Lambda function to check even or odd
        Predicate<Integer> checkEvenOdd = integerNum -> {
            if (integerNum % 2 == 0)
                return true;
            else
                return false;
        };

        System.out.println(checkEvenOdd.test(num));

        // Using predicate
        if (checkEvenOdd.test(num)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        checkStringLength("MAhesh",10);

        BiPredicate<String, Integer> checkStringLength = (str, len)->{
            if (str.length() > len) return true;
            else return false;
        };

        System.out.println("string length is "+checkStringLength.test("mahesh", 10));

        String str2 ="Eureka";
        String str3 =" Tech";
        addStrings(str2,str3);

        Function<String, Integer> getlengthF = (str) -> str.length();

        System.out.println("get the length of string using function"+getlengthF.apply(str2));



        /**
         * consumer takes type T and return void, print something
         */

        Consumer<Integer> consumerFunction = System.out::println;
        consumerFunction.accept(1000);


        Supplier<Double> supplierFunction = Math::random;
//        supplierFunction.get();

        System.out.println(supplierFunction.get());


        /**
         * unary takes type T and return type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum ->{
            return inputNum+inputNum;
        };

        System.out.println("From unary operator :: " + unaryOperatorFunction.apply(10));

        BinaryOperator<String> binaryOperatoFunction = (input1,input2)-> input1+input2;

        System.out.println("From binary operator :: "+ binaryOperatoFunction.apply("sai", " mahesh"));


        /*
        *
        * function and bifunction
        * takes input of T and returns another R
         */
        Function<String, Integer> sampleFucntion1  = str->str.length();
        System.out.println( " string length from sampleFunction1 checking eureka's length: "+ sampleFucntion1.apply("mahesh"));

        Function<String, Integer> sampleFunction2 = String::length;

        System.out.println("String's length from method referencing :"+ sampleFunction2.apply("Eureka"));

        Function<String, Integer> sampleFunction3 = sampleFunction2.andThen(integer -> integer * integer);

        System.out.println("the output from chaining functions : "+ sampleFunction3.apply("Technologies"));

    BiFunction<String,String,Integer> biFunction=(str5,str6)->{
        return str5.length()+str6.length();
    };
        /**
         * BiFunction
         */
        BiFunction<String, Integer, Integer> sampleBifunction1 = (str, integer)->{
          return str.length()+integer;
        };
//        biFunction.andThen(biFunction.apply("Mahesh","Potharla")));




        BiFunction<String, Integer, Integer> sampleBiFunction2 = sampleBifunction1.andThen(integer -> integer+integer);

        System.out.println("From Bifunction :: using chaining of functions"+ sampleBiFunction2.apply("Eureka",10));




    }

    private static void addStrings(String str1, String str2){
        System.out.println( str1+str2);
    }
//

    private static void checkStringLength(String str1, Integer len) {
        if (str1.length() > len) System.out.println("String len is greater than len");
        else System.out.println("len is less < than lem");
    }
}


