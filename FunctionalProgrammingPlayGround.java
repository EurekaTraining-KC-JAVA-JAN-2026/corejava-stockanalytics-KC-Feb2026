import java.sql.PreparedStatement;
import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    static void main(String[] args) {


        /*
    predicate,will take a type of T and return Boolean
     */

        // to check a number even or odd number
        Integer num=10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenOROdd = integerNum ->{
            if(integerNum%2==0)return true;
            else return false;
        };
        System.out.println("FROM predicate IF num is even or odd"+checkEvenOROdd.test(num));
        /**
         * BiPredicate takes 2 inputs of Type T and U and return
         */

        // to chcek the length of a string
        Integer len=10;
        String str1="Eureka";
        checkStringLenth(str1,len);
        BiPredicate<String,Integer> checkStringLengthF= (string,integer)->{
            if(string.length()>integer) return false;
            else return true;
        };
        System.out.println("is string length is grater than len "+checkStringLengthF.test(str1,len));


        /**
         * comsumer takes type T and return void and print something
         */
        Consumer<String> consumerFunction =System.out::println;  // method referncing
        consumerFunction.accept("Eureka from consumer");
        /**
         * supplier takes noting Returns T
         * ***************************************
         */
        Supplier<Double> supplierFunction=Math::random;
        System.out.println(supplierFunction.get());
        /**
         * unary takes type T and return type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum->{
            return inputNum+inputNum;
        };

        /**
         * int-> return int+int
         * int->{
         * if-else
         * return int+int
         * }
         * Integer::add
         */
        System.out.println("From unary operator"+unaryOperatorFunction.apply(10));

        /**
         * Binary operator takes T and T returns T
         */


        BinaryOperator<Integer> binaryOperatorFunction= (integer,integer1)->{
            return integer+integer1;
        };
        System.out.println("FROM BinaryOperator:: "+binaryOperatorFunction.apply(10,20));

        /**
         * FUNCTION AND BI FUNCTION
         * takes and input of T// string and returns another  R//int
         * chaining of function
         */
        Function<String,Integer> sampleFunction01 = str->str.length();
        System.out.println("string length from sampleFunction01 checking eueaka length"+sampleFunction01.apply("tech"));
        Function<String,Integer> sampleFunction02 =String::length;//we can are calling instance method on class using
        System.out.println("String's length from methods refrerening:"+sampleFunction02.apply("Eureka"));

        //chaining
        Function<String,Integer> sampleFunction03=sampleFunction02.andThen(integer->integer*integer);
        System.out.println("the output from chaining Functions:"+sampleFunction03.apply("Eureka"));
        /**
         * BIFUNCTION
         */
        BiFunction<String,Integer,Integer> sampleBiFunction01= (str,integer)->{
            return str.length()+integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02= sampleBiFunction01.andThen(integer->integer+integer);
            System.out.println("the output from BiFunction:: using chaining of functions:" + sampleBiFunction02.apply("Eureka", 10));
        }





    private static void addStrings(String str2, String str3) {

        System.out.println("From Req Function:: Addition of strings"+str2+str3);

    }

    private static void checkStringLenth(String str1, Integer len) {
        System.out.println("for regular(Bipredicate)");
        if(str1.length()>len) System.out.println("string is > than len");
        else System.out.println("string is < than len");

    }

    //for predicate
    private static void checkEvenOdd(int num) {
        System.out.println("for regular(predicate)");
   if(num%2==0) System.out.println("it is Even");
    else System.out.println("it is odd");
    }

}
