import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class FunctionalProgrammingPlayGround {

    public static void main(String[] args) {
      /*
      predicate will take type t and return boolean,
     check num is even or odd number 
       */
        int num =10;
        checkEvenOdd(num);

        Predicate<Integer>  checkEvenOrOdd = integerNum-> {
            if(integerNum%2 == 0) return true;
            else return false;
        };
        System.out.println("from prerdicate if num is even or odd:"+checkEvenOrOdd.test(num));
//in service layer we write these when it come sto microservices

        /**
         * for true or false
         * bipredicate takes 2 inputs of types t, v and return boolean
         *
         */
        //to check length of string 
        Integer len =10;
        String str1 = "Eureka";
        checkStringLength(str1, len);
        BiPredicate<String,Integer> checkStringLengthF =(string,integer)->{
            if(string.length()>integer)return false;
            else return true;
        };
        System.out.println("from bipredicate,string length is greater than length:"+checkStringLengthF.test(str1,len));


        /**
         * function takes<t,r> and returns r
         * Check length
         */
        String str2 ="Eureka";
        Function<String,Integer> sampleFunctionF = str->str.length();
        System.out.println("checking length of string using function:"+sampleFunctionF.apply(str2));

        //add of strings using function
        Function<String,Integer> sampleFunction2 = sampleFunctionF.andThen(integer -> integer+integer);
        System.out.println("from chained functions::"+sampleFunction2);

        /**
         * consumer takes type t and returns void, and print something
         * sout with :: here is a function
         */
        Consumer<String> consumerFunction = System.out::println;//:: this method referencing
        System.out.println("Eureka from consumer ");

        /**
         * Supplier takes nothing  returns Type T ***********************
         */
        Supplier<Double> supplierFunction = Math::random;
        System.out.println(supplierFunction.get());

        /**
         * unary takes type T and returns type T
         */
        UnaryOperator<Integer> unaryOperatorFunction = inputNum->{
            return  inputNum+inputNum;
        };
        System.out.println("From unary operator ::"+unaryOperatorFunction.apply(18));

        /**
         * 1st way of function progrm===int -> return int+int
         * 2nd way == int ->{
         *       return int+int ;
         * }
         * 3rd == integer::add
         */

        /**
         * binary operator takes t and t returns T
         */
        //should not pass keyword int
        BinaryOperator<Integer> binaryOperatorFunction = (integer, integer1) -> {
           return integer+integer1;
        };
        System.out.println("From Binary operator:"+binaryOperatorFunction.apply(5,10));

        /**
         * Function And Bifunction
         * takes and input of T//string  and returns another R//Int
         */
        //here we are calling method on object (instance method)
        Function<String,Integer> sampleFunction1 = str->str.length();
        System.out.println("String length from sampleFunction1 checking eureka length:"+sampleFunction1.apply("Eureka"));

        Function<String,Integer> sampleFunction3 =String::length;//calling instance method on class here using ::method reference
        System.out.println("String's length froom method referencing:"+sampleFunction3.apply("Eureka"));
        //chaining method
        Function<String,Integer> sampleFunction4 = sampleFunction3.andThen(integer -> integer*integer);
        System.out.println("the output from chaining function:"+sampleFunction4.apply("Eureka"));

        /**
         * bi function  it takes 3 parameters t,u ,r
         */
        BiFunction<String,Integer,Integer> sampleBiFunction01 = (str,integer)->{
            return str.length() +integer;//16
        };
        BiFunction<String,Integer,Integer> sampleBiFunction02 = sampleBiFunction01.andThen(integer -> integer+integer);//16+16
        System.out.println("From Bifunction :: using chaining of function:"+sampleBiFunction02.apply("Eureka",10));//32
    }



    private static void addStrings(String str2, String str3) {
        System.out.println("adding 2 Strings from reg func "+str2+str3);
    }

    private static void checkStringLength(String str1, Integer len) {
       if(str1.length() > len) System.out.println("string is less than");
       else System.out.println("greater");
    }

    //regular for checkingg  we r creating method calling it and doing performing logic operations
    private static void checkEvenOdd(int num) {
        if(num%2 == 0) System.out.println("even");
        else System.out.println("odd");

    }



}
