public class Eureka {
    public static void main(String[] args) {
        System.out.println("Welcome Eureka..!");
        int i=10;
        int j=20;
        System.out.println("value of i :" +i);
        System.out.println("value of j :" +j);
        float f1=22.4f;
        float f2=73.24f;
        floatAdd();
        getFloadAdd(f1,f2);
        double d1=44.7;
        double d2=12.77;
        System.out.println("Multiplication of  :" +(d1*d2));
        boolean b1=true;
         b1=false;
        System.out.println("checking  :" +b1);

        //non-primitave datatypes
       // methods are used for code reuseablility

    }

    private static float getFloadAdd(float f1,float f2) {
       return f1+f2;
    }

    private static void floatAdd() {
        float f1=22.4f;
        float f2=73.24f;
        System.out.println("sum of :" +(f1+f2));
    }

}

