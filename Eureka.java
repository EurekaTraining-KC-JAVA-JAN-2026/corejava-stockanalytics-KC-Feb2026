import javax.xml.transform.Source;

public class Eureka {
    public static void main(String[] args) {
       // System.out.println("Welcome Eureka..!");
        int i=10;
        int j=20;
        //System.out.println("value of i :" +i);
        //System.out.println("value of j :" +j);
        float f1=23.4f;
        System.out.println("hashcode value"+System.identityHashCode(f1));
        float f2=73.24f;
        floatAdd();
        getFloadAdd(f1,f2);
        double d1=44.7;
        double d2=12.77;
        //System.out.println("Multiplication of  :" +(d1*d2));
        boolean b1=true;
         b1=false;
        //System.out.println("checking  :" +b1);

      Stock airbnbStock=new Stock(4.5,6577,56,56,"ABNB");
      Stock googStock=new Stock(2.5,255675,24,25,"Goog");
      Stock nvdaStock=new Stock(5,78,35);
        System.out.println(airbnbStock);
        Stock appleStock=new Stock();
        appleStock.setTicker_symbol("AAPL");
        appleStock.market_cap=229865;
        appleStock.setSectorId(-23);
        System.out.println(appleStock.getTicker_symbol() + " "+ appleStock.getSectorId());


        //non-primitave datatypes
       // methods are used for code reuseablility

    }

    /**
     * this will return float
     * @param f1
     * @param f2
     * @return
     */
    private static float getFloadAdd(float f1,float f2) {
       return f1+f2;
    }

    private static void floatAdd() {
        float f1=22.4f;
        float f2=73.24f;
        //System.out.println("sum of :" +(f1+f2));
    }
   //statics:




}

