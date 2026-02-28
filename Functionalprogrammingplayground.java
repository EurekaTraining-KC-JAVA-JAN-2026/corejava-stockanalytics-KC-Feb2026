import java.util.function.*;

public class Functionalprogrammingplayground {
    public static void main(String[] args) {

        // predicate will take a type of t and return boolean
        //to check even or odd
        Integer num = 10;
        checkeven(num);
        Predicate<Integer> checkeven = integernum -> {
            if (integernum % 2 == 0) return true;
            else return false;
        };
        System.out.println("from predicate if num ids even or odd"+checkeven.test(num));
    //to chech the length of a string
        Integer leng =10;
        String str1= "Eurek";
        checkstringlength(str1,leng);
        BiPredicate<String, Integer> checkstringlength =  ( string, integer)
 ->{
            if(string.length()> integer) return false;
            else return true;

        }   ;
   //function takes type <t ,r> and return r
        //addition of strings
   String str11= "Eureka";
   String str12="tech";
   addstring(str11,str12);
//        Function<String ,String> addstring=
   //chech the length
//        String str22 ="Eureka";
//        Function<String , Integer> samplefunctionf = str -> str.length();
//        System.out.println("checking the length of string using function ::" +samplefunctionf .apply(str22));
//   Function<String , Integer> samplefunctionf = samplefunctionf .addThen(integer -> integer*integer );
  //consumer takes type t and void and print something
        Consumer<String> consumerfunction = System.out::println; ///method refrenecing
        consumerfunction.accept("Eurekaconsumer");
        /*
        suplier tries nothing return T
        whenevr they want somthing random like random numbers we can call supplier methods
         */
        Supplier<Double> doubleSupplier=Math::random;
        System.out.println(doubleSupplier.get());
    /*
    unary takes types t and return type t
     */
        UnaryOperator<Integer> unaryOperatorfunction = inputnum->{
            return inputnum+inputnum;
        };
        System.out.println("from unary operator ::"+unaryOperatorfunction.apply(10));
    /*
    Binaryoperator takes t and t return t
     */
        BinaryOperator<Integer> binaryOperatorfunction = (integer ,integer1)->{
            return integer+integer1;
        };
        binaryOperatorfunction.apply(10,20);
    /*
    function and bifunction
    takes and input t and return another r
    chaining of function
     */
        Function<String,Integer> sampleFunction01 = str->str.length();
        System.out.println("string length from samplefunction01:" +sampleFunction01.apply("eurek"));
    Function<String,Integer> sampleFunction02 = String::length;//we r calling instance method on class using method referencing
        System.out.println("string length from methods referenes:"+sampleFunction02 .apply("Eureka"));
        Function<String , Integer> sampleFunction03 = sampleFunction02.andThen(integer -> integer*integer);
        System.out.println("the output function" +sampleFunction03.apply("eureka"));

        /*
        Bifunction
         */
        BiFunction<String ,Integer,Integer> sampleFunction011= (str,integer)->{
            return str1.length() + integer;
        };
        BiFunction<String,Integer,Integer> sampleFunction012= sampleFunction011.andThen(integer ->integer*integer);
//        System.out.println(+sampleFunction012.apply("sample using cheching of function\"" +sampleFunction012.apply("eureka",10));


    }

    private static void addstring(String str11, String str12) {
        System.out.println("from req function" +str11+str12);
    }

    private static void checkstringlength(String str1, Integer leng) {
        System.out.println("for regular pedicate");
        if(str1.length() > leng ) System.out.println("string is > num length");
        else  System.out.println("string is <  num length");

    }

    static void checkeven(int num) {
        if(num%2==0) System.out.println("if even");
           else System.out.println("is odd");
        }



}


