import java.util.function.*;

public class FunctionalProgrammingPlayGround {
    public static void main(String[] args) {
//        String s1 = new String("Eureka");
        /*
        Predicate will take a type T and return boolean
         */
        // to check a number even or odd number
        Integer num = 10;
//        checkEvenOdd(num);
        Predicate<Integer> checkEvenOrOdd = integerNum -> {
            if(integerNum % 2 == 0) return true;
            else return false;
        };
        System.out.println("From predicate if num is even or odd " + checkEvenOrOdd.test(num) );
        /*
        Bi Predicate takes 2 inputs of type T,U and return boolean
         */
        Integer len = 10;
        String str1 = "Eureka";
//        checkStringLength(str1, len);
        BiPredicate<String,Integer> checkStringLengthF = (string, integer) ->{
        if(string.length() > integer) return false;
        else return true;
        };
        System.out.println("From Bipredicate, Is string length longer than given length " +checkStringLengthF.test(str1,len));

        /*
        Function takes <T,R> and returns R
        Check the length
         */
        String str2 = "Eureka";
        String str3 = " Tech";
//        addStrings(str2,str3);
        Function<String,Integer> sampleFunctionF = str -> str.length();
        System.out.println("Checking the length of String using Function :: " +sampleFunctionF.apply(str2));
        //addition of strings
        /**
         *  Consumer takes type T and returns void, and prints something
         */
        Consumer<String> consumerFunction = System.out::println; //Method referencing
        consumerFunction.accept("Eureka From Consumer");
        /**
         * Supplier takes nothing returns type T
         */
        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());
        /**
         *  unary takes type T and returns type T
         */
        UnaryOperator<Integer> unaryOperatorFunctionF = inputNum -> {
            return inputNum+inputNum;
        };
        System.out.println("From Unary Opertaor::" +unaryOperatorFunctionF.apply(10));

        /**
         *  BinaryOperator takes T and T return T
         */
        BinaryOperator<Integer> binaryOperatorFunction = (integer, integer1) ->{
            return integer+integer1;
        };
        System.out.println("From Binary Operator :: " +binaryOperatorFunction.apply(10,20));



        //-----------------------------------
        /**
         * Function and BiFunction takes input type T and returns R
         */
        Function<String,Integer> sampleFunction1 = str -> str.length();
        System.out.println("String length from samplefunction1 checking length:: "+sampleFunction1.apply("Eureka"));
        Function<String,Integer> sampleFunction2 = String::length;
        System.out.println("String length from samplefunction2 checking length:: "+sampleFunction2.apply("Eureka"));

        //chaining
        Function<String,Integer> sampleFunction3 = sampleFunction2.andThen(integer -> integer+integer);
        System.out.println("The output from chaining functions: " +sampleFunction3.apply("Eureka"));

        /**
         * BiFunction
         */
        BiFunction<String,Integer,Integer> sampleBiFunctions1 = (str,integer) ->{
            return str.length() + integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction2 = sampleBiFunctions1.andThen(integer -> integer + integer);
        System.out.println("From Bifunction :: using chaining: "+sampleBiFunction2.apply("Eureka",10));

    }

    private static void addStrings(String str2, String str3) {
        System.out.println("From function :: Concatenation of Strings " +str2+str3);
    }

    private static void checkStringLength(String str1, Integer len) {
        if(str1.length() > len) System.out.println("string is shorter than length");
        else System.out.println("string is longer than length");
    }

    static void checkEvenOdd(int num) {
        if(num%2 == 0){
            System.out.println("Number is even");
        }
        else System.out.println("Numbe ris odd");;
    }


}
