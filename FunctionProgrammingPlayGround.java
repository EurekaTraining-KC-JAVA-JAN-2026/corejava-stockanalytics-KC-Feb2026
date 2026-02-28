
import java.util.function.*;

public class FunctionProgrammingPlayGround {

    public static void main(String[] args) {
        Integer num = 10;
        checkEvenOdd(num);
        /**
         * take
         */
        Predicate<Integer> checkEvenOdd = integerNum -> {
            if (integerNum % 2 == 0) return true;
            else return false;
        };

        System.out.println("From predicate:" + checkEvenOdd.test(num));

        Integer len = 10;
        String str1 = "Eureka";
        checkStringLength(str1, len);
        BiPredicate<String, Integer> checkStringLength = (string, integer) -> {
            if (string.length() > integer) return true;
            else return false;
        };
        System.out.println("From BiPredicate Is string's length  is greater than len " + checkStringLength.test(str1, len));

        /**
         * takes input as T and returns another R
         */
        String str2="Eureka";
        Function<String ,Integer> sampleFunctionF=str->str.length();
        System.out.println("From Function to get the string length :"+sampleFunctionF.apply(str2));
        Function<String ,Integer> sampleFunction2=String::length;//we are calling instance method using method reference
        System.out.println("From Function using method reference : " +sampleFunction2.apply("eureka"));

        /**
         * chaining of functions
         */
        Function<String,Integer> sampleFunctionF2=sampleFunction2.andThen(integer->integer*integer);
        System.out.println("From sample function 2 : "+sampleFunctionF2.apply("tech"));

        //BiFunction
        BiFunction<String ,Integer,Integer> sampleBiFunction =(string,integer)->{
            return string.length()+integer;
        };
        BiFunction<String,Integer,Integer> sampleBiFunction2=sampleBiFunction.andThen(integer ->
                integer+integer);
        System.out.println("From Bifunction chaining function :"+sampleBiFunction2.apply("Eureka",10));



      // consumer takes T and it will print something
        Consumer<String> consumerFunction= System.out::println;//method referencing
        consumerFunction.accept("EurekaFromConsumer");
        /**
         * Suplier takes nothing returns T
         */
        Supplier<Double> supplierFunction =Math::random;;
        System.out.println(supplierFunction.get());
        /**
         * urnary takes type T and return type T
         */
        UnaryOperator<Integer> unaryOperatorFunction=inputNum->{
            return inputNum+inputNum;
        };
        System.out.println("From Unary Operator :"+unaryOperatorFunction.apply(10));

        BinaryOperator<Integer> binaryOperatorFunction=(integer,integer2)->{
            return integer+integer2;
        };
        System.out.println("From Binary Operator :"+ binaryOperatorFunction.apply(3,6));

    }


    private static void addStrings(String str2, String str3) {
        System.out.println("From Req Function::Addition of strings"+str2+str3);
    }

    private static void checkStringLength(String str1, Integer len) {
        System.out.println("From Regular(Bipredicate)");
        if(str1.length()>len) System.out.println("String length is more then len");
        else System.out.println("String length is more than len");
    }


    private static void checkEvenOdd(int num) {
        System.out.println("from regular(Predicate");
        if(num%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("ODD");
        }
    }
}
