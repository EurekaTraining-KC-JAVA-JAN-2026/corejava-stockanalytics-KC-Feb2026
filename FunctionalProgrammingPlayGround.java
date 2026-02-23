import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main (String[] args){
            /*
        Predicate, wil,take a type of T and return Boolean

         */
        // to check even or odd number
        Integer num =10;
        checkEvenOrOdd(num);
        Predicate<Integer> checkEvenOrOddF = integer -> {
            if(integer%2==0) {
                return true;
            }else{
                return false;
            }
        };
        System.out.println("From predicate check even or odd"+checkEvenOrOddF.test(num));
        /**
         * BiPredicate takes 2 input of type T,U and return a boolean
         */
        //to check the length of String
        Integer len = 10;
        String str1 = "Eureka";
        checkStringLenght(str1,len);
        BiPredicate<String,Integer> checkStringLenghtF = (str,len1)->{
            if(str1.length()< len1){
                return true;
            }else{
                return false;
            }
        };
        System.out.println("is String less than lenght 10 "+checkStringLenghtF.test(str1,len));
        /**
         * Function takes type<T,R> but return R
         * Check the length
         */

        String str2 = "Eureka";
        Function<String,Integer> sampleFunctionF =  str -> str.length();
        System.out.println("length of string using function :"+sampleFunctionF.apply(str2));
        //addition of strings
        Function<String,Integer> sampleFunction2 = sampleFunctionF.andThen(integer -> integer*integer);
        System.out.println("From chained functionF "+sampleFunction2.apply("Tech"));


        /**
         * Consumer takes type T and returns void and then print something
         */
        Consumer<String> consumerFunction = System.out::println; // method referencing
        consumerFunction.accept("EurekaFroConsumer");
        /**
         * Supplier takes nothing and returns T
         *
         */
        Supplier<Double> supplierFunction  = Math::random;
        System.out.println(supplierFunction.get());
        /**
         * Takes one argument of Type T and returns type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum -> {
            return inputNum + inputNum;
        };
        //int -> return int+int
        //int ->{
        //return int+int
        //}
        //integer::add
        /**
         *  BinaryOperator takes T and returns T
         */
        System.out.println("From unary Operator :: "+ unaryOperatorFunction.apply(10));
        BinaryOperator<Integer> binaryOperatorFunction = (integer,integer1)->
        {
            return integer+integer1;
        };
        System.out.println(binaryOperatorFunction.apply(10,20));
        /**
         * FUNCTION AND BIFUNCTION
         * Takes and input of T and returns another R
         */
        Function<String,Integer> sampleFunction01 = str->str.length();
        System.out.println("STring length of sample function01 checking eureka length: "+sampleFunction01.apply("EUREKA"));
       Function<String,Integer> sampleFunction02 = String::length;//we are calling instance method on class using
        System.out.println("string's length from method referencing :"+sampleFunction02.apply("Eureka"));
        //chaining
        Function<String,Integer> sampleFunction03 = sampleFunction02.andThen(integer -> integer*integer);
        System.out.println("The output from chaining Functions :" +sampleFunction03.apply("Eureka"));

        /**
         * BiFunction
         */
    BiFunction<String,Integer,Integer> sampleBiFunction01 = (str,integer)->{
        return str.length() + integer;
    };
    BiFunction<String,Integer,Integer> sampleBiFunction02 = sampleBiFunction01.andThen(integer -> integer+integer) ;
        System.out.println("from bifunction :: using chaining of functions : " +sampleBiFunction02.apply("Eureka",10));
    }


    //for biPredicate
    private static void checkStringLenght(String str1, Integer len) {
        if(str1.length()< len){
            System.out.println("String is is less than: "+len);
        }else{
            System.out.println("String is more then :"+len);
        }
    }

    private static void checkEvenOrOdd(int num) {
        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
}
