public class Eureka {
    public static void main(String[] args) {
        System.out.println("Eureka Trainings");
        //primitive
        int i; //declaration
        i=10; //assigning
        int j=20;

        //here we are using parameterized
        Stock apple=new Stock("BAD",2255768,16.25);
        Stock google=new Stock("CAD",456789,19.25,345,24);
        System.out.println(apple);
        System.out.println(google);

        Stock appleStock=new Stock();
        appleStock.setTickerSymbol("APPL");
        appleStock.setSectorId(-23);
        appleStock.setMarketCap(22334455);
        appleStock.setSubsectorID(123);
        appleStock.setCurrentRatio(23.65);


        System.out.println("Value of i="+i);
        System.out.println("Value of j="+j);
        //float
        float f1=34.22f;
        System.out.println("hashCode of f1 is: "+System.identityHashCode(f1));
        floatAddition();
        //double
        double d1=23.445;
        double d2=55.675;
        double c= addDoubleNumbers(d1,d2);
        System.out.println( "double addition is "+c);
        //calling Method
        //boolean
        boolean b1=true;
        b1=false;
        System.out.println(b1);
        //long
        long l1=1234563;
        long l2=3456789;
        System.out.println("value of longs is l1:"+l1+"  l2:"+l2);
        char c1='J';
        //non-primitive
        String s2= new String("Tech");


    }

    private static double addDoubleNumbers(double a, double b) {
        return a+b;
        /*System.out.println("Sum of 2 doubles is:"+(a+b));*/

    }

    //class name Eureka
    //variable ==>stringName
    //methods==> floatAddition
    private static void floatAddition() {
        float f1=12.36f;
        float f2=24.36f;
        System.out.println("Sum of 2 Floats is:"+(f1+f2));
    }
}
