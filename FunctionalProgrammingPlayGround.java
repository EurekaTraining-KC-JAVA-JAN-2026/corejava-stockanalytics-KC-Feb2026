import java.util.function.*;

import static jdk.jfr.internal.StringPool.addString;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {
        /*
        Predicate, will take a type of T and return Boolean
         */
        //to check even or odd number
        int num=10;
        checkEvenOdd(num);
        Predicate<Integer> checkEvenOROdd = integerNum -> {
            if(integerNum%2==0) return true;
            else return false;
        };
        System.out.println("From predicate if num is even or odd "+checkEvenOROdd.test(num));
        /**
         * Bi predicate takes 2 params
         * to check the lenth of the string
         */
        Integer len=10;
        String str1="Eureka";
        CheckStringlength(str1, len);
        BiPredicate<String,Integer> checkStringLengthf =( string,integer) ->{
            if(string.length()>integer) return true;
            else return false;

        };
        System.out.println("from Bi predicate ,Is Strings length is greater than len "+checkStringLengthf.test(str1,len));

        /**
         * *Function takes <T,R> and returns R
         * *Additiom of strings
         */
        String str2="Eureka";
        String str3= " Tech";
        //addString(str2,str3);

         /**
         * *Consumer takes type T and return void
         */
        Consumer<String> consumerFunction= System.out::println; //Method referencing
        consumerFunction.accept("EurekaFromConsumer");
        /**supplier takes nothing returns**/
        Supplier<Double> supplierFunction =Math::random;
        System.out.println(supplierFunction.get());
        /**
         * unary takes type T and return type T
         */
        UnaryOperator<Integer> unaryOperatorFucntion= inputNum->{
            return inputNum+inputNum;
        };
        System.out.println("From unary Operator :: "+unaryOperatorFucntion.apply(10));
        /**
         * Binary operator takes T and T returns T
         * **/
        BinaryOperator<Integer> binaryOperatorFunction=(integer,integer1)->
        {
            return integer+integer1;
        };
        System.out.println("From Binaru Operator :: "+binaryOperatorFunction.apply(10,20));
        /**
         * FUNCTION and BIFUNCTION
         * takes and input of T and returns another R
         */
        Function<String,Integer> sampleFucntion1= str->str.length();
        System.out.println("checking the length of string using Function :: "+sampleFucntion1.apply("Eureka"));
        Function<String,Integer> sampleFunction2= String::length;
        System.out.println("Strings length from method referencing :: "+sampleFunction2.apply("Eureka"));
        //chaining
        Function<String,Integer> sampleFunction3= sampleFunction2.andThen(integer -> integer+integer);
        System.out.println("the output from chaining functions: " +sampleFunction3.apply("Eureka"));

        /**BIFUNCTION**/
        BiFunction<String,Integer,Integer> sampleBiFunction01= (str,integer)->{
            return str.length() +integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02=sampleBiFunction01.andThen(integer -> integer+integer );
        System.out.println("FROM BiFunction :: using chaining of functions : ");



    }



    //forbipredicate
    private static void CheckStringlength(String str1, Integer len) {
        if(str1.length()>len) System.out.println("String is greater than len");
        else System.out.println("String is < than len");
    }
    //for predicate
    private static void checkEvenOdd(int num) {
        if(num%2==0) System.out.println("It is even");
        else System.out.println("Its an Odd");
    }


}
